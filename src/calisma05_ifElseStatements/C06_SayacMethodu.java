package calisma05_ifElseStatements;

import java.util.Scanner;

public class C06_SayacMethodu {

    public static void main(String[] args) {

        //Soru: Kullanıcıdan 2 tam sayı isteyin
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin
        // 6- Tüm şartlar sağlanıyorsa, "Mükemmel Sayı Seçtiniz" yazın
        // 7- Eğer 2 şart sağlanırsa, "İdare eder" yazsın.

        Scanner input = new Scanner(System.in);

        System.out.print("1.sayi:");
        int sayi1 = input.nextInt();
        System.out.print("2.sayi:");
        int sayi2 = input.nextInt();

        int sayac = 0;

        if(sayi1 < sayi2){
            System.out.println("1.Sayı daha küçüktür.");
            sayac++;
        }

        if(sayi1 > 0){
            System.out.println("1.Sayı 0'dan büyüktür.");
            sayac++;
        }

        if(sayi2 > 50){
            System.out.println("2.Sayı 50'den büyüktür.");
            sayac++;
        }

        if(sayi2 % 5 == 0){
            System.out.println("2.Sayı 5'in katıdır.");
            sayac++;
        }

        if (sayac == 0){
            System.out.println("Hiçbir şartı sağlamadı");
        }

        if (sayac == 4){
            System.out.println("Mükemmel sayılar seçtiniz.");
        }

        if (sayac == 2){
            System.out.println("İdare Eder");
        }

    }
}
