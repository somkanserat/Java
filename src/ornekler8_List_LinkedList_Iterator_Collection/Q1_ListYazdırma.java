package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_ListYazdırma {

     /*51-----
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

    Array elemanları:  siyah,sari,mavi,turuncu

    Beklenen Çıktı:
    siyah
    sari
    mavi
    turuncu
    */

    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>();
        renkler.add("siyah");
        renkler.add("sarı");
        renkler.add("mavi");
        renkler.add("turuncu");

        for (int i=0; i<renkler.size();i++){
            System.out.println(renkler.get(i));
        }

        System.out.println("\n2.YOL\n");
        //2.YOL
        List<String> renkler2 = new ArrayList<>(Arrays.asList("Beyaz","Mor","Lacivert","Bordo"));
        for (int i=0; i<renkler2.size();i++){
            System.out.println(renkler2.get(i));
        }


    }
}
