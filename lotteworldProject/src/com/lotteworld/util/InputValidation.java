package com.lotteworld.util;

public class InputValidation {

    /** 티켓종류 검증 */
    public static boolean isTicketType(int value) {
        return value == TicketConstants.TICKET_TYPE_ALLDAY || value == TicketConstants.TICKET_TYPE_NIGHT;
    }

    /** 주민번호 검증 */
    public static boolean isJuminNum(String value) {
        if (value.length() != 14)
            return false;
        if (!TicketConstants.JUMIN_NUM_DELIMITER.equals(value.substring(6, 7)))
            return false;
        return true;
    }

    /** 구매건수 검증 */
    public static boolean isBuyCount(int value) {
        return TicketConstants.BUY_COUNT_MIN <= value && value <= TicketConstants.BUY_COUNT_MAX;
    }

    /** 우대사항(항목) 검증 */
    public static boolean isPreferentialItem(int value) {
        return TicketConstants.PREFERENTIAL_ITEM_NOTHING <= value
                && value <= TicketConstants.PREFERENTIAL_ITEM_PREGNANTWOMAN;
    }

    /** 재시도 검증 */
    public static boolean isRetry(int value) {
        return value == TicketConstants.RETRY_YES || value == TicketConstants.RETRY_NO;
    }
}
