/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class Percabangan {

    public static void main(String[] args) {
        int a = 10;
        
        //Percabangan if - else
        System.out.println("Percabangan if - else");
        if(a == 10){
            System.out.println("Nilai True");
        }else{
            System.out.println("Nilai False");
        }
        
        System.out.println("==================");
        
        //Percabangan if bersarang
        System.out.println("Percabangan if bersarang");
        int nilai = 69;
        char index;
        
        if(nilai >= 80){
            index = 'A';
        }else if(nilai >= 70){
            index = 'B';
        }else if(nilai >= 60){
            index = 'C';
        }else if(nilai >= 50){
            index = 'D';
        }else{
            index = 'E';
        }
        System.out.println("Index Nilai : " + index);
        System.out.println("======================");
        
        //Percabangan Switch - Case
        System.out.println("Percabangan switch - case");
        int hari = 1;
        switch(hari){
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jum'at");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Nama hari tidak ditemukan");
                break;
        }
    }
    
}
