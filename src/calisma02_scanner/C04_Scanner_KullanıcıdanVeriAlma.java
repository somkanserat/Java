package calisma02_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanıcıdanVeriAlma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan bir sayi alin ve karesini yazdirin
        // Objenin adini istedigimiz gibi belirleyebiliriz ANCAK Scanner Class'ından bir obje oldugunu belirten isim olmalı

        int sayi;

        System.out.println("Karesi Alınacak Sayıyı Giriniz:");
        //Kullanıcıdan istediğimiz datanın türüne uygun next...() methodunu kullanıp, konsoldan değeri alın
        sayi = input.nextInt();
        sayi = sayi * sayi;
        System.out.println("Girilen Sayının Karesi:" +sayi);

    }
}
