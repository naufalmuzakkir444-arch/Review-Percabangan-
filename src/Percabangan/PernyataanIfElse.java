/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

/**
 *
 * @author USER MSI
 */
public class PernyataanIfElse {

    public static void main(String[] args) {
        double diskon = 0, totalBelanja = 50000;

        if (totalBelanja >= 100000) {
            diskon = totalBelanja / 10;
        } else {
            diskon = totalBelanja * 2.5 / 100;
        }
        System.out.println("Diskon = " + diskon);
    }
}
