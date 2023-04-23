package com.lotteworld.dto;

public class TicketSummaryDto {

    private String ticketType;
    private String ageGroup;
    private int buyCount;
    private int totalPrice;
    private String preferentialItem;

    /**
     * 생성자를 이용해서 값을 Set
     */
    public TicketSummaryDto(String ticketType, String ageGroup, int buyCount, int totalPrice, String preferentialItem) {
        this.ticketType = ticketType;
        this.ageGroup = ageGroup;
        this.buyCount = buyCount;
        this.totalPrice = totalPrice;
        this.preferentialItem = preferentialItem;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getPreferentialItem() {
        return preferentialItem;
    }
}
