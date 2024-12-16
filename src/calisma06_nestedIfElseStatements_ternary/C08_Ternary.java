package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C08_Ternary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir tam sayı giriniz:");
        int sayi = input.nextInt();

        //Girilen sayı 100'den küçük ise "küçük sayi", 100 ve daha büyükse "büyük sayı" yazdır.

        System.out.println(sayi<100? "küçük sayi": "büyük sayi");

        System.out.println(sayi%2 == 0 ? "çift sayi": "tek sayi");

    }
}
