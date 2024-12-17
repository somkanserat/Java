package calisma09_stringManipulation;

import java.util.Scanner;

public class C07_replaceAll_KrediKarti {

    public static void main(String[] args) {

        //Kullanıcıdan ismini, soyismini ve kredi kartı no alın.
        //Bilgileri aşağıdaki gibi yazdırın.
        //Girilen Bilgiler: C** D****, **** **** **** 4567

        Scanner input = new Scanner(System.in);

        System.out.print("İsminizi Giriniz:");
        String isim = input.nextLine();

        System.out.print("Soyisminizi Gİriniz:");
        String soyisim = input.nextLine();

        System.out.print("Kredi Kartı Numaranızı Girin:");
        String kartNo = input.nextLine();

        System.out.println(
                isim.substring(0,1).toUpperCase()+ //ismin ilk harfi büyük harf olacak
                isim.substring(1).replaceAll("\\w","*")+ //kalan harfleri *'a çevirdik
                " "+
                soyisim.substring(0,1).toUpperCase()+ //soyismin ilk harfi büyük harf ocarak
                soyisim.substring(1).replaceAll("\\w","*")+ //kalan harfleri *'a çevirdik
                " "+
                "**** **** **** "+ //kredikartının ilk 12 hanesi * olacak
                kartNo.substring(12)
        );
    }
}
