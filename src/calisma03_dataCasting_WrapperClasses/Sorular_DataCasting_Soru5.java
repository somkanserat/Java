package calisma03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class Sorular_DataCasting_Soru5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ondalıklı Sayıyı Giriniz:");
        double sayi1 = input.nextDouble();
        System.out.println("Tam Sayıyı Giriniz:");
        int sayi2 = input.nextInt();

        int tamsayi = ((int) sayi1/sayi2);
        System.out.println("Bölümden Kalan Tam Sayı:" +tamsayi);

    }
}
