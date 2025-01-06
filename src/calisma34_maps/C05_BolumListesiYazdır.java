package calisma34_maps;

import java.util.Set;

public class C05_BolumListesiYazdır extends MapDepo{

    public static void main(String[] args) {

        // verilen bolumdeki tum öğrencilerin
        // numara, isim, soyisim ve subelerini yazdırın

        //numara da istendiği için sadece value yetmez. Key'leri de kullanmamız gerekir.

        String istenenBolum = "MF";

        System.out.println(istenenBolum+" Bölümündeki Öğrenci Listesi:");

        // 1- Tum key'leri kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- Her bir key'i ele almak için for each loop yapalım

        for (Integer eachKey : ogrenciKeySeti){

            //ornek eachKey : 101

            // foreach loop, her bir key'i bize getirecek
            // ama aradığımız bilgiler key'de değil, value'de

            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 3- istenen bilgilere ulaşmak için eachValue'yu split edelim

            String[] eachValueArr = eachValue.split("-");
            // [Ali, Can, 11, H, MF]

            // 4- artık istenen bilgilere ulaşabiliyoruz
            //    verilen görevleri yapalım

            // verilen bolumdeki tum öğrencilerin
            // numara, isim, soyisim ve subelerini yazdırın

            if (eachValueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(
                        eachKey + " "+
                        eachValueArr[0]+" "+
                        eachValueArr[1]+" "+
                        eachValueArr[3]+" "
                );
            }
        }
    }
}
