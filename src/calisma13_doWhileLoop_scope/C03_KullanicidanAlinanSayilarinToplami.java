package calisma13_doWhileLoop_scope;

import java.util.Scanner;

public class C03_KullanicidanAlinanSayilarinToplami {

    public static void main(String[] args) {

        //kullanıcıdan, toplanmak üzere tamsayıları isteyin
        //kullanıcı 0'a basıncaya kadar işlemi devam ettirin
        //kullanıcı 0'a bastığında kaçsayı girdiğini ve toplamlarının
        //kaç olduğunu yazdırın

        Scanner input = new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        int sayac=0;

        /*
        while (girilenSayi != 0){
            System.out.print("(Bitirmek için lütfen 0'a basınız.)\nLütfen toplanmak üzere bir sayi giriniz:");
            girilenSayi = input.nextInt();

            if (girilenSayi !=0){
                toplam+=girilenSayi;
                sayac++;
            }
        }
        System.out.println("Girilen "+sayac +" adet sayının toplamı:"+toplam);

         */

        //bizim ilk atama yaptığımız değeriwhile kontrolüne sokmadan
        //kullanıcıdan değer alıyor.
        //böylece ilk değer ataması yaparen hata yapmamızı engelliyor.
        do {
            System.out.print("(Bitirmek için lütfen 0'a basınız.)\nLütfen toplanmak üzere bir sayi giriniz:");
            girilenSayi = input.nextInt();

            if (girilenSayi !=0){
                toplam+=girilenSayi;
                sayac++;
            }

        }
        while (girilenSayi != 0);
            System.out.println("Girilen "+sayac +" adet sayının toplamı:"+toplam);

    }
}
