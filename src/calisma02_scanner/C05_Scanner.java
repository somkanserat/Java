package calisma02_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //Kullanıcıdan bir double, bir de int sayı alıp, bunların toplamını ve çarpanını yazdırın

        Scanner input = new Scanner(System.in);

        System.out.println("Ondalıklı Sayı Giriniz:");
        double ondaliklisayi = input.nextDouble();

        System.out.println("Bir Tam Sayı Giriniz:");
        int tamSayi = input.nextInt();



        System.out.println("Sayıların Toplamı:"+(ondaliklisayi + tamSayi));
        System.out.println("Sayıların Çarpımı:"+(ondaliklisayi * tamSayi));
    }
}
