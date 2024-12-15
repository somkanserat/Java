package calisma04_matIslemler_Concatenation_Logical;

import java.util.Scanner;

public class C02_MatematikselIslemler {
    public static void main(String[] args) {

        //Kullanıcıdan 4 basamaklı pozitif bir tam sayı alıp, rakamlar toplamını bulalım.

        Scanner input = new Scanner(System.in);

        System.out.println("4 Basamaklı Pozitif Tam Sayı Giriniz:");
        int sayi = input.nextInt();

        int birler = sayi%10;
        int onlar = (sayi/10)%10;
        int yuzler = (sayi/100)%10;
        int binler = (sayi/1000)%10;

        System.out.println("Rakamlar Toplamı:" +(int)(birler+onlar+ yuzler +binler));

    }
}
