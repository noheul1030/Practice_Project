package com.lotteworld.view;

public class GuideMsgPrint {

    /** 티켓종류 입력 메시지 */
    public static void inputTicketType() {
        System.out.println("발권하실 티켓의 종류를 선택해 주세요.");
        System.out.println("1. 종일권");
        System.out.println("2. 야간권");
    }

    /** 주민번호 입력 메시지 */
    public static void inputJuminNum() {
        System.out.println("\n주민번호를 입력해 주세요. ( 예시 : 123456-1234567 )");
    }

    /** 구매건수 입력 메시지 */
    public static void inputBuyCount() {
        System.out.println("\n구매하실 티켓의 갯수를 입력해주세요. (최대 10개)");
    }

    /** 우대사항(항목) 입력 메시지 */
    public static void inputPreferentialItem() {
        System.out.println("\n우대사항을 선택해 주세요.");
        System.out.println("1. 없음");
        System.out.println("2. 장애인");
        System.out.println("3. 국가유공자");
        System.out.println("4. 다자녀");
        System.out.println("5. 임산부");
    }

    /** 재시도 입력 메시지 */
    public static void inputRetry() {
        System.out.println("\n계속 발권 하시겠습니까?");
        System.out.println("1. 티켓 발권");
        System.out.println("2. 종료");
    }

    /** 에러 메시지 */
    public static void error() {
        System.out.println("\n##### 입력 오류 입니다. 다시 입력해주세요. #####");
    }

    /** 종료 메시지 */
    public static void close() {
        System.out.println("\n***** 티켓 발권을 종료합니다. 감사합니다. *****");
    }
}
