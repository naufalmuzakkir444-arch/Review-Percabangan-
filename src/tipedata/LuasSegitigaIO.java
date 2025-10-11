/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;
/**
 *
 * @author USER MSI
 */
public class LuasSegitigaIO {
 public static void main(String[] args)
 {
     Scanner angka = new Scanner(System.in);
             
     System.out.print("Masukkan Alas: ");
     double alas = angka.nextDouble();
     System.out.print("Masukkan Tinggi: ");
     double tinggi = angka.nextDouble();
     double LuasSegitiga = alas * tinggi * 0.5;
     
     System.out.println("Jadi, Luas Segitiga Adalah= " + LuasSegitiga);
    }
}
