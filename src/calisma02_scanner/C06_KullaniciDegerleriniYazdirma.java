package calisma02_scanner;

import java.util.Scanner;

public class C06_KullaniciDegerleriniYazdirma {

    public static void main(String[] args) {

        //Kullanıcıdan ismini, Soyismini ve yasini yazdırın

        Scanner input = new Scanner(System.in);


        System.out.println("Adınız:");
        // String isim = input.next(); --> bu ilk space'ye kadar olan kısmı alır
        String isim = input.nextLine(); //bütün satırı alır

        System.out.println("Soyadınız:");
        String soyisim = input.nextLine();

        System.out.println("Yaşınızı Giriniz:");
        int yas = input.nextInt();

        //System.out.println("Kaydınız Başarıyla Tamamlanmıştır");

        //2.yol

        System.out.println(
                "\nAdınız:" +isim +
                    "\nSoyadınız:" +soyisim +
                        "\nYaşınız:" +yas +
                            "\nKaydınız Başarıyla Tamamlanmıştır"
        );
    }
}
