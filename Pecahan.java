
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package septia;
import  java.util.*;
/**
 *
 * @author ASUS
 */
public class Pecahan {
 public static void main(String[] args) {
        double pembilang;
        double penyebut;
        double hasil;

        Scanner input = new Scanner(System.in);
        
        System.out.println("masukan Pembilang");
        pembilang=input.nextDouble();
        System.out.println("");
        System.out.println("masukan penyebut");
        penyebut=input.nextDouble();
        System.out.println("");
        
        hasil = pembilang/penyebut;
        System.out.println("Hasilnya adalah : "+hasil);
    } 
}   

