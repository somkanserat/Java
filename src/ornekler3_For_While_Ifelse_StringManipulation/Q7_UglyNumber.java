package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q7_UglyNumber {

    /*7-----

        Ugly Number:
        Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.

        Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
        İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

        Test Data:
        13

        Beklenen çıktı:
        ugly number  degildir

        Test Data:
        25
        Beklenen Çıktı:
        ugly number
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı değeri giriniz:");
        int sayi = scan.nextInt();

        if (sayi%2==0 || sayi%3==0 || sayi%5==0 ){ // ||sayi ==1

            System.out.println("ugly number");
        }
        else if (sayi == 1) {
            System.out.println("ugly number");
        }
        else {
            System.out.println("ugly number değildir");
        }

    }
}
