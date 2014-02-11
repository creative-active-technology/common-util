/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incubator.it.common.util;

import com.incubator.it.common.CommonUtilConstant;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Years;
import org.joda.time.Seconds;

/**
 *
 * <p>
 * DateTimeUtil is a utility class for date manipulation. We can use all java
 * Date type, like java.util.Date or java.sql.Date.
 * </p>
 *
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 14 January 2014
 */
public class DateTimeUtil {

    /**
     *
     * Get or return Past or Future date based on parameter</p>
     * <p>
     * <b>Parameter amount :</b> use negative symbol to get past date, use
     * positive symbol to get future date. Parameter amount combination with
     * parameter constantParameter. </p>
     * <p>
     * <b>Parameter constantParameter :</b> the type of times that will be
     * added. Example : CommonUtilConstant.DATE_FORMAT_MONTH</p>
     * <p>
     * <b>ConstantParameter type :</b></p>
     * <ul>
     * <li>CommonUtilConstant.DATE_FORMAT_MILLISECOND = millisecond</li>
     * <li>CommonUtilConstant.DATE_FORMAT_SECOND = second</li>
     * <li>CommonUtilConstant.DATE_FORMAT_MINUTES = minutes</li>
     * <li>CommonUtilConstant.DATE_FORMAT_HOURS = hours</li>
     * <li>CommonUtilConstant.DATE_FORMAT_DAY = day</li>
     * <li>CommonUtilConstant.DATE_FORMAT_WEEK = week</li>
     * <li>CommonUtilConstant.DATE_FORMAT_MONTH = month</li>
     * <li>CommonUtilConstant.DATE_FORMAT_YEAR = year</li>
     * </ul>
     *
     * @return Date type of past or future date
     * @param inputParam Date reference to calculate
     * @param timeDifference Integer reference, can be negative value like -7 or
     * positive value like 7
     * @param constantParameter String reference,see the CommonUtilConstant
     */
    public static Date getDateFrom(Date inputParam, int timeDifference, String constantParameter) {
        Date returnDate = null;
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_DAY)) {
            returnDate = DateUtils.addDays(inputParam, timeDifference);
        }
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_HOURS)) {
            returnDate = DateUtils.addHours(inputParam, timeDifference);
        }
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_MILLISECOND)) {
            returnDate = DateUtils.addMilliseconds(inputParam, timeDifference);
        }
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_MINUTES)) {
            returnDate = DateUtils.addMinutes(inputParam, timeDifference);
        }
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_MONTH)) {
            returnDate = DateUtils.addMonths(inputParam, timeDifference);
        }
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_SECOND)) {
            returnDate = DateUtils.addSeconds(inputParam, timeDifference);
        }
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_YEAR)) {
            returnDate = DateUtils.addYears(inputParam, timeDifference);
        }
        if (constantParameter.equalsIgnoreCase(CommonUtilConstant.DATE_FORMAT_WEEK)) {
            returnDate = DateUtils.addWeeks(inputParam, timeDifference);
        }
        return returnDate;
    }

    /**
     * Checking from two date type, will return true if the date have the same
     * value, same date not same time.
     *
     * @return Boolean
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Boolean isSameDateWithTimeIgnore(Date date1, Date date2) {
        return DateUtils.isSameDay(date1, date2);
    }

    /**
     * Checking from two date objects (included time ), will return true if the
     * date have the same value and same time instance.
     *
     * @return Boolean
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Boolean isSameDateAndTime(Date date1, Date date2) {
        return DateUtils.isSameInstant(date1, date2);
    }

    /**
     * get total times (Age) based on date parameter
     *
     * @param birthDate input date type
     * @return Integer age that calculate from today
     * @throws java.lang.Exception
     *
     */
    public static Integer getAge(Date birthDate) throws Exception {
        if (birthDate.after(new Date())) {
            throw new Exception("Mr DHFR say :Your birthdate is newer than to day. Can't be born in the future!");
        } else {
            DateMidnight date1 = new DateMidnight(birthDate);
            DateTime now = new DateTime();
            Years years = Years.yearsBetween(date1, now);
            return years.getYears();
        }
    }

    /**
     * get total times (Age) based on date parameter and calculate with total
     * difference of month
     *
     * @param birthDate input date type
     * @return Double age that calculate from today.
     * @throws java.lang.Exception
     *
     */
    public static Double getAgeWithMonth(Date birthDate) throws Exception {
        Integer age = getAge(birthDate);
        Integer totalMonth = getTotalMonthDifference(birthDate, new Date());
        Integer totalMonthDifference = totalMonth - (12 * age);
        return age.doubleValue() + (totalMonthDifference.doubleValue() / 12);
    }

    /**
     * get total days difference, between two date type
     *
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getTotalDayDifference(Date date1, Date date2) {
        Days days = Days.daysBetween(new DateMidnight(date1), new DateMidnight(date2));
        return days.getDays();
    }

    /**
     * get total months difference, between two date type
     *
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getTotalMonthDifference(Date date1, Date date2) {
        Months months = Months.monthsBetween(new DateMidnight(date1), new DateMidnight(date2));
        return months.getMonths();
    }

    /**
     * get total years difference, between two date type
     *
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getTotalYearDifference(Date date1, Date date2) {
        return Years.yearsBetween(new DateMidnight(date1), new DateMidnight(date2)).getYears();
    }

    /**
     * get total Minutes difference, between two date type
     *
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getTotalMinutes(Date date1, Date date2) {
        return Minutes.minutesBetween(new DateMidnight(date1), new DateMidnight(date2)).getMinutes();
    }

    /**
     * get total Second difference, between two date type
     *
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getTotalSeconds(Date date1, Date date2) {
        return Seconds.secondsBetween(new DateMidnight(date1), new DateMidnight(date2)).getSeconds();
    }

    /**
     * get total working days
     *
     * @param startDate Date reference
     * @return Integer
     * @param endDate Date reference
     * @param totalPublicHoliday total of public holiday in target country
     * @param totalAnnualLeave total of annual leave
     * @throws java.lang.Exception
     */
    public static Integer getTotalWorkingDay(Date startDate, Date endDate, int totalPublicHoliday, int totalAnnualLeave) throws Exception {
        if (startDate.after(endDate)) {
            throw new Exception(" Mr. DHFR say :End Date must be newer than Start Date");
        } else {
            int workingDays = getTotalDay(startDate, endDate) - getTotalSaturdayAndMonday(startDate, endDate);
            Integer totalWorkingDay = workingDays - totalAnnualLeave - totalPublicHoliday;
            return totalWorkingDay;
        }
    }

    /**
     * get total Day between two date
     *
     * @param startDate Date reference
     * @return Integer
     * @param endDate Date reference
     * @throws java.lang.Exception
     */
    public static Integer getTotalDay(Date startDate, Date endDate) throws Exception {
        if (startDate.after(endDate)) {
            throw new Exception("Mr. DHFR say :End Date must be newer than Start Date");
        } else {
            return getTotalDayDifference(startDate, endDate) + 1;
        }
    }

    /**
     * get total SaturDay and Monday between two date
     *
     * @param startDate Date reference
     * @return Integer
     * @param endDate Date reference
     * @throws java.lang.Exception
     */
    public static Integer getTotalSaturdayAndMonday(Date startDate, Date endDate) throws Exception {
        if (startDate.after(endDate)) {
            throw new Exception("Mr. DHFR say :End Date must be newer than Start Date");
        } else {
            DateTime start = new DateTime(startDate);
            DateTime end = new DateTime(endDate);
            int totalSaturdayAndMonday = 0;
            DateTime iterate = start;
            while (iterate.isBefore(end)) {
                if (iterate.getDayOfWeek() == 6 | iterate.getDayOfWeek() == 7) {
                    ++totalSaturdayAndMonday;
                }
                iterate = iterate.plusDays(1);
            }
            return totalSaturdayAndMonday;
        }
    }

}
