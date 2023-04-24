package com.lotteworld.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class MsgUtil {

    private static ResourceBundle messages;
    static {
        messages = ResourceBundle.getBundle("message", Locale.getDefault());
    }

    public static String getMsg(String key) {
        String message = null;
        try {
            message = messages.getString(key);
        } catch (Exception e) {
            new IllegalArgumentException("Could not find message for key [" + key + "]");
        }
        return message;
    }

    public static void setLocale(Locale locale) {
        messages = ResourceBundle.getBundle("message", locale);
    }
}
