package calisma09_stringManipulation;

import java.util.Scanner;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str = "Java ile yazılım dünyasına giriş yap.";

        str.replaceFirst("a", "A"); //JAva ile yazılım dünyasına giriş yap.

        //str.replaceFirst('a','A'); replaceFirst() char parametre kabul etmez.

        str = "Java 1-3 ayda öğretilir";
        System.out.println(str.replace("1", "2")); //Java 2-3 ayda öğretilir.

        //kullanıcıdan bir cümle isteyin. Eger cümle içinde rakam varsa, ilk rakam yerine X yazsın.

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz:");
        String cumle = input.nextLine();

        // regex regular expression ==> belirlenmiş kısaltmalar

        /*
            \\d	Bir rakam (0-9)
            \\D	Rakam olmayan karakter
            \\w	Bir kelime karakteri (a-z, A-Z, 0-9 ve _ )
            \\W	Kelime karakteri olmayan bir karakter
            \\s	Beyaz boşluk karakteri (boşluk, tab, yeni satır vb.)
            \\S	Beyaz boşluk olmayan karakter
         */

        System.out.println(cumle.replaceFirst("\\d","X"));



    }
}
