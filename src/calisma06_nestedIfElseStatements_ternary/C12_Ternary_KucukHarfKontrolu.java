package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C12_Ternary_KucukHarfKontrolu {

    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //yoksa girilen harfi yazdirin

        Scanner input = new Scanner(System.in);

        System.out.print("Harf giriniz: ");
        char harf = input.next().charAt(0);

        System.out.println(Character.isLowerCase(harf) ? Character.isUpperCase(harf): harf);

    }
}
