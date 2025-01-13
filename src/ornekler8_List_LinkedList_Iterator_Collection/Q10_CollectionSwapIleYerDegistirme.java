package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Q10_CollectionSwapIleYerDegistirme {

    /*60-----
    Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı
    yer değiştiren java kodunu yazınız.

    LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

    hint:  Collections.swap();

    Beklene Çıktı:
    Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
    Swap sonrası durum: [siyah,kirmizi,beyaz,mavi,yesil,turuncu]
    */

    public static void main(String[] args) {

        LinkedList<String> renkler = new LinkedList<>(Arrays.asList("mavi","kırmızı","beyaz","siyah","yeşil","mor"));
        System.out.println("Orjinal Liste:"+renkler);

        Collections.swap(renkler,0,3);
        System.out.println("Güncel:"+renkler);
    }
}
