package calisma34_maps;

import java.util.Collection;

public class C03_SubeListesiYazdirma extends MapDepo{

    public static void main(String[] args) {

        // verilen sınıf ve şubedeki tüm öğrencilerin isim ve soyisimlerini yazdırın.
        // Sadece value yeterli

        int istenenSinif = 11;
        String istenenSube = "K";

        System.out.println(istenenSinif+"/"+istenenSube+" sınıfı öğrenci listesi:");

        // 1- sınıf ve subeyi görebilmek için value'lere ihtiyacımız var.

        Collection<String> valueCollection = ogrenciMap.values();

        // 2- her bir value'yu elden geçirip, bilgileri kontrol etmek için for each loop kullanalım

        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi
            // 3- value içindeki isim bilgisine ulaşmak için split edelim.

            String[] eachValueArr = eachValue.split("-");
            // [Ali, Can, 11, H, MF]

            // 4- ARTIK istediğimiz bilgiye ulaşabiliriz.
            // istenilen görevi yerine getirelim.

            // sınıf ve şubedeki tüm öğrencilerin isim ve soyisimlerini yazdırın.

            if ((istenenSinif+"").equalsIgnoreCase(eachValueArr[2])
                    && istenenSube.equalsIgnoreCase(eachValueArr[3])){

                System.out.println(eachValueArr[0] + " " + eachValueArr[1]);
            }
        }
    }
}
