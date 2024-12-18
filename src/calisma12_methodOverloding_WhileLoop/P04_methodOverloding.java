package calisma12_methodOverloding_WhileLoop;

import java.util.Scanner;

public class P04_methodOverloding {

    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz:");
        int sayi = input.nextInt();

        int rakamlarToplami = 0;

        while (sayi>0){

            rakamlarToplami+=sayi%10;
            sayi=sayi/10;

        }
        System.out.println("Rakamlar Toplamı:"+rakamlarToplami);
    }
}
