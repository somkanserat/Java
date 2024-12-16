package calisma05_ifElseStatements;

import java.util.Scanner;

public class C12_SayiKontrolu {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int sayi = input.nextInt();

        if(sayi<0){
            System.out.println("Negatif sayı girdiniz.");
        }

        else if(sayi>0 && sayi<10){
            System.out.println("Girdiğiniz sayı rakamdır.");
        }

        else if(sayi>=10 && sayi<=99){
            System.out.println("Girdiğiniz sayı iki basamaklıdır.");
        }

        else if(sayi>=100 && sayi<=999){
            System.out.println("Girdiğiniz sayı üç basamaklıdır.");
        }
        else {
            System.out.println("Girdiğiniz sayı çok büyüktür.");
        }
    }
}