/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incubator.it.common.util;

/**
 *
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 2 February 2014
 */
public class ISO8583Util {

    /**
     *
     * <p>
     * Find the Bitmap length of messages in iso 8583 format.
     * </p>
     *
     *
     * @param originalMsg is messages in String type
     * @return Integer value
     */
    public static Integer findLengthOfBitmap(String originalMsg) {
        String firstBitmap = originalMsg.substring(4, 5);
        Integer lenghtOfBitmap = 0;
        if (DecimalHexBinaryConverter.hexaToBinary(firstBitmap).substring(0, 1).equalsIgnoreCase("1")) {
            lenghtOfBitmap = 32;
        } else {
            lenghtOfBitmap = 16;
        }
        return lenghtOfBitmap;
    }

    public static String findActiveDE(String binaryBitmap) {
        StringBuilder activeDE = new StringBuilder();
        char[] charBinaryBitmap = binaryBitmap.toCharArray();
        int counter = 0;
        for (int i = 0; i < charBinaryBitmap.length; i++) {
            counter++;
            if (String.valueOf(charBinaryBitmap[i]).equals("1")) {
                activeDE.append(String.valueOf(counter)).append(";");
            }
        }

        return activeDE.toString();
    }

}
