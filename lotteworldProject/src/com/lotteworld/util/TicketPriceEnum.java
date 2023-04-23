package com.lotteworld.util;

public enum TicketPriceEnum {

    BABY("영  아", 15000, 15000), 
    CHILD("어린이", 46000, 35000), 
    TEENAGE("청소년", 52000, 41000), 
    ADULT("성  인", 59000, 47000),
    OLDMAN("노  인", 46000, 35000);

    private final String ageGroupName;
    private final int dayPrice;
    private final int nightPrice;

    // 생성자
    private TicketPriceEnum(String ageGroupName, int dayPrice, int nightPrice) {
        this.ageGroupName = ageGroupName;
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
    }

    // 주간권 금액 get
    public String getAgeGroupName() {
        return this.ageGroupName;
    }

    // 주간권 금액 get
    public int getDayPrice() {
        return this.dayPrice;
    }

    // 야간권 금액 get
    public int getNightPrice() {
        return this.nightPrice;
    }
}
