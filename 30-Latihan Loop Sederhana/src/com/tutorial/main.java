/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.*;
/**
 *
 * Nama : Tanti Nurharomah 
 * Kelas : TI-B
 * NIM : A2.1900178
 */
public class main {
  

    public static void main (String[] args){

        // program untuk menjumlahkan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();


        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

        // tugas -> for loop, do while...

    }
}


