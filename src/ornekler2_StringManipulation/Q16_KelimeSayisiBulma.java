package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q16_KelimeSayisiBulma {

    public static void main(String[] args) {

        /*
            Q16 -   Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
            Test Data:
                Input the string: The quick brown fox jumps over the lazy dog.
                Expected Output: Number of words in the string: 9
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Input the string:");
        String cumle = input.nextLine();
        cumle = cumle.trim();

        kacKelime(cumle);

    }

    public static void kacKelime(String cumle){

        int cumleUzunlugu = cumle.length();
        cumle = cumle.replaceAll(" ","");

        int yeniCumleUzunlugu = cumle.length();

        int boslukSayisi =  (cumleUzunlugu - yeniCumleUzunlugu + 1);
        System.out.println("Kelime Sayısı:"+boslukSayisi);

    }

    /*

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz...");
        String cumle =scanner.nextLine().trim();

        //cumle = cumle.trim();  başında ki ve sonundaki boşlukları aldık


        kacKelime(cumle);


    }
    public static void kacKelime(String cumle){

        char bosluk =' ';

        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==bosluk){

                sayac++;
            }

        }
        System.out.println(sayac+1);
    }

     */
}
