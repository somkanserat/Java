package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C05_Remove {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

        System.out.println(isimler);//[Ali, Veli, Cemil, Ayse, Fatma, Hatice]

        //Ali'yi silin

        isimler.remove("Ali");
        System.out.println(isimler);//[Veli, Cemil, Ayse, Fatma, Hatice]

        isimler.remove(2);
        System.out.println(isimler);//[Veli, Cemil, Fatma, Hatice]

        /*
            Eğe list sayılardan oluşuyosa, Java girilen degeri direkt index olarak alır.
            Eger sayı olan 4'ü silmek isterseniz bunu önce objext olarak oluşturmalısınız.
         */

        sayilar.remove(4);
        System.out.println(sayilar);//[4, 6, 1, 9]

        //sayılardan 9'u silin

        //sayilar.remove(9);//IndexOutOfBoundsException

        Integer silinecekSayi=9;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);//[4, 6, 1]

    }
}
