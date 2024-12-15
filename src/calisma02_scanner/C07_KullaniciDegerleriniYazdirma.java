package calisma02_scanner;

import java.util.Scanner;

public class C07_KullaniciDegerleriniYazdirma {

    public static void main(String[] args) {

        //girilen bilgiler J Doe, 44

        Scanner input = new Scanner(System.in);

        System.out.println("Adınız:");
        String isim = input.nextLine(); //bütün satırı alır

        System.out.println("Soyadınız:");
        String soyisim = input.nextLine();

        System.out.println("Yaşınızı Giriniz:");
        int yas = input.nextInt();

        System.out.println(

                "girilen bilgiler : " +isim.charAt(0) +
                        " " +soyisim + "," + yas
        );

    }
}
