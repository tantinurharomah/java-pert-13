/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.*;
/**
 *
 * @author USER
 * Nama : Tanti Nurharomah 
 * Kelas : TI-B
 * NIM : A2.1900178
 */
public class main {
  

    public static void main (String[] args){

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }

    }
}

