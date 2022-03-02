
package com.mycompany.calculator;
import org.apache.commons.lang3.StringUtils;


public class Draw {
    public static String drawtela(String valueini, String adition){
        return valueini + adition;
    
    }
public static String erasetela(String valueini){
     if(valueini.length()>0){
    return StringUtils.removeEnd(valueini,Character.toString(valueini.charAt(valueini.length()-1)));
     }else{
     return "";
     }
    } }
