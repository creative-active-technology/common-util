/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inkubator.common;

import com.inkubator.common.service.CommonUtilService;
import com.inkubator.common.util.DateFormatter;
import com.inkubator.common.util.DateTimeUtil;
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        DateFormatter dateFormatter=(DateFormatter) CommonUtilService.getService("dateFormatter");
        System.out.println(dateFormatter.getDateFullAsStringsWithActiveLocale(new Date(), Locale.ITALIAN));
        System.out.println(DateTimeUtil.getAge(new Date()));
    }
    
}
