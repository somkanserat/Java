package calisma05_ifElseStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        //Kullanıcıdan iki tam sayi isteyin.
        Scanner input = new Scanner(System.in);

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        //eğer sayi1 daha büyükse, Girilen ilk sayı daha büyüktür. yazsın.

        if(sayi1>sayi2) {
            System.out.println("Girilen ilk sayı daha büyüktür.");
        }

        //eğer 2.sayı cift sayi ise "Girilen sayi çifttir." yazsın.

        if (sayi2 % 2 == 0) {
            System.out.println("Girilen 2.sayi çift");
        }

        //sayi1 pozitif ise, "Pozitif sayılar güzeldir." yazsın

        if(sayi1 > 0){

            System.out.println("Pozitif sayılar güzeldir.");
        }


    }
}
