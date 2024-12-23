package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C02_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));

        System.out.println(sayilar);//[5, 7, 2, 9, 1, 2, 5, 9, 3]

        //Listede kaç element olduğunu yazdır.
        System.out.println(sayilar.size());//9

        //Listede element olarak 7nin oldup olmadığını yazdır
        System.out.println(sayilar.contains(7));//true
        System.out.println(sayilar.contains(17));//false

        //Listede varsa 2nin ilk indexini verin
        System.out.println(sayilar.indexOf(2));//2

        ////Listede varsa 2nin son indexini verin
        System.out.println(sayilar.lastIndexOf(2));//5

        //Listede olmayan sayı yazdıralım
        System.out.println(sayilar.indexOf(11));

        //Listede 2 için aşağıdaki cumlelerden uygun olanı yazdırın
        //listede 2 yok
        //listede 2 1 adet var
        //Listede 2 birden fazla var

        if (sayilar.indexOf(2) == -1){
            System.out.println("Listede 2 yok");
        }
        else if (sayilar.indexOf(2) == sayilar.lastIndexOf(2)) {
            System.out.println("Listede 2 sadece 1 tane var.");
        }
        else {
            System.out.println("Listede 2 1'den fazla var");
        }

        //tüm sayıları silmek istersek
        sayilar.clear();
        System.out.println(sayilar);//[]
    }
}
