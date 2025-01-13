package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Q7_Iterator {

     /*57-----
    Bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki
    elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

    LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

    1. elemandan itibaren yazdıralım.

    Beklenen Çıktı:
    beyaz
    mavi
    yesil
    turuncu
    */

    public static void main(String[] args) {

        LinkedList<String> renkler = new LinkedList<>(Arrays.asList("Sarı","Beyaz","Mavi","Yeşil","Turuncu"));
        Iterator iterator = renkler.iterator();


        for (int i=1; i<=renkler.size();i++){
            String renk = (String)iterator.next();
            System.out.println(renk);
        }
    }
}
