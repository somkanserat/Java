package calisma34_maps;

import java.util.Set;

public class C09_BolumleriDegistir extends MapDepo{

    public static void main(String[] args) {

        // ogrenci map'inde tüm öğrencileri gözden geçirip,
        // verilen eskiBölüm bilgisine sahip olanları
        // yeniBölüm olarak update edin

        String eskiBolum = "MF";
        String yeniBolum = "Say";

        //Tüm öğrencilerin key ve value'larını gözden geçirmemiz gerekiyor

        // 1- key'leri Set olarak kaydedelim.

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- tüm key'leri elden geçirmek için for-each loop lazım

        for (Integer eachKey : ogrenciKeySeti){

            // biz key'leri elden geçiriyoruz ama bölüm bilgisi value'de
            // eachKey'i kullanarak eskiValue'yu kaydedelim

            String eskiValue = ogrenciMap.get(eachKey); //
            String[] eskiValueArr = eskiValue.split("-"); // [Veli, Cem, 10, K, TM]

            if (eskiValueArr[4].equalsIgnoreCase(eskiBolum)){

                eskiValueArr[4] = yeniBolum; // [Veli, Cem, 10, K, Say]
            }

            String yeniValue = String.join("-",eskiValueArr);
            ogrenciMap.put(eachKey,yeniValue);
        }
        System.out.println(ogrenciMap);
    }
}
