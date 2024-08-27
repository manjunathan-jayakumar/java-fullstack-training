package com.programming.class8;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Localization {
    public static void main(String[] args) {
        long value = 50_00_000L;
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println("Using Default Locale: "+ numberFormat.format(value));

        NumberFormat japanFormat = NumberFormat.getInstance(Locale.JAPAN);
        System.out.println("Using Japan Locale: "+ japanFormat.format(value));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Using Default Locale: "+ currencyFormat.format(value));

        NumberFormat japCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println("Using Japan Locale: "+ japCurrencyFormat.format(value));

        Date currentDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
        System.out.println("According to Germany, Current date is "+ dateFormat.format(currentDate));
    }
}
