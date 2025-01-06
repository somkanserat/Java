package calisma34_maps;

import java.util.Collection;

public class C02_IsımIleOgrenciListele extends MapDepo {

    public static void main(String[] args) {

        // ogrenci map'inde verilen isme sahip olan ogrencilerin
        // isim, soyisim, sınıf ve şubeleri yazdırın

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

        String istenenIsim = "Sevgi";

        // 1- ismi görebilmek için value'lere ihtiyacımız var.

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println(valueCollection);
        /*
        [
            Ali-Can-11-H-MF,
            Veli-Cem-10-K-TM,
            Ali-Cem-11-K-TM,
            Ayse-Can-10-H-MF,
            Sevgi-Cem-11-M-TM,
            Sevgi-Can-10-K-MF,
            Esra-Han-11-M-SOZ]
         */

        System.out.println("Ismi "+istenenIsim+" olan ");

        // 2- her bir value'yu elden geçirip, bilgileri kontrol etmek için for each loop kullanalım

        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value içindeki isim bilgisine ulaşmak için split edelim.

            String[] eachValueArr = eachValue.split("-");
            // [Ali, Can, 11, H, MF]

            // 4- ARTIK istediğimiz bilgiye ulaşabiliriz.
            // istenilen görevi yerine getirelim.

            // verilen isme sahip olan ogrencilerin
            // isim, soyisim, sınıf ve şubeleri yazdırın

            if (eachValueArr[0].equalsIgnoreCase(istenenIsim)){

                System.out.println(
                        eachValueArr[0]+" " +
                        eachValueArr[1]+" " +
                        eachValueArr[2]+" " +
                        eachValueArr[3]
                );
            }
        }
    }
}
