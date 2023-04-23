package com.lotteworld.business;

import com.lotteworld.util.PreferentialItemEnum;
import com.lotteworld.util.TicketConstants;
import com.lotteworld.util.TicketPriceEnum;

public class TicketCalculator {

    /**
     * 전달받은 티켓종류에 맞는 티켓가격을 구한다.
     * 
     * @param ticketType
     * @param ticketPrice
     */
    public int getPriceByType(int ticketType, TicketPriceEnum ticketPrice) {
        if (ticketType == TicketConstants.TICKET_TYPE_ALLDAY)
            return ticketPrice.getDayPrice();
        else
            return ticketPrice.getNightPrice();
    }

    /**
     * 전달받은 티켓가격과 구매건수로 합계를 구한다.
     * 
     * @param ticketPrice
     * @param buyCount
     */
    public int getTotalPrice(int ticketPrice, int buyCount) {
        return ticketPrice * buyCount;
    }

    /**
     * 전달받은 티켓가격과 우대항목으로 할인된 가격을 구한다.
     * 
     * @param price
     * @param item
     */
    public int getDiscountPrice(int price, PreferentialItemEnum item) {
        return (int) (price * item.getDiscountRate());
    }

    /**
     * 전달받은 나이로 나이그룹별 가격을 가져온다.
     * 
     * @param age
     */
    public TicketPriceEnum getAgeGroup(int age) {
        if (age <= TicketConstants.AGE_BABY_MAX) {
            return TicketPriceEnum.BABY;
        } else if (TicketConstants.AGE_CHILD_MIN <= age && age <= TicketConstants.AGE_CHILD_MAX) {
            return TicketPriceEnum.CHILD;
        } else if (TicketConstants.AGE_TEEN_MIN <= age && age <= TicketConstants.AGE_TEEN_MAX) {
            return TicketPriceEnum.TEENAGE;
        } else if (TicketConstants.AGE_ADULT_MIN <= age && age <= TicketConstants.AGE_ADULT_MAX) {
            return TicketPriceEnum.ADULT;
        } else {
            return TicketPriceEnum.OLDMAN;
        }
    }

    /**
     * 전달받은 우대사항번호로 할인정보를 가져온다.
     * 
     * @param number
     */
    public PreferentialItemEnum getDiscountRate(int number) {
        if (number == PreferentialItemEnum.NOTHING.getNumber()) {
            return PreferentialItemEnum.NOTHING;
        } else if (number == PreferentialItemEnum.DISABLE.getNumber()) {
            return PreferentialItemEnum.DISABLE;
        } else if (number == PreferentialItemEnum.MERITPERSON.getNumber()) {
            return PreferentialItemEnum.MERITPERSON;
        } else if (number == PreferentialItemEnum.MULTICHILD.getNumber()) {
            return PreferentialItemEnum.MULTICHILD;
        } else if (number == PreferentialItemEnum.PREGNANTWOMAN.getNumber()) {
            return PreferentialItemEnum.PREGNANTWOMAN;
        }
        return PreferentialItemEnum.NOTHING;
    }
}
