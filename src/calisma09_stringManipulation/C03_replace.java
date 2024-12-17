package calisma09_stringManipulation;

import java.util.Scanner;

public class C03_replace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "Java öğrenmek çok güzel";

        System.out.println(str.replace("a","A"));
        System.out.println(str.replace('e','E'));
        System.out.println(str.replace("öğrenmek","bilmek"));

        //tüm boşlukları silip, metni boşluk olmadan yazdır.

        System.out.println(str.replace(" ",""));



        //kullanıcıdan cümledeki değiştirmek istediğimiz kismi
        //ve yerine koymak istediği metni alın
        //cümleyi yeni haliyle yazın

        System.out.println("Cumledeki değiştirmek istediğiniz kısmı yazın:");
        String eskiMetin = input.nextLine();

        System.out.println("Yerine yazmak istediğiniz metni yazın:");
        String yeniMetin = input.nextLine();

        System.out.println(str.replace(eskiMetin,yeniMetin));

    }
}
