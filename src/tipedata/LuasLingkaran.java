/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author USER MSI
 */
public class LuasLingkaran {
  public static void main(String[] args){
       final double PI = 3.141592;
       double r = 11.78;
       double luasLingkaranPecahan = PI * r * r;
       int luasLingkaranBulat =(int) (PI * r * r);
       double luasLingkaranRound = Math.round(luasLingkaranPecahan);
       
       System.out.println("Luas Lingkaran");
       System.out.println("Dalam Pecahan :" + luasLingkaranPecahan);
       System.out.println("Dalam Bilangan Bulat :" + luasLingkaranBulat);
       System.out.println("Dalam Pembulatan :" + luasLingkaranRound);   
  }
}
