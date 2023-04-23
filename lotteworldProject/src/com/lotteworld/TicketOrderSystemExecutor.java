package com.lotteworld;

import java.util.ArrayList;
import java.util.List;

import com.lotteworld.business.TicketCalculator;
import com.lotteworld.business.TicketOrderAction;
import com.lotteworld.dto.TicketOrderDto;
import com.lotteworld.dto.TicketSummaryDto;
import com.lotteworld.util.PreferentialItemEnum;
import com.lotteworld.util.StringUtil;
import com.lotteworld.util.TicketConstants;
import com.lotteworld.util.TicketPriceEnum;
import com.lotteworld.view.GuideMsgPrint;
import com.lotteworld.view.OrderSummaryPrint;

public class TicketOrderSystemExecutor {

    public static void main(String[] args) {
        // 한줄로 줄여서 사용
        new TicketOrderSystemExecutor().execute();
    }

    private void execute() {
        // 티켓주문목록 가져오기
        List<TicketOrderDto> orderList = getTicketOrderList();

        // 주문요약 정보목록을 가져온다.
        List<TicketSummaryDto> summaryList = getOrderSummaryList(orderList);

        // 최종 영수증을 출력한다.
        printFinalReceipt(summaryList);

        // 티켓주문 종료메시지를 출력한다.
        GuideMsgPrint.close();
    }

    /**
     * 누적된 티켓주문 목록 가져오기
     * 
     * @return
     */
    private List<TicketOrderDto> getTicketOrderList() {
        List<TicketOrderDto> orderList = new ArrayList<TicketOrderDto>();

        while (true) {
            TicketOrderDto dto = null;
            dto = inputOrderAction();
            orderList.add(dto);
            if (dto.getRetry() == TicketConstants.RETRY_NO) {
                break;
            }
        }
        return orderList;
    }

    /**
     * 건별 티켓주문 입력받기
     * 
     * @return
     */
    private TicketOrderDto inputOrderAction() {
        TicketOrderAction action = new TicketOrderAction();

        TicketOrderDto dto = new TicketOrderDto();
        dto.setTicketType(action.getTicketType());
        dto.setJuminNum(action.getJuminNum());
        dto.setBuyCount(action.getBuyCount());
        dto.setPreferentialItem(action.getPreferentialItem());
        dto.setRetry(action.getRetry());

        return dto;
    }

    /**
     * 주문요약 정보목록을 가져온다.
     * 
     * @param orderList
     */
    private List<TicketSummaryDto> getOrderSummaryList(List<TicketOrderDto> orderList) {
        List<TicketSummaryDto> summaryList = new ArrayList<TicketSummaryDto>();
        for (TicketOrderDto dto : orderList) {
            summaryList.add(makeOrderSummary(dto));
        }
        return summaryList;
    }

    /**
     * 주문요약 정보를 생성한다.
     * 
     * @param dto
     */
    private TicketSummaryDto makeOrderSummary(TicketOrderDto dto) {
        TicketCalculator cal = new TicketCalculator();

        String ticketTypeName = "";
        if (dto.getTicketType() == TicketConstants.TICKET_TYPE_ALLDAY)
            ticketTypeName = "종일권";
        else
            ticketTypeName = "야간권";

        int age = StringUtil.juminNumToAge(dto.getJuminNum());
        TicketPriceEnum ageGroup = cal.getAgeGroup(age);

        int price = cal.getPriceByType(dto.getTicketType(), ageGroup);
        int totalPrice = cal.getTotalPrice(price, dto.getBuyCount());

        PreferentialItemEnum item = cal.getDiscountRate(dto.getPreferentialItem());
        int finalPrice = cal.getDiscountPrice(totalPrice, item);

        return new TicketSummaryDto(ticketTypeName, ageGroup.getAgeGroupName(), dto.getBuyCount(), finalPrice,
                item.getDiscountName());
    }

    /**
     * 최종 영수증을 출력한다.
     * 
     * @param list
     */
    private void printFinalReceipt(List<TicketSummaryDto> list) {
        int totalPriceSum = 0;
        OrderSummaryPrint.writeHeader();
        for (TicketSummaryDto dto : list) {
            OrderSummaryPrint.writeBody(dto);
            totalPriceSum = totalPriceSum + dto.getTotalPrice();
        }
        OrderSummaryPrint.writeFooter(totalPriceSum);
    }
}
