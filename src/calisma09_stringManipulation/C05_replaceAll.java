package calisma09_stringManipulation;

import java.util.Scanner;

public class C05_replaceAll {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "Ali okula gitti. 3 saat sonra gelecek.";

        //tüm t'leri T yap.
        System.out.println(str.replace("t", "T"));

        //3 yerine 2 yap.
        System.out.println(str.replace("3", "2"));

        //replace methodu verilen metinde aranan char veya string'in tüm kullanımlarını bulur ve değiştirir.
        //cümleyi değiştir.

        //replaceAll'un farkı, regex kullanılabilmesidir.(örn; bulduğun ilk spaceyi yok et.)

        str = "ben 2 veya 3 saat sonra gelirim.";

        //tüm sayıları 5 yap.
        System.out.println(str.replaceAll("\\d" , "5"));

    }
}
