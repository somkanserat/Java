package calisma18_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Fibonacci {

    public static void main(String[] args) {
        /*
        // Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        // bir liste olarak yazdırın

        List<Integer> fibonacciSerisi = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen fibonacci sayılarını yazdırmak için üst sayı sınırını girin:");
        int maxSayi = scan.nextInt();

        //kullanıcı negatif ==> hata
        //kullanıcı 0 girerse? ==> 0
        //kullanıcı 1 girerse? ==> 1
        //kullanıcı 1'den büyük değer? ==> 0,1,...

        if (maxSayi<0){
            System.out.println("Girilen değer pozitif olmalıdır.");
        }
        else if (maxSayi==0) {
            fibonacciSerisi.add(0);
        }
        else if (maxSayi==1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        }
        else {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int sonrakiSayi = 0;
            int sonrakiIndex = 3;

            while (sonrakiSayi<=maxSayi){

                sonrakiSayi = fibonacciSerisi.get(sonrakiIndex-2)+fibonacciSerisi.get(sonrakiIndex-1);

                if (sonrakiSayi<=maxSayi){
                    fibonacciSerisi.add(sonrakiSayi);
                }
                sonrakiIndex++;

            }
            System.out.println(fibonacciSerisi);
        }
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen fibonacci sayılarını yazdırmak için üst sayı sınırını girin:");
        int maxSayi = scan.nextInt();

        System.out.println(fibonacciListeOlustur(maxSayi));
    }


    //Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
    //bir liste olarak bize donduren bir method olusturun.

    public static List<Integer> fibonacciListeOlustur(int maxSayi){

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (maxSayi<0){
            System.out.println("Girilen değer pozitif olmalıdır.");
        }
        else if (maxSayi==0) {
            fibonacciSerisi.add(0);
        }
        else if (maxSayi==1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        }
        else {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int sonrakiSayi = 0;
            int sonrakiIndex = 3;

            while (sonrakiSayi<=maxSayi){

                sonrakiSayi = fibonacciSerisi.get(sonrakiIndex-2)+fibonacciSerisi.get(sonrakiIndex-1);

                if (sonrakiSayi<=maxSayi){
                    fibonacciSerisi.add(sonrakiSayi);
                }
                sonrakiIndex++;

            }
        }
        return fibonacciSerisi;
    }
}
