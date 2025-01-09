package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q1_BoslukKontrol {

    public static void main(String[] args) {

        //-Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Metin Giriniz:");
        String metin = input.nextLine();

        //contains() --> içerip içermediğini kontrol eder ve sonucu boolean yazdırır.
        System.out.println(metin.contains(" "));

    }
}
