package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

        System.out.println(sayilar);//[4, 6, 1, 9, 3]

        //sayilar.set(2,5);
        System.out.println(sayilar.set(2,5));//1
        //asıl işi, 2.indexteki elementi 5 yapmak.
        //asıl işini yaptı, delil olarak eski elementi getirdi.

        System.out.println(sayilar);//[4, 6, 5, 9, 3]

        //isimler.remove("Ali");
        System.out.println(isimler.remove("Ali"));      //true
        System.out.println(isimler.remove("Pelin"));    //false
        // bunlar da delil olarak kullanılır. hem işlemi yapar,
        // hem de silip silmediğini boolean çıktısı olarak bize verir.
        System.out.println(isimler);//[Veli, Cemil, Ayse, Fatma, Hatice]

        System.out.println(isimler.remove(2));  //Ayse
        //index girdiğimiz için, index'i bulamama ihtimali yok. bu yüzden sildiği ismi(String'i) bize verir.

        //[4,6,1,9,3]
        System.out.println(sayilar.remove(3)); //9 ==> sildiği elemanı bize verir.

        Integer silinecekSayi =4;
        System.out.println(sayilar.remove(silinecekSayi)); //true

    }
}
