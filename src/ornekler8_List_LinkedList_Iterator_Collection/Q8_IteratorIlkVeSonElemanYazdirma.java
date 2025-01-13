package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Q8_IteratorIlkVeSonElemanYazdirma {

    /*58-----
    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

    LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

    Beklenen Çıktı:

    Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
    Listenin ilk elemani: sari
    listenin son elemani: beyaz
    */

    public static void main(String[] args) {

        LinkedList<String> renkler = new LinkedList<>(Arrays.asList("Sarı","Mavi","Turuncu","Siyah","Yeşil","Beyaz"));
        Iterator<String> iterator = renkler.iterator();

        System.out.println(iterator.next());

        while (iterator.hasNext()){
            String renk = iterator.next();
            if (! iterator.hasNext()){
                System.out.println(renk);
            }
        }
    }


}
