package calisma05_ifElseStatements;

import java.util.Scanner;

public class C11_kucukHarfKontrol {

    public static void main(String[] args) {

        //Kullanıcıdan harf isteyin. Girilen küçük mharf ise onu büyük harf yapın.


        Scanner input = new Scanner(System.in);

        System.out.print("Harf giriniz: ");
        char harf = input.next().charAt(0);

        //-----1.yöntem ASCII Table---------
        /*
        if (harf >= 'a' && harf <= 'z'){
            System.out.println("Girilen küçük harfi büyük harfe çevirdim: " + ((char)(harf - 32)) );
                                                                            //tabloda aralarında 32 fark olduğu için, böyle bir yöntem kullandık.
        }

        else {
            System.out.println(harf + ", büyük harftir.");
        }
        */

        //----2.yöntem Wrapper Case----------

        if ( Character.isLowerCase(harf)){
            System.out.println(Character.toUpperCase(harf));
        }
        else System.out.println(harf + ", büyük harftir.");

    }
}
