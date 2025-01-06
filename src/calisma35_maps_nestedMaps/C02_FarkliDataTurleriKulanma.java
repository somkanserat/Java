package calisma35_maps_nestedMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FarkliDataTurleriKulanma {

    public static void main(String[] args) {

        String str = "Ali";
        //Integer sayi = str,
        Integer sayi = 20;

        //List<String> isimler = str; // isimlerin data türü list'tir. İçine koyulacak şeyler String

        List<String> isimler = new ArrayList<>();
        Object obj = str;
        obj = sayi;
        obj = isimler;

        // Non-primitive data türlerinde casting
        // SADECE parent-child ilişkisi olan class'larda olur.

        //str = (String) obj;



        List<Object> elementler = new ArrayList<>();

        elementler.add(20);
        elementler.add(true);
        elementler.add('a');
        elementler.add("Esra");

        int[] arr = {2,4,6};
        elementler.add(arr);

        // Data türünü object seçmek, elementleri eklemede bize kolaylık sağlar
        // AMMA elementleri kullanırken sürekli casting gerekir
        // sürekli olarak kullanmak istediğimiz elementin data türünü kontrol etmeli
        // ve Object data türünden, istediğimiz data türüne Cast etmeliyiz.

        System.out.println(elementler); // [20, true, a, Esra, [I@27f674d]

        // elementler listesindeki 4.index'deki array'i yazdırın

        System.out.println(
                Arrays.toString((int[]) elementler.get(4))
        ); // [2, 4, 6]

        // elementler listesindeki 3.ixdex'teki ismin uzunluğunu yazdırın

        System.out.println(
                (  (String)elementler.get(3)).length() ); // 4

        // elementler listesindeki 0.indexdeki sayıyı 5 arttırın

        elementler.set(0,( (Integer)elementler.get(0) )+5);
        System.out.println(elementler);
    }

}
