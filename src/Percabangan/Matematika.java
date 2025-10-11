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
public class Matematika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double angka1, angka2, hasil;
        System.out.println("=== Menu Aplikasi Matematika ===");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Keluar");
        System.out.print("Pilih operasi (1-5): ");
        pilihan = input.nextInt();
        if (pilihan >= 1 && pilihan <= 4) {
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextDouble();
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println("Hasil penambahan: " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    System.out.println("Hasil pengurangan: " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    System.out.println("Hasil perkalian: " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil pembagian: " + hasil);

                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");

                    }
                    break;
            }
        } else if (pilihan == 5) {

        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");

        }
        System.out.println(); // spasi antar operasi

       

    }
}
