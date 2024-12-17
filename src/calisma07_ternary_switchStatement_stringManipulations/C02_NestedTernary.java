package calisma07_ternary_switchStatement_stringManipulations;

import java.util.Scanner;

public class C02_NestedTernary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tam Sayı Giriniz:");
        int sayi =input.nextInt();

        System.out.println(

                sayi>0

                ?
                        // sayi pozitif ise çalışacak kodlar
                sayi%2==0? "Çift Sayı" : "Çift sayı değil"

                :

                //sayı pozitif değilse çalışacak kodlar
                sayi>=-999 && sayi<=-100? "3 Basamaklı sayi" : "3 basamaklı sayi değil"
        );

    }
}
