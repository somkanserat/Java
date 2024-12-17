package calisma07_ternary_switchStatement_stringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {

    public static void main(String[] args) {

        /*
            Switch statements
            Switch parantezine yazılan variable'in, alabileceği değerlere göre case'ler oluştururuz.

            Switch parantezine "boolean,long,float ve double" variable'ler yazılamaz.
            Yazılanlar; "String, char, short, byte,int"

            switch, çalışmaya başladığında, uygun olan case'e gider.
            "break;" komutu ile karşılaşırsa, durdurur. Bu komut olmazsa, switch sonuna kadar gider.

         */

        //Kullanıcıdan rakam olarak gün no alın, günün ismini yazdırın

        Scanner input = new Scanner(System.in);

        System.out.print("Gün NO Giriniz:");
        int gunNo = input.nextInt();

        switch (gunNo){

            case 1: //gün no değerinin 1 olamsı durumunda
                System.out.println("Günlerden pazartesi.");
            break;

            case 2:
                System.out.println("Günlerden salı.");
                break;

            case 3:
                System.out.println("Günlerden çarşamda.");
                break;

            case 4:
                System.out.println("Günlerden perşembe.");
                break;

            case 5:
                System.out.println("Günlerden cuma.");
                break;

            case 6:
                System.out.println("Günlerden cumartesi.");
                break;

            case 7:
                System.out.println("Günlerden pazar.");
                break;

            default:
                System.out.println("Yanlış değer girdiniz.");
        }

        //switch()'de long,float,double ve boolean kullanılmaz.
        //byte,short,int,char ve String kullanılır.

    }
}
