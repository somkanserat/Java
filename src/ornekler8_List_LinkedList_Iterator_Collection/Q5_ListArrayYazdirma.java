package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5_ListArrayYazdirma {

    /*55-----
    Bir ArrayList oluşturum ve önce ArrayListi yazdıralım
    sonra index numarasına göre tek tek yazdıralım.

    ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

    Beklenen Çıktı:

    Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
    siyah
    mavi
    kirmizi
    yesil
    mor
    turuncu
    */

    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>(Arrays.asList("Siyah","Mavi","Kırmızı","Yeşil","Mor","Turuncu"));
        System.out.println("Orjinal Array List:"+renkler);

        for (int i=0; i< renkler.size();i++){

            System.out.println(renkler.get(i));
        }
    }
}
