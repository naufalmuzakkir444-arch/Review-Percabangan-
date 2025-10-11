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
public class Bank {
    public static void main (String[] args) {
        int saldo, uang;
        saldo = 100000; 
                
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Bank Unan ");
        System.out.println("Saldo anda saat ini adalah " + saldo);
        
        System.out.print("Masukkan uang : ");
        uang = keyboard.nextInt();
        saldo += uang;
        System.out.println("Saldo saat ini = " + saldo);
        
        System.out.print("tarik uang : ");
        uang = keyboard.nextInt();
        saldo -= uang;
        System.out.println(" Saldo saat ini = " + saldo);
    }
}
