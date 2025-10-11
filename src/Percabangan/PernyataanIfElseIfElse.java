/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

/**
 *
 * @author USER MSI
 */
public class PernyataanIfElseIfElse {

    public static void main(String[] args) {
        double skorUjian = 50;
        String nilai;

        if (skorUjian < 0 || skorUjian > 100) {
            System.out.println("Nilai yang anda masukkan salah");
        } else {
            if (skorUjian >= 90) {
                nilai = "A";
            } else if (skorUjian >= 80) {
                nilai = "B";
            } else if (skorUjian >= 70) {
                nilai = "C";
            } else {
                nilai = "D";
            }
            System.out.println("Nilai = " + nilai);
        }
    }
}
