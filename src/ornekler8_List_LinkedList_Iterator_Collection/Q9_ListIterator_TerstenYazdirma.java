package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q9_ListIterator_TerstenYazdirma {

    /*59-----
    Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

    LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

    Beklenen Çıktı:
    Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
    LinkedList Tersi:
    mor
    beyaz
    kirmizi
    yesil
    mavi
    sari
    */

    public static void main(String[] args) {

        LinkedList<String> renkler = new LinkedList<>(Arrays.asList("sarı","mavi","yeşil","kırmızı","beyaz","mor"));

        ListIterator<String> iterator = renkler.listIterator(renkler.size());

        while (iterator.hasPrevious()){
            System.out.println("Listenin Tersi:"+iterator.previous());
        }
    }
}
