/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Jarak {

    public static void main(String[] args) {
        
        Double lat1 = -7.275515;  
        Double long1 = 112.794895;
        
        Double lat2 = -7.276207;  
        Double long2 = 112.790843; 
        
        try{
//            Double distance = 6371.1 * Math.acos(
//                Math.cos(Math.toRadians(lat2)) * 
//                Math.cos(Math.toRadians(lat1)) * 
//                Math.cos(Math.toRadians(long1) - Math.toRadians(long2) ) + 
//                Math.sin(Math.toRadians(lat2)) * Math.sin(Math.toRadians(lat1)));
//            
//            BigDecimal bd = new BigDecimal(distance);
//            BigDecimal setScale = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
//            BigDecimal bbb = setScale.multiply(new BigDecimal(1000));
//            System.out.println(distance);
            BigDecimal bbbb = new BigDecimal(298.00);
            System.out.println(bbbb.toString());
        }catch(Exception ex){
            
        }
        
        
       
    }
    
}
