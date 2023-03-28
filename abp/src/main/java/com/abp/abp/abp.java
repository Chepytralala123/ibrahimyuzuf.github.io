/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abp.abp;

import java.util.Scanner;

/**
 *
 * @author C-19
 */

public class abp {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        
        double X, Y;
        X = 12.72;
        Y = 15.83   ;
        
        boolean isPlus = true;
        
        System.out.println("nilai a = " +a);
        System.out.println("nilai b = " +b);
        System.out.println("Double X = "+X);
        System.out.println("Double Y = "+Y);
        System.out.println("isPlus adalah = " +isPlus);
        
        Scanner inputnilai = new Scanner(System.in);
        
        System.out.println("Inputkan nilai a yang baru = ");
        a = inputnilai.nextInt();
        System.out.println("Inputkan nilai b yang baru = ");
        b = inputnilai.nextInt();
        
        System.out.println("Masukan nilai X = ");
        X = inputnilai.nextDouble();
        System.out.println("Masukan nilai Y = ");
        Y = inputnilai.nextDouble();
        
        System.out.println("Ubah isPlus = ");
        isPlus = inputnilai.nextBoolean();
        
        System.out.println("nilai a yang baru adalah "+a);
        System.out.println("nilai b yang baru adalah "+b);
        System.out.println("nilai X yang baru adalah "+X);
        System.out.println("nilai Y yang baru adalah "+Y);
        System.out.println("isPlus yang baru adalah = "+isPlus);
    }
}
