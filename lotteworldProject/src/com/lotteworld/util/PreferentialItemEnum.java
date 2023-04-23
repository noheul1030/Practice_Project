package com.lotteworld.util;

public enum PreferentialItemEnum {

    NOTHING(1, "없음", 1.0), 
    DISABLE(2, "장애인", 0.5), 
    MERITPERSON(3, "국가유공자", 0.5),
    MULTICHILD(4, "다자녀", 0.7), 
    PREGNANTWOMAN(5, "임산부", 0.5);

    private final int number;
    private final String discountName;
    private final double discountRate;

    private PreferentialItemEnum(int number, String discountName, double discountRate) {
        this.number = number;
        this.discountName = discountName;
        this.discountRate = discountRate;
    }

    public int getNumber() {
        return number;
    }

    public String getDiscountName() {
        return discountName;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
