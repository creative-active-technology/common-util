/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incubator.it.common.util;

import org.apache.commons.validator.routines.checkdigit.CheckDigit;
import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;

/**
 *
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 27 January 2014
 */
public class CheckDigitLunh {

    public static Boolean isValidNumberByLunh(String number) {
        CheckDigit checkDigit = new LuhnCheckDigit();
        return checkDigit.isValid(number);
    }
}
