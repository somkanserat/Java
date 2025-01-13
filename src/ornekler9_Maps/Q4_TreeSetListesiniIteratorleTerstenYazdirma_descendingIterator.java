package ornekler9_Maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Q4_TreeSetListesiniIteratorleTerstenYazdirma_descendingIterator {

    /*64-----
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım
    ve ardından  descendingIterator()  fonksiyonunu kullanarak
    ters sıradan yazdıralım.

    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

    Tersten Siralanisi:

    yesil
    turuncu
    sari
    mavi
    kirmizi
    */

    public static void main(String[] args) {

        TreeSet<String> renkler = new TreeSet<>(Arrays.asList("yesil","sari","mavi","turuncu","kirmizi"));

        System.out.println("Orjinal TreeSet:"+renkler);

        Iterator<String> iterator = renkler.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
