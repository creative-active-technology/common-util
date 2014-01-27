/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incubator.it.common;

import com.incubator.it.common.util.CheckDigitLunh;
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
    public static void main(String[] args) {
        // TODO code application logic here
        String tanggal = "01-01-2014";

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

        Date endDate = new Date();
        try {
//            System.out.println(" totoal day working " + DateTimeUtil.getTotalWorkingDay(date, endDate, 0, 0));
//            System.out.println("Toatal day " + DateTimeUtil.getTotalDay(date, endDate));
//            System.out.println("Toatal sabatu dan minggu " + DateTimeUtil.getTotalSaturdayAndMonday(date, endDate));
            System.out.println(" Benar atau gak ya ??? "+CheckDigitLunh.isValidNumberByLunh("5264221814355451"));
        } catch (Exception ex) {
            Logger.getLogger(DateTimeTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
