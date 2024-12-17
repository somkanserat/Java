package calisma09_stringManipulation;

import java.util.Scanner;

public class C10_IsimDuzenleme {

    public static void main(String[] args) {

        /*
            Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz:");
        String isim = input.nextLine();

        System.out.print("Lütfen soyisminizi giriniz:");
        String soyisim = input.nextLine();

        if (isim.length() > soyisim.length()){
            // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                            //isim.toUppercase.charAt(0)+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).toLowerCase()
            );

        }
        else if (soyisim.length()>isim.length()) {
            //ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.substring(0).toUpperCase()
            );

        }
    }
}
