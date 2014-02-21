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
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;

/**
 *
 * @author Deni Husni FR
 */
public class DateTimeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
          DateTime  dateTime=new DateTime();
         System.out.println("sfsdfsfds "+dateTime.monthOfYear().get()); 
         
          Calendar ca1 = Calendar.getInstance();

        /*
        set(int year, int month, int date)
        Jan=0,Feb=1,Mar=2...
        */
        ca1.set(2009,4,22);


        int WEEK_OF_MONTH=ca1.get(Calendar.WEEK_OF_MONTH);
        System.out.println("Week of Month :"+WEEK_OF_MONTH);
//        Date tanggal=new SimpleDateFormat("dd-MM-yyyy").parse("22-02-2014");
//        String day = new SimpleDateFormat("EE", Locale.ENGLISH).format(tanggal);
//        System.out.println("sdfdsfsdfdsf"+day);
//        int dayofDate = 4;
//        System.out.println("Tangal" + DateTimeUtil.getDateFrom(new Date(), -4, CommonUtilConstant.DATE_FORMAT_DAY));
//        Date now = new Date();
//        String tglBefore = new SimpleDateFormat("dd-MM-yyyy").format(now);
//        System.out.println("sdfsdfdsf" + tglBefore);
//        Date firstSeconThisDay = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse(tglBefore + " 00:00:00");
//        System.out.println("sddsfsdfsdfsdfdsf "+firstSeconThisDay);
        
      
      
      
//        try {
        // TODO code application logic here
//        String tanggal = "01-01-2015";
//
//        Date date = null;
//        try {
//            date = new SimpleDateFormat("dd-MM-yyyy").parse(tanggal);
//        } catch (ParseException ex) {
//            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
//        }

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
//         System.out.println(Integer.toBinaryString(100));
//         System.out.println(DecimalHexBinaryConverter.decimalToBinary(100));
//           System.out.println(DateTimeUtil.getAge(date));
//         System.out.println(UUIDUtil.getRandomDataEnd(10));
//         System.out.println(sdfsdf.substring(2));
//        System.out.println(UUIDUtil.getRandomDataBefore(-10));
    }
}
