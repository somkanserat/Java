package calisma07_ternary_switchStatement_stringManipulations;

import java.util.Scanner;

public class C05_HaftaIcıHaftaSonu {

    public static void main(String[] args) {

        //kullanıcıdan gün ismini alın. Büyük küçük harf etmez.
        //girilen günün hafta içi veya haftasonu olduğunu yazdırın.

        Scanner input = new Scanner(System.in);

        System.out.print("Gün ismini giriniz:");
        String gunIsmi = input.nextLine().toLowerCase(); //girilen değeri küçük harf yaptı

        switch (gunIsmi){

            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Haftaiçi");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;

            default:
                System.out.println("Yanlış değer girdiniz.");
        }
    }
}
