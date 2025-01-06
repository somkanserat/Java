package calisma34_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapOlusturmaVeMapMethodlari {

    public static void main(String[] args) {

        //bir öğrenci map'i oluşturalım.
        //map'de öğrencilerin no, isim, soyisim, sınıf, sube, bolumleri olsun

        //1- key ve value ne olacak ve nelerden olusacak
        //   key ==> no, value ==> isim, soyisim, sınıf, sube, bolumleri

        //2- value'yu hangi data turunde tutalım
        //   value'yu String olarak tutalım

        //3- value'deki bilgileri hangi sıra ile oluşturacağız.
        //   ve nasıl birleştireceğiz
        //   bilgileri "isim-soyisim-sınıf-sube-bolumleri" seklinde tutacağız

        //4- bu durumda map için key ve value data type'ları ne olacak

        Map<Integer,String> ogrenciMap = new HashMap<>();

        System.out.println(ogrenciMap); //{}

        //Map'e ekleme için put() kullanılır.

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        /*
        {
            101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF,
            107=Esra-Han-11-M-SOZ
            }
         */

        // map'de kaç eleman var

        System.out.println(ogrenciMap.size());    // 7
        System.out.println(ogrenciMap.isEmpty()); // false

        // key vererek value'yu getirtmek istersek

        System.out.println(ogrenciMap.get(101)); //Ali-Can-11-H-MF

        // contains() key ve value ayrı olarak kullanılır.
        // containsValue(), value içindeki bir bölümü değil, bir BUTUN OLARAK value'yu kontrol eder

        System.out.println(ogrenciMap.containsKey(104)); // true
        System.out.println(ogrenciMap.containsKey(110)); // false

        System.out.println(ogrenciMap.containsValue("Can")); //false
        System.out.println(ogrenciMap.containsValue("Esra-Han-11-M-SOZ")); // true

        // update için replace() KULLANILABİLİR
        ogrenciMap.replace(102,"Veli-Cem-10-K-Say");
        //aynı islem put ile de olabilir
        ogrenciMap.put(103,"Ali-Cem-11-K-Say");

        // update'in bir avantajı
        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Ayse-Can-10-H-Soz");

        System.out.println(ogrenciMap);
        /*
            {
               101=Ali-Can-11-H-MF,
               102=Veli-Cem-10-K-Say,
               103=Ali-Cem-11-K-Say,
               104=Ayse-Can-10-H-Soz,
               105=Sevgi-Cem-11-M-TM,
               106=Sevgi-Can-10-K-MF,
               107=Esra-Han-11-M-SOZ
            }
         */

        //map'teki tum key'leri ayrı bir java yapısına kaydedin

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        System.out.println("Tüm key'ler: "+ogrenciKeySeti); //Tüm key'ler: [101, 102, 103, 104, 105, 106, 107]

        //map'teki tum value'ları ayrı bir java yapısına kaydedin

        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        System.out.println("Tüm value'lar: "+ogrenciValueCollection);
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-Say, Ali-Cem-11-K-Say, Ayse-Can-10-H-Soz, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        // NOT: Eger bize verilen görev sadece value'ler ile ilgili ise
        //      ogrenciValueCollection kullanabiliriz.
        //      AMMA hem key hem value'ye ihtiycımız varsa
        //      ogrenciKeySeti kaydedip, sonra key kullanarak value'ye de ulaşabiliriz.


    }
}
