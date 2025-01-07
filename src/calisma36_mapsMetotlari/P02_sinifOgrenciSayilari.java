package calisma36_mapsMetotlari;

import calisma35_maps_nestedMaps.NestedMapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class P02_sinifOgrenciSayilari {

    //nested map olarak verilen bir çğrenci Map'inde
    //her sınıfta kaçar öğrenci olduğunu yazın.

    public static void main(String[] args) {

        Map<String,Integer> sinifSayilariMap = new TreeMap<>();

        // Tüm öğrencileri gözden geçir
        // sadece value'larla işimiz olduğu için sadece values() kullanılabilir
        // keySet() alıp herhangi bir key'e ait value değeri ile çalışabilirim
        // entrySet() alıp hem key hem value ile çalışabilirim

        Collection < Map<String,String> > ogrenciBilgileriMap = NestedMapDepo.ogrenciMap.values();

        // System.out.println(ogrenciBilgileriMap);

        /*
        [
            {sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
            {sinif=10, sube=M, soyisim=Can, bolum=MF, isim=Ipek},
            {sinif=11, sube=L, soyisim=Can, bolum=MF, isim=Esra},
            {sinif=10, sube=L, soyisim=Cem, bolum=TM, isim=Maya},
            {sinif=12, sube=K, soyisim=Kaya, bolum=Soz, isim=Hamza},
            {sinif=9, sube=M, soyisim=Kaya, bolum=Soz, isim=Dilan}

            ]
        */

        for (Map<String, String> each : ogrenciBilgileriMap) {
            String sinif = each.get("sinif");

            //eğer bir sınıf ismi yoksa eklesin ve valur degerini 1 yapsın
            if (!sinifSayilariMap.containsKey(sinif)) {
                sinifSayilariMap.put(sinif, 1);
            } else { //varsa

                sinifSayilariMap.put(sinif, sinifSayilariMap.get(sinif) + 1);
            }
        }
        System.out.println(sinifSayilariMap);
    }
}
