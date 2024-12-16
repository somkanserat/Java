package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C07_NestedIfElse_HarfKontrolu {

    public static void main(String[] args) {

        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin
           Kullanici harfler disinda bir karakter girerse
                - "Tanimlanmamis karakter" yazdirin
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir karakter giriniz:");
        char girilenKarakter = input.next().charAt(0);

        //değişken tek ama 2 kademeli bir seçim yapmalıyız.
        //1.kademe küçük/büyük harf ve geriye kalanlar


        if(girilenKarakter >= 'a' && girilenKarakter <='z'){ //küçük harf seçimi ASCII ile
            if (girilenKarakter == 'a'){
                System.out.println("Güzel harf.");
            }
            else if (girilenKarakter == 'b' || girilenKarakter == 'c' || girilenKarakter == 'd') {
                System.out.println("İdare eder.");
            }
            else {
                System.out.println("Girilen harfi beğenmedim.");
            }
        }

        else if (Character.isUpperCase(girilenKarakter)) { //Büyük harf seçimini Wrapper Class ile
            if (girilenKarakter == 'K'){
                System.out.println("Güzel harf.");
            }
            else if (girilenKarakter == 'L' || girilenKarakter == 'V' ||girilenKarakter == 'Z'  ) {
                System.out.println("İdare Eder.");
            }
            else {
                System.out.println("Girilen harfi beğenmedim.");
            }
        }

        else {
            System.out.println("Tanımlanmamış karakter.");
        }

    }
}
