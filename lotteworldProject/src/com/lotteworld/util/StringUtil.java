package com.lotteworld.util;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

public class StringUtil {

    /**
     * 주민번호로 만나이 구하기
     * 
     * @param juminNum
     */
    public static int juminNumToAge(String juminNum) {
        int birthYear = Integer.parseInt(juminNum.substring(0, 2));
        int birthMonth = Integer.parseInt(juminNum.substring(2, 4));
        int birthDay = Integer.parseInt(juminNum.substring(4, 6));

        int generationKey = Integer.parseInt(juminNum.substring(7, 8));
        if (generationKey == TicketConstants.GENERATION_NEW_MALE
                || generationKey == TicketConstants.GENERATION_NEW_FEMALE) {
            birthYear = birthYear + TicketConstants.GENERATION_NEW_YEAR;
        } else {
            birthYear = birthYear + TicketConstants.GENERATION_OLD_YEAR;
        }

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();

        int age = Period.between(birthDate, currentDate).getYears();
        if (birthMonth > currentDate.getMonthValue()) {
            age--;
        } else if (birthMonth == currentDate.getMonthValue()) {
            if (birthDay > currentDate.getDayOfMonth())
                age--;
        }

        return age;
    }

    /**
     * 세자리마다 콤마 넣는 포맷으로 변환하기
     * 
     * @param num
     */
    public static String numToString(int num) {
        return new DecimalFormat("###,###,###").format(num);
    }
}
