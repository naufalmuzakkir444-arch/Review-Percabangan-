/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author USER MSI
 */
public class Penambahan {
    public static void main (String[] args) {
        int x ,y ,z;
        x= 42;
        
        y= x++;
        //tampilkan x, y saat ini
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
        
        z= ++x;
        //tampilkan x, z saat ini
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai z : " + z);
    }
}
