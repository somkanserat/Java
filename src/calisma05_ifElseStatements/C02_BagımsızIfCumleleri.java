package calisma05_ifElseStatements;

import java.util.Scanner;

public class C02_BagımsızIfCumleleri {

    public static void main(String[] args) {

        //Soru-3 Kullanıcıdan bir sayi alın, sayi 3 ile bölünüyorsa "3 ile bölünebilen bir sayı"
        //5 ile bölünüyorsa "5 ile bölünebilen bir sayı" yazsın

        Scanner input = new Scanner(System.in);

        int girilensayi = input.nextInt();

        if(girilensayi % 3 == 0){

            System.out.println("3 ile bölünebilen bir sayı");
        }

        if(girilensayi % 5 == 0){

            System.out.println("5 ile bölünebilen bir sayı");
        }

    }
}
