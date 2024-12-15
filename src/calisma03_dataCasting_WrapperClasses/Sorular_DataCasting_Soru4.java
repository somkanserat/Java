package calisma03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class Sorular_DataCasting_Soru4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1.Ondalıklı Sayıyı Giriniz:");
        double sayi1 = input.nextDouble();
        System.out.println("2.Ondalıklı Sayıyı Giriniz:");
        double sayi2 = input.nextDouble();

        int tamsayi = ((int)(sayi1/sayi2));
        System.out.println("Bölümün Tam Sayısı:" +tamsayi);

    }
}
