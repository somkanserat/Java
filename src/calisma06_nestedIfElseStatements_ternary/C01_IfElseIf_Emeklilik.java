package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C01_IfElseIf_Emeklilik {

    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir”
        //yazdirin.

        Scanner input = new Scanner(System.in);

        System.out.print("Cinsiyet: E/K\nCinsiyetinizi Girin:");
        char cinsiyet = input.next().charAt(0);

        System.out.print("Yaşınızı Giriniz:");
        int yas = input.nextInt();

        if(cinsiyet == 'E' && yas>=65){
            System.out.println("Emekli olabilirsiniz.");
        }

        else if(cinsiyet == 'E' && yas<65){
            System.out.println("Emekli olabilmek için "+(65-yas) +" yıl daha çalışmanız gerekmektedir.");
        }

        else if (cinsiyet == 'K' && yas>=60) {
            System.out.println("Emekli olabilirsiniz.");
        }

        else if (cinsiyet == 'K' && yas<60){
            System.out.println("Emekli olabilmek için "+(60-yas) +" yıl daha çalışmanız gerekmektedir.");
        }
        else {
            System.out.println("Yanlış değerler girilmiştir.");
        }

    }
}
