package com.example.huzdi.exercise2;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by huzdi on 13.09.2017.
 */

public class Utility {
    public static String getCurrentTime(String timeformat){
        Format formatter = new SimpleDateFormat(timeformat);
        return formatter.format(new Date());
    }
}
