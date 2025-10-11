/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

import java.util.Scanner;

/**
 *
 * @author USER MSI
 */
public class BankATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, uang, saldo;
        int saldoku = 1500000;
        System.out.println("---Selamat Datang di Bank Unan---");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil Uang");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        pilih = input.nextInt();
        System.out.println();
        switch (pilih) {
            case 1:
                System.out.println("Saldo Anda saat ini: Rp " + saldoku);
                break;

            case 2:
                System.out.print("Masukkan jumlah uang yang ingin ditarik: Rp ");
                uang = input.nextInt();
                if (uang > saldoku) {
                    System.out.println("Saldo Anda tidak mencukupi!");

                } else if (uang <= 0) {
                    System.out.println("Jumlah penarikan tidak valid!");

                } else {
                    saldoku -= uang;
                    System.out.println("Penarikan berhasil!");
                    System.out.println("Saldo Anda sekarang: Rp " + saldoku);

                }
                break;
            case 3:
                System.out.print("Masukkan jumlah uang yang ingin disetor: Rp ");
                uang = input.nextInt();
                if (uang <= 0) {
                    System.out.println("Jumlah setor tidak valid!");

                } else {
                    saldoku += uang;
                    System.out.println("Setoran berhasil!");
                    System.out.println("Saldo Anda sekarang: Rp " + saldoku);

                }
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan ATM kami.");
                break;
            default:
                System.out.println("Pilihan tidak valid, silakan coba lagi!");

        }
        System.out.println();
    }
}
