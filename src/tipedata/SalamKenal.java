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
public class SalamKenal {
    public static void main (String[] args)
    {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukan Nama Anda: ");
        String nama = masukan.nextLine();
        
        System.out.println("Halo, Salam Kenal sdr. " + nama +"!");
    }        
}
