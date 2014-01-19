/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incubator.it.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * <p>
 * JsonConverter is class utility for generate json from java object and parsing
 * json to java object.</p>
 * <p>
 * This class managed by spring. Spring inject the jsonPatternDateFormat. </p>
 * <p>
 * Note: every class consume JsonConverter must have same date pattern
 * format.</p>
 *
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 19 January 2014
 *
 */
public class JsonConverter {

    private String jsonPatternDateFormat;

    public void setJsonPatternDateFormat(String jsonPatternDateFormat) {
        this.jsonPatternDateFormat = jsonPatternDateFormat;
    }

    /*
     * @return String in json format
     * @param object is all java Object speciali pojo or javabeans.This object will convert to json.
     */
    public String getJson(Object object) {
        Gson gson = new GsonBuilder().setDateFormat(jsonPatternDateFormat).create();
        return gson.toJson(object).toString();
    }
    /*
     * @return String value of json base on keyName parameter.
     * @param jsonMsg is json
     * @param keyName is key paremeter that we will get value within
     */

    public String getValueByKey(String jsonMsg, String keyName) {
        JsonElement jelement = new JsonParser().parse(jsonMsg);
        JsonObject jobject = jelement.getAsJsonObject();
        return jobject.get(keyName).getAsString();
    }

    public Object getClassFromJson(String jsonMsg, Class clazz) {
        Gson gson = new GsonBuilder().setDateFormat(jsonPatternDateFormat).create();
        return gson.fromJson(jsonMsg, clazz);
    }
}
