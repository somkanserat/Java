package calisma33_collections_maps;

import java.util.Arrays;

public class C05_ValueManipulation {

    public static void main(String[] args) {

        /*
            Biz öğrenci mapi oluştururken, her öğrencinin
            isim-soyisim-sınıf-sube-bolum bilgilerini value olarak tutuyoruz.
            aşağıda verilen value'deki isim ve soyismi yazdırın
         */

        String value = "Ali can-Tataroglu-10-K-Say";

        String[] bilgiler = value.split("-");
        System.out.println(Arrays.toString(bilgiler));

        System.out.println("İsim Soyisim:"+bilgiler[0]+" "+bilgiler[1]);

        value = "Veli-Cem-11-K-TM";

        //Kullanıcıdan geçmek istediği bölümü seçip,
        //value'deki bölüm değerini düzeltin

        String istenenYeniBolum = "MF";

        //EGER value birString olarak oluşturulmuşsa
        //bilgileri kullanabilmek için önce split yapmalıyız.

        bilgiler = value.split("-");
        System.out.println(Arrays.toString(bilgiler)); //[Veli, Cem, 11, K, TM]

        //array haline gelince,istediğimiz bilgiyi yazdırabilir, update edebiliriz.
        bilgiler[4] = "MF";
        System.out.println(Arrays.toString(bilgiler)); //[Veli, Cem, 11, K, MF]

        //güncellemeyi bilgiler array'inde yaptık.
        //güncel bilgileri tekrar birleştirip, value olarak kaydetmemiz gerekir.

        value = bilgiler[0]+"-"+
                bilgiler[1]+"-"+
                bilgiler[2]+"-"+
                bilgiler[3]+"-"+
                bilgiler[4];

        //value yazdırmanın kısa yolu;
        value = String.join("-",bilgiler); //Veli-Cem-11-K-MF

        System.out.println(value); //Veli-Cem-11-K-MF
    }
}
