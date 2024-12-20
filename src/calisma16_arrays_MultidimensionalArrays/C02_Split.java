package calisma16_arrays_MultidimensionalArrays;

import calisma15_Arrays.C04_EnUzunEnKisaKelime;

import java.util.Arrays;

public class C02_Split {

    public static void main(String[] args) {

        //cumledeki en kısa ve en uzun kelimeyi yazdır.

        String str = "Java gün gectikce daha da güzelleşiyor";

        String [] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));     //[Java, gün, gectikce, daha, da, güzelleşiyor]

        C04_EnUzunEnKisaKelime.enKisaVeEnUzunYazdir(kelimeler);
        //Array'deki en kisa kelime : da
        //Array'deki en uzun kelime : güzelleşiyor
        //Esit uzunlukta olan kelimeler gozardi edilmistir


        String[] aDanAyir = str.split("a");
        System.out.println(Arrays.toString(aDanAyir)); //[J, v,  gün gectikce d, h,  d,  güzelleşiyor]

        //tüm harfleri array olarak oluştur.

        String[] harfler = str.split("");
        System.out.println(Arrays.toString(harfler));
        //[J, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, c, e,  , d, a, h, a,  , d, a,  , g, ü, z, e, l, l, e, ş, i, y, o, r]

        //space'lerden kurtulmak için bu şekilde yapabiliriz;

        harfler = str.replace(" ","").split("");
        System.out.println(Arrays.toString(harfler));
        //[J, a, v, a, g, ü, n, g, e, c, t, i, k, c, e, d, a, h, a, d, a, g, ü, z, e, l, l, e, ş, i, y, o, r]


    }
}
