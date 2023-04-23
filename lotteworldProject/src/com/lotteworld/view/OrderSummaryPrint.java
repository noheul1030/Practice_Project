package com.lotteworld.view;

import com.lotteworld.dto.TicketSummaryDto;
import com.lotteworld.util.StringUtil;

public class OrderSummaryPrint {

    /**
     * 최종 영수증 머리글 작성
     */
    public static void writeHeader() {
        System.out.println("");
        System.out.println("================================= LOTTE WORLD ==============");
        System.out.printf("%5s%9s%9s%9s%14s\n", "권종", "그룹", "수량", "가격", "우대사항");
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
        System.out.printf("%12s원", StringUtil.numToString(dto.getTotalPrice()));
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
        System.out.printf("***** 입장료 총액은 %s원 입니다. *****", StringUtil.numToString(totalPrice));
    }
}
