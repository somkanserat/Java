package calisma13_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tam sayı giriniz:");
        int girilenSayi = input.nextInt();

        //1.negatif durum: loop body calisma sayisinden daha fazla kontrol var
        /*
        while (girilenSayi>0){

            System.out.print(girilenSayi+ " ");
            girilenSayi--;
        }
        */

        /*

        //Loop body calısma sayısı ile kontrol sayısı aynı
        do {
            System.out.print(girilenSayi+ " ");
            girilenSayi--;
        }
        while (girilenSayi>0);

        */


    }
}
