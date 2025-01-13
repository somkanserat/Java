package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3_ListinElemanlarınıCagirma {

    /*53-----
    Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

    ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

    Beklenen Çıktı:

    Arrayin 1. elemani: beyaz
    Arrayin 3. elemani: sari
    */

    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>(Arrays.asList("Beyaz","Siyah","Sarı","Kırmızı","Turuncu"));
        System.out.println("Array'in 1.elemanı:"+renkler.get(0));
        System.out.println("Array'in 3.elemanı:"+renkler.get(2));

    }
}
