package calisma07_ternary_switchStatement_stringManipulations;

import java.util.Scanner;

public class C04_Çalışma {

    public static void main(String[] args) {

        //kullanıcıdan gün ismini alın. Büyük küçük harf etmez.
        //girilen gün haftaiçi ise, o gün hariç hafta sonuna kaç gün kaldığını yazdırın.
        //Cumartesi ise, bugün tatilin ilk günü
        //Pazar günü ise maalesef yarın iş başlıyor
        //Gün ismini yanlış yazarsa uyarın.

        Scanner input = new Scanner(System.in);

        System.out.print("Gün ismini giriniz:");
        String gunIsmi = input.nextLine().toLowerCase(); //girilen değeri küçük harf yaptı

        switch (gunIsmi){

            case "pazartesi":
                System.out.println("Tatile daha 4 gün var.");
                break;

            case "salı":
                System.out.println("Tatile daha 3 gün var.");
                break;

            case "çarşamba":
                System.out.println("Tatile daha 2 gün var.");
                break;

            case "perşembe":
                System.out.println("Tatile daha 1 gün var.");
                break;

            case "cuma":
                System.out.println("Yarın tatil.");
                break;

            case "cumartesi":
                System.out.println("Tatilin 1.günü");
                break;

            case "pazar":
                System.out.println("Maalesef yarın iş başı..");
                break;

            default:
                System.out.println("Yanlış değer girdiniz.");


        }



    }
}
