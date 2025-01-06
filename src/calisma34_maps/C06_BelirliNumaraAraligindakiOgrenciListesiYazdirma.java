package calisma34_maps;

import java.util.Set;

public class C06_BelirliNumaraAraligindakiOgrenciListesiYazdirma extends MapDepo {

    public static void main(String[] args) {

        // verilen baslangıç ve bitiş numaraları dahil olmak üzere
        // bu numaralar arasındaki öğrencilerin
        // No, isim ve soyisimlerini yazdırın

        int basNo=102;
        int bitNo=105;

        System.out.println(basNo+" ile "+bitNo+" numaraları arasındaki öğrenci listesi:");

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        for (Integer eachKey : ogrenciKeySeti){

            //bu defa kontrol value'de değil, key'de

            if (eachKey >=basNo && eachKey<=bitNo){
                //isim ve soyisimlere ulaşmak için value'ya ihtiyac
                String eachValue = ogrenciMap.get(eachKey);

                //value'deki bilgilere ulaşmak için split yapmalıyız
                String[] eachValueArr = eachValue.split("-");

                System.out.println(
                        eachKey + " "+
                                eachValueArr[0]+" "+
                                eachValueArr[1]+" "
                );
            }
        }
    }
}
