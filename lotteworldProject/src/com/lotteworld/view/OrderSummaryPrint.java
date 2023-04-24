package com.lotteworld.view;

import java.text.MessageFormat;

import com.lotteworld.dto.TicketSummaryDto;
import com.lotteworld.util.MsgUtil;
import com.lotteworld.util.StringUtil;

public class OrderSummaryPrint {

    /**
     * 최종 영수증 머리글 작성
     */
    public static void writeHeader() {
        System.out.println("");
        System.out.println("================================= LOTTE WORLD ==============");
        System.out.printf("%5s%9s%9s%9s%14s\n", MsgUtil.getMsg("OrderSummaryPrint.type"),
                MsgUtil.getMsg("OrderSummaryPrint.group"), MsgUtil.getMsg("OrderSummaryPrint.count"),
                MsgUtil.getMsg("OrderSummaryPrint.price"), MsgUtil.getMsg("OrderSummaryPrint.preferentialTreatment"));
        System.out.println("============================================================");
    }

    /**
     * 최종 영수증 내용 작성
     * 
     * @param list
     */
    public static void writeBody(TicketSummaryDto dto) {
        System.out.printf("%5s", dto.getTicketType());
        System.out.printf("%9s", dto.getAgeGroup());
        System.out.printf("%10s", "X " + dto.getBuyCount());
        System.out.printf("%12s" + MsgUtil.getMsg("OrderSummaryPrint.won"),
                StringUtil.numToString(dto.getTotalPrice()));
        System.out.printf("%4s%8s", " ", "* " + dto.getPreferentialItem());
        System.out.println();
    }

    /**
     * 최종 영수증 바닥글 작성
     * 
     * @param totalPrice
     */
    public static void writeFooter(int totalPrice) {
        System.out.println("============================================================");
        System.out.println("");
        System.out.println(MessageFormat.format(MsgUtil.getMsg("OrderSummaryPrint.totalPrice"),
                StringUtil.numToString(totalPrice)));
    }
}
