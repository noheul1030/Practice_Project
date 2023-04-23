package com.lotteworld.dto;

public class TicketOrderDto {

    // 티켓종류
    private int ticketType;
    // 주민번호
    private String juminNum;
    // 구매건수
    private int buyCount;
    // 우대항목
    private int preferentialItem;
    // 재시도
    private int retry;

    public int getTicketType() {
        return ticketType;
    }

    public void setTicketType(int ticketType) {
        this.ticketType = ticketType;
    }

    public String getJuminNum() {
        return juminNum;
    }

    public void setJuminNum(String juminNum) {
        this.juminNum = juminNum;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public int getPreferentialItem() {
        return preferentialItem;
    }

    public void setPreferentialItem(int preferentialItem) {
        this.preferentialItem = preferentialItem;
    }

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }
}
