/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

/**
 *
 * @author USER MSI
 */
public class PernyataanIf {
 public static void main (String[] args) {
     int diskon = 0, totalBelanja = 500000;
     
     if(totalBelanja >= 100000) {
         diskon = totalBelanja/10;
         
     }
     System.out.println("Diskon = " + diskon);
  }   
}
