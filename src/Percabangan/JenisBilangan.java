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
public class JenisBilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilang bulat: ");
        int bilangan = input.nextInt();
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
        }
        input.close();
    }
}
