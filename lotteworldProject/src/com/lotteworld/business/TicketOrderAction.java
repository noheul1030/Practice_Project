package com.lotteworld.business;

import java.util.Scanner;

import com.lotteworld.util.InputValidation;
import com.lotteworld.view.GuideMsgPrint;

public class TicketOrderAction {

    private Scanner scanner = new Scanner(System.in);

    /** 티켓종류를 선택받는다. */
    public int getTicketType() {
        while (true) {
            GuideMsgPrint.inputTicketType();

            int value = scanner.nextInt();
            if (InputValidation.isTicketType(value))
                return value;

            GuideMsgPrint.error();
        }
    }

    /** 주민번호를 입력받는다. */
    public String getJuminNum() {
        while (true) {
            GuideMsgPrint.inputJuminNum();

            String value = scanner.next();
            if (InputValidation.isJuminNum(value)) {
                return value;
            }

            GuideMsgPrint.error();
        }
    }

    /** 주문건수를 입력받는다. */
    public int getBuyCount() {
        while (true) {
            GuideMsgPrint.inputBuyCount();

            int value = scanner.nextInt();
            if (InputValidation.isBuyCount(value))
                return value;

            GuideMsgPrint.error();
        }
    }

    /** 우대항목을 입력받는다. */
    public int getPreferentialItem() {
        while (true) {
            GuideMsgPrint.inputPreferentialItem();

            int value = scanner.nextInt();
            if (InputValidation.isPreferentialItem(value))
                return value;

            GuideMsgPrint.error();
        }
    }

    /** 재시작여부를 입력받는다. */
    public int getRetry() {
        while (true) {
            GuideMsgPrint.inputRetry();

            int value = scanner.nextInt();
            if (InputValidation.isRetry(value))
                return value;

            GuideMsgPrint.error();
        }
    }
}
