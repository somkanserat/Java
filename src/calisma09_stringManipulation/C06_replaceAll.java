package calisma09_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        //kullanıcıdan bir metin isteyin. metindeki boşluk ve harf olmayan her şeyi silin.
        //ornek: J1a4v*a )G*&^56uzel_!dir.
        //       Java güzeldir

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz:");
        String metin = input.nextLine();    //

        //önce sayılardan kurtulalım
        metin = metin.replaceAll("\\d" ,"");
        System.out.println(metin);  //Jav*a )G*&^uzel_!dir.

        //özel karakterleri silmeden önce " " boşlukları korumaya almamız gerekir.
        //yukarda sayıları yok etmiştik. space yerine herhangi bir rakam yazalım

        metin = metin.replace(" ", "8");
        System.out.println(metin); //Jav*a8)G*&^uzel_!dir.


        //özel karakterlerden kurtulalım
        metin = metin.replaceAll("\\W", "");
        System.out.println(metin); //Java8Guzel_dir

        //_'leri yok edelim.
        metin = metin.replaceAll("_","");
        System.out.println(metin); //Java8Guzeldir

        //space yerine 8 yazmışık. yeniden space yapalım.
        metin = metin.replaceAll("8", " ");
        System.out.println(metin); //Java Guzeldir

        //en sona nokta ekleyelim.
        metin+=".";
        System.out.println(metin);


    }
}
