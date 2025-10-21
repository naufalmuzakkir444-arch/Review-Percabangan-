/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReviewPercabangan;

import java.util.Scanner;

/**
 *
 * @author USER MSI
 */
public class KartuAnggotaBelanja {

    public static void main(String[] args) {
        int belanjaan, diskon = 0, total = 0;
        String kartu;
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau t)?");
        kartu = input.nextLine();
        System.out.print("Berapa total harga barang belanjaan : Rp");
        belanjaan = input.nextInt();
        if (kartu.equals("y")) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else {
                diskon = 25000;
            }

        } else if (kartu.equals("t")) {
            if (belanjaan > 200000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }
        total = belanjaan - diskon;
        System.out.println("Harga Awal : Rp" + diskon);
        System.out.println("Diskon : Rp" + diskon);
        System.out.println("Total yang harus dibayar : Rp " + total);
    }
}
