/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

/**
 *
 * @author USER MSI
 */
public class IfElseIfAnd {

    public static void main(String[] args) {
        int skorUjian = 100;
        String nilai = "";

        if (skorUjian >= 0 && skorUjian <= 100) {
            if (skorUjian >= 90) {
                nilai = "A";
            } else if (skorUjian >= 80) {
                nilai = "B";
            } else if (skorUjian >= 70) {
                nilai = "C";
            }
            System.out.println("Nilai : " + nilai);
        } else {
            System.out.println("skor tidak valid, harus 0 - 100");
        }
    }
}
