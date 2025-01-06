package calisma35_maps_nestedMaps;

import java.util.Set;

public class C05_SoyisimleriGuncelle extends NestedMapDepo{

    public static void main(String[] args) {

        // tüm ogr'lerin soyisimlerini buyuk harf yapın

        /*
            {
              101={sinif=11, şube=K, soyisim=Cem, isim=Ali, bölüm=TM},
              102={sinif=10, şube=M, soyisim=Can, isim=Ipek, bölüm=MF},
              103={sinif=11, şube=L, soyisim=Can, isim=Esra, bölüm=MF},
              104={sinif=10, şube=L, soyisim=Cem, isim=Maya, bölüm=TM},
              105={sinif=12, şube=K, soyisim=Kaya, isim=Hamza, bölüm=Soz},
              106={sinif=9, şube=M, soyisim=Kaya, isim=Dilan, bölüm=Soz}
            }
         */

        // 1- key'leri set olarak kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- bütün key'leri elden geçirelim

        for (Integer eachKey : ogrenciKeySeti){

            // gelen eachKey'e ait value'de soyismi update edelim

            String eskiSoyisim = ogrenciMap.get(eachKey).get("soyisim");
            String yeniSoyisim = eskiSoyisim.toUpperCase();

            // map'i yeniSoyisim ile güncelleyelim

            ogrenciMap.get(eachKey).put("soyisim",yeniSoyisim);

            // bu 3 satırı tek satırda yapabiliriz
            // ama anlaşılır olması için 3 adımda yaptık
            //ogrenciMap.get(eachKey).put("soyisim", ogrenciMap.get(eachKey).get("soyisim").toUpperCase());

            System.out.println(ogrenciMap);
        }
    }
}
