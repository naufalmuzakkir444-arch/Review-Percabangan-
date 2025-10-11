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
public class BankIf {

    public static void main(String[] args) {
        int saldo, uang;
        int sisaSaldo;
        saldo = 100000;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Selamat Datang di Bank Unan Saldo anda saat ini: Rp. " + saldo);

        System.out.print("Ambil uang : Rp. ");
        uang = keyboard.nextInt();
        saldo = saldo - uang;
        System.out.println("Sisa uang: Rp. " + saldo);
        if (saldo <= 100000) {
            sisaSaldo = uang - saldo;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}
