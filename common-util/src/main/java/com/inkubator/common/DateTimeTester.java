/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.common;

import com.inkubator.common.util.CheckDigitLunh;
import com.inkubator.common.util.DateTimeUtil;
import com.inkubator.common.util.DecimalHexBinaryConverter;
import com.inkubator.common.util.RandomNumberUtil;
import com.inkubator.common.util.UUIDUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deni Husni FR
 */
public class DateTimeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        try {
        // TODO code application logic here
        String tanggal = "01-01-2015";

        Date date = null;
        try {
            date = new SimpleDateFormat("dd-MM-yyyy").parse(tanggal);
        } catch (ParseException ex) {
            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
        }

//        CheckDigit
//        System.out.println("Nitlai taanggalnya " + DateTimeUtil.getTotalMonthDifference(date, new Date()));
//        try {
        //        try {
        //        try {
//            System.out.println("Umur anda adalah "+DateTimeUtil.getAge(date));
//        } catch (IllegalArgumentException ex) {
//            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            System.out.println("Nitlai Umurnya" + DateTimeUtil.getAge(date));
////        } catch (IllegalArgumentException ex) {
////            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
////        }
//        } catch (Exception ex) {
//            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            System.out.println("Umurnya "+DateTimeUtil.getAgeWithMonth(date));
//        } catch (Exception ex) {
//            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Date endDate = new Date();
//        try {
////            System.out.println(" totoal day working " + DateTimeUtil.getTotalWorkingDay(date, endDate, 0, 0));
////            System.out.println("Toatal day " + DateTimeUtil.getTotalDay(date, endDate));
////            System.out.println("Toatal sabatu dan minggu " + DateTimeUtil.getTotalSaturdayAndMonday(date, endDate));
//            System.out.println(" Benar atau gak ya ??? "+CheckDigitLunh.isValidNumberByLunh("5264221814355451"));
//        } catch (Exception ex) {
//            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            Double a=RandomNumberUtil.getRandomNumber(3);
//            System.out.println(a);
//        for (int j = 1; j < 10; j++) {
//            System.out.println(RandomNumberUtil.getRandomBettween(20000,2000000000));
//        }
//        } catch (Exception ex) {
//            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         System.out.println(UUIDUtil.getRandomDataUUID());
//         String sdfsdf=UUIDUtil.getRandomUUID(37).toUpperCase();
//         System.out.println(sdfsdf);
         System.out.println(Integer.toBinaryString(100));
         System.out.println(DecimalHexBinaryConverter.decimalToBinary(100));
           System.out.println(DateTimeUtil.getAge(date));
//         System.out.println(UUIDUtil.getRandomDataEnd(10));
//         System.out.println(sdfsdf.substring(2));
//        System.out.println(UUIDUtil.getRandomDataBefore(-10));
    }
}
