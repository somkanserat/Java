package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_IstenmeyenElementlerSilme {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));
        //Listeden "e" içeren isimleri silin
        /*
        for (int i=0; i< isimler.size();i++){

            isimler.get(i);

            if (isimler.get(i).contains("e")){

                isimler.remove(isimler.get(i));
                //System.out.println(isimler); //[Ali, Cemil, Ayse, Fatma, Hatice] ==> index 1'de Veliyi sildi.
                //yeni Listeye göre i=2 olduğu zaman Cemilin index'i 1'e kaydı. Bu yüzden Cemil göremedi.
                //silme olacağı zaman i'nin değerini 1 azaltırız ki, index'i geriye kalanı kontrol edebilelim.
                i--;
            }
        }
        System.out.println(isimler); //[Ali, Fatma]
        //i--; yapmasaydık ==> [Ali, Cemil, Fatma]
        */

        //************

        //System.out.println(istenmeyenIsimler(isimler,"a")); //[Ali, Veli, Cemil, Ayse]
        System.out.println(istenmeyenIsimler(isimler,"A")); //[Veli, Cemil, Fatma, Hatice]

    }

    public static List<String>  istenmeyenIsimler(List<String> isimler, String istenmeyenHarf){

        for (int i=0; i< isimler.size();i++){

            isimler.get(i);

            if (isimler.get(i).contains(istenmeyenHarf)){

                isimler.remove(isimler.get(i));
                i--;
            }
        }
        return isimler;
    }
}
