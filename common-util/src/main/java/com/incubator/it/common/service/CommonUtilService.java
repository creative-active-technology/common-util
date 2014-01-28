/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incubator.it.common.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 28 January 2014
 */
public class CommonUtilService {

    private static ApplicationContext appContext;

    /**
     *
     *
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        if (appContext == null) {
            appContext = new ClassPathXmlApplicationContext("spring/common-config.xml");
        }
        return appContext;
    }

    /**
     * This Method for get Object Class that managed by Spirng.
     * <p>
     * This method support for @anotation (Autowire) and non @anotation
     *
     * @author Deni Husni Fahri Rizal
     * @param beansName String interfaced name
     * @return Object instance of service
     */
    public static Object getService(String beansName) {
        return getApplicationContext().getAutowireCapableBeanFactory().getBean(beansName);

    }
}
