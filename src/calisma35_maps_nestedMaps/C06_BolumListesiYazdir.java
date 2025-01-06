package calisma35_maps_nestedMaps;

import java.util.Set;

public class C06_BolumListesiYazdir extends NestedMapDepo{

    public static void main(String[] args) {

        // verilen bolumdeki tum öğrencilerin
        // no, isim ve soyisimlerini yazdır

        String istenenSoyisim = "kaya";

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- bütün key'leri elden geçirelim

        for (Integer eachKey : ogrenciKeySeti){

            String soyisim = ogrenciMap.get(eachKey).get("soyisim");

            if (soyisim.equalsIgnoreCase(istenenSoyisim)){

                System.out.println(
                        eachKey + " "+
                        ogrenciMap.get(eachKey).get("isim")+" "+
                        ogrenciMap.get(eachKey).get("soyisim")
                );
            }
        }
    }
}
