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
public class HitungHari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        System.out.print("Masukkan bulan: ");
        int bulan = input.nextInt();
        int jumlahHari;
        if (tahun <= 0) {
            System.out.println("Error: Tahun harus lebih dari 0.");
            return;
        }
        switch (bulan) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
            case 2:
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                System.out.println("Invalid error.");
                return;

        }
        System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah " + jumlahHari + " hari");
    }
}
