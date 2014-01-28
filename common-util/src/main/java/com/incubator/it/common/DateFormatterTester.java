/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.incubator.it.common;

import com.incubator.it.common.service.CommonUtilService;
import com.incubator.it.common.util.DateFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Deni Husni FR
 */
public class DateFormatterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateFormatter dateFormatter=(DateFormatter) CommonUtilService.getService("dateFormatter");
        System.out.println(dateFormatter.getDateFullAsStringsWithActiveLocale(new Date(), Locale.FRENCH));
    }
    
}
