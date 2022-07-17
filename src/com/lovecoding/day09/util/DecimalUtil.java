package com.lovecoding.day09.util;

import java.text.DecimalFormat;

public class DecimalUtil {

    /**
     * 返回格式化保留2位小数点的数
     * @param d
     * @return
     */
    public static String getTwoDecimal(Double d){
        DecimalFormat df = new DecimalFormat("0.00");

        return df.format(d);
    }
    /**
     * 返回格式化保留4位小数点的数
     * @param d
     * @return
     */
    public static String getFourDecimal(Double d){
        DecimalFormat df = new DecimalFormat("#.####");

        return df.format(d);
    }
}
