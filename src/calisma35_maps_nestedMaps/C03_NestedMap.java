package calisma35_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMap {

    public static void main(String[] args) {

        Map<Integer, Map<String,String> > ogrenciMap = new HashMap<>();

        Map<String,String> ogrenci103ValueMap = new HashMap<>();
        ogrenci103ValueMap.put("isim","Ali");
        ogrenci103ValueMap.put("soyisim","Cem");
        ogrenci103ValueMap.put("sınıf","11");
        ogrenci103ValueMap.put("şube","K");
        ogrenci103ValueMap.put("bölüm","TM");

        ogrenciMap.put(103,ogrenci103ValueMap);

        Map<String,String> ogrenci102ValueMap = new HashMap<>();
        ogrenci102ValueMap.put("isim","Veli");
        ogrenci102ValueMap.put("soyisim","Cem");
        ogrenci102ValueMap.put("sınıf","10");
        ogrenci102ValueMap.put("şube","K");
        ogrenci102ValueMap.put("bölüm","TM");

        ogrenciMap.put(102,ogrenci102ValueMap);

        Map<String,String> ogrenci101ValueMap = new HashMap<>();
        ogrenci101ValueMap.put("isim","Ali");
        ogrenci101ValueMap.put("soyisim","Can");
        ogrenci101ValueMap.put("sınıf","11");
        ogrenci101ValueMap.put("şube","H");
        ogrenci101ValueMap.put("bölüm","MF");

        ogrenciMap.put(101,ogrenci101ValueMap);

        System.out.println(ogrenciMap);
        /*
            {
                101={sınıf=11, şube=H, soyisim=Can, isim=Ali, bölüm=MF},
                102={sınıf=10, şube=K, soyisim=Cem, isim=Veli, bölüm=TM},
                103={sınıf=11, şube=K, soyisim=Cem, isim=Ali, bölüm=TM}
            }
         */

        // 101 no'lu öğrencinin soyismini yazdırın

        System.out.println(ogrenciMap.get(101).get("isim")); //Ali --> çift key yapıldı

        // 103 no'lu öğrencinin sınıfını yazdırın

        System.out.println(ogrenciMap.get(103).get("sınıf")); //11

        // 102 no'lu öğrencinin soyismini "Kaya" yapın

        ogrenciMap.get(102).put("soyisim","Kaya");
        System.out.println(ogrenciMap);

        // 101 numaralı öğrencinin sınıfını 10 yap

        ogrenciMap.get(101).put("sınıf","10");
        System.out.println(ogrenciMap);
    }
}
