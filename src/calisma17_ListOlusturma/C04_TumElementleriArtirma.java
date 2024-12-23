package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TumElementleriArtirma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        //Listedeki tüm elementleri 3 artırın

        for (int i=0;i< sayilar.size();i++){
            //i.index'teki elementi alıp,
            int eskiDeger = sayilar.get(i);
            // üzerine 3 ekleyip, i.ixdex'teki elementi bu yeni değer olarak update edeceğiz
            sayilar.set(i,eskiDeger+3);
        }
        System.out.println(sayilar);//[7, 9, 4, 12, 6]

        //sayilar listesindeki tüm elementleri 4 artırın
        System.out.println("Listenin son hali:"+listeninElementleriniArtir(sayilar,4));//[11, 13, 8, 16, 10]

        //sayilar listesindeki tüm elementleri 1 artırın
        System.out.println("Listenin son hali:"+listeninElementleriniArtir(sayilar,1));//[12, 14, 9, 17, 11]
    }

    //Verilen İnteger bir listedeki tüm elementleri, istenen bir deger kadar artırıp döndüren
    //bir method oluşturun

    public static List<Integer> listeninElementleriniArtir(List<Integer> eskiListe, int artisMiktari){
        for (int i=0;i< eskiListe.size();i++){
            //i.index'teki elementi alıp,
            int eskiDeger = eskiListe.get(i);
            // üzerine 3 ekleyip, i.ixdex'teki elementi bu yeni değer olarak update edeceğiz
            eskiListe.set(i,eskiDeger+artisMiktari);
        }
        return eskiListe;
    }
}
