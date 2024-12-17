package calisma09_stringManipulation;

import java.util.Scanner;

public class C11_IsimDuzenleme {

    public static void main(String[] args) {

        /*
            Kullanıcıdan bir String alın
            String'in uzunluğu çift sayi ise tam ortasına :) ekleyin
            String'in uzunluğu tek sayi ise ortadaki harfi silin ve yerine :( yazdırın
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz:");
        String metin = input.nextLine();

        if (metin.length() %2 == 0){
            //tam ortasına :) ekleyin

            System.out.println(
                    metin.substring(0, metin.length()/2)+
                    ":)"+
                    metin.substring(metin.length()/2)
            );

        }
        else {
            //ortadaki harfi silin ve yerine :( yazdırın
            System.out.println(
                    metin.substring(0, metin.length()/2)+
                    ":("+
                    metin.substring(metin.length()/2+1)

            );

        }

    }
}
