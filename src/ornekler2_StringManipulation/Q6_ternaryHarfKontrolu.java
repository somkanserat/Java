package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q6_ternaryHarfKontrolu {

    public static void main(String[] args) {

        /*
            Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
            * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
            * Test data: ali eme all
         */

        Scanner input = new Scanner(System.in);

        System.out.print("3 harfli isim giriniz:");
        String isim = input.nextLine();

        char x = isim.charAt(0);
        char y = isim.charAt(1);
        char z = isim.charAt(2);

        if (isim.length() == 3){
            System.out.print((x == y) && (y == z)? "Harflerin hepsi aynıdır.": "Harflerin hepsi aynı değildir.");
        }
        else {
            System.out.println("Girilen isim 3 harfli değildir.");
        }


    }
}
