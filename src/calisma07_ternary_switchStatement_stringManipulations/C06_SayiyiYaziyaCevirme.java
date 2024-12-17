package calisma07_ternary_switchStatement_stringManipulations;

import java.util.Scanner;

public class C06_SayiyiYaziyaCevirme {

    public static void main(String[] args) {

        //Kullanicidan 100'den küçük bir doğal sayı girmesini isteyin.(0-99,sınırlar dahil)
        //Girilen sayiyi metin olarak yazdırın

        Scanner input = new Scanner(System.in);

        System.out.print("0 ve 100 kullanılamaz\n0-99 arası bir sayı giriniz:");
        int sayi = input.nextInt();

        int birlerBasamagi = sayi%10;
        int onlarBasamagi = sayi/10;

        switch (onlarBasamagi){

            case 0:
                break;
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmış");
                break;
            case 7:
                System.out.print("Yetmiş");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }

        switch (birlerBasamagi){

            case 0:
                break;
            case 1:
                System.out.print(" bir");
                break;
            case 2:
                System.out.print(" iki");
                break;
            case 3:
                System.out.print(" üç");
                break;
            case 4:
                System.out.print(" dört");
                break;
            case 5:
                System.out.print(" beş");
                break;
            case 6:
                System.out.print(" altı");
                break;
            case 7:
                System.out.print(" yedi");
                break;
            case 8:
                System.out.print(" sekiz");
                break;
            case 9:
                System.out.print(" dokuz");
                break;
        }

    }
}
