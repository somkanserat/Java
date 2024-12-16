package calisma05_ifElseStatements;

import java.util.Scanner;

public class C05_Bagimsiz_IfleriTopluDegerlendirme {

    public static void main(String[] args) {

        //Soru: Kullanıcıdan 2 tam sayı isteyin
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        Scanner input = new Scanner(System.in);

        System.out.print("1.sayi:");
        int sayi1 = input.nextInt();
        System.out.print("2.sayi:");
        int sayi2 = input.nextInt();

        if(sayi1 < sayi2){
            System.out.println("1.Sayı daha küçüktür.");
        }

        if(sayi1 > 0){
            System.out.println("1.Sayı 0'dan büyüktür.");
        }

        if(sayi2 > 50){
            System.out.println("2.Sayı 50'den büyüktür.");
        }

        if(sayi2 % 5 == 0){
            System.out.println("2.Sayı 5'in katıdır.");
        }

        if( !(sayi1 < sayi2) && !(sayi1 > 0) && !(sayi2 > 50) && !(sayi2 % 5 == 0) ){
            System.out.println("Hiçbir şartı sağlamadı");
        }


    }

}
