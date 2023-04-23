package com.lotteworld.util;

public class TicketConstants {

    /** 티켓종류 */
    public static final int TICKET_TYPE_ALLDAY = 1;
    public static final int TICKET_TYPE_NIGHT = 2;

    /** 주민번호 구분자 */
    public static final String JUMIN_NUM_DELIMITER = "-";

    /** 구매건수 제한범위 */
    public static final int BUY_COUNT_MIN = 1;
    public static final int BUY_COUNT_MAX = 10;

    /** 우대사항(항목) */
    public static final int PREFERENTIAL_ITEM_NOTHING = 1;
    public static final int PREFERENTIAL_ITEM_DISABLE = 2;
    public static final int PREFERENTIAL_ITEM_MERITPERSON = 3;
    public static final int PREFERENTIAL_ITEM_MULTICHILD = 4;
    public static final int PREFERENTIAL_ITEM_PREGNANTWOMAN = 5;

    /** 발권 재시도 */
    public static final int RETRY_YES = 1;
    public static final int RETRY_NO = 2;

    /** 출생년도 구분과 계산 */
    public static final int GENERATION_OLD_MALE = 1;
    public static final int GENERATION_OLD_FEMALE = 2;
    public static final int GENERATION_OLD_YEAR = 1900;
    public static final int GENERATION_NEW_MALE = 3;
    public static final int GENERATION_NEW_FEMALE = 4;
    public static final int GENERATION_NEW_YEAR = 2000;

    /** 나이에 따른 그룹 */
    public static final int AGE_BABY_MIN = 1;
    public static final int AGE_BABY_MAX = 2;
    public static final int AGE_CHILD_MIN = 3;
    public static final int AGE_CHILD_MAX = 12;
    public static final int AGE_TEEN_MIN = 13;
    public static final int AGE_TEEN_MAX = 18;
    public static final int AGE_ADULT_MIN = 19;
    public static final int AGE_ADULT_MAX = 64;
}
