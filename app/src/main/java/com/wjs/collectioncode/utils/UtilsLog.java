package com.wjs.collectioncode.utils;

import android.os.Environment;

import com.orhanobut.logger.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UtilsLog {

    public static boolean isTest = true;


    /**
     * @param key     日志的tag
     * @param message 日志的内容
     */
    public static void d(String key, String message) {
        if (isTest) {
            Logger.t(key).d(message);
        }
    }

    /**
     * @param message 日志的内容
     */
    public static void e(String message) {
        if (isTest) {
            Logger.e(message);
        }
    }

    /**
     * @param key     日志的tag
     * @param message 日志的内容
     */
    public static void e(String key, String message) {
        if (isTest) {
            Logger.t(key).e(message);
        }
    }

    /**
     * @param message 日志的内容
     */
    public static void v(String message) {
        if (isTest) {
            Logger.v(message);
        }
    }

    /**
     * @param key     日志的tag
     * @param message 日志的内容
     */
    public static void v(String key, String message) {
        if (isTest) {
            Logger.t(key).v(message);
        }
    }

    /**
     * @param message 日志的内容
     */
    public static void i(String message) {
        if (isTest) {
            Logger.i(message);
        }
    }

    /**
     * @param key     日志的tag
     * @param message 日志的内容
     */
    public static void i(String key, String message) {
        if (isTest) {
            Logger.t(key).i(message);
        }
    }

    /**
     * @param message 日志的内容
     */
    public static void w(String message) {
        if (isTest) {
            Logger.w(message);
        }
    }

    /**
     * @param key   日志的tag
     * @param value 日志的内容
     */
    public static void w(String key, String value) {
        if (isTest) {
            Logger.t(key).w(value);
        }
    }

    public static void w(String key, Throwable tr) {
        if (isTest) {
            Logger.t(key).w(tr.toString());
        }
    }

    public static void log(String tag, String info) {
        StackTraceElement[] ste = new Throwable().getStackTrace();
        int i = 1;
        if (isTest) {
            StackTraceElement s = ste[i];
            Logger.t(tag).e(String.format("======[%s][%s][%s]=====%s",
                    s.getClassName(), s.getLineNumber(), s.getMethodName(),
                    info));
        }
    }

}
