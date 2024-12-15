package calisma02_scanner;

import java.util.Scanner;

public class C09_Swap_DegerleriYerDegistirme {

    public static void main(String[] args) {
        /*
        //Kullanıcıdan İki Sayı alıp, ikisinin değerlerini değiştirin(swap)

        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayıyı Giriniz:");
        int sayi1 = input.nextInt();

        System.out.println("2.Sayıyı Giriniz:");
        int sayi2 = input.nextInt();

        System.out.println("Sayi1'in yeni değeri: " +sayi2);
        System.out.println("Sayi2'nin yeni değeri: " +sayi1);
        */

        //2.YOL

        Scanner input = new Scanner(System.in);

        int sayi3;

        System.out.println("1.Sayıyı Giriniz:");
        int sayi1 = input.nextInt();

        System.out.println("2.Sayıyı Giriniz:");
        int sayi2 = input.nextInt();

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;
        System.out.println("Sayı 1'in Yeni Değeri:" +sayi1);
        System.out.println("Sayı 2'nin Yeni Değeri:" +sayi2);


    }

}
