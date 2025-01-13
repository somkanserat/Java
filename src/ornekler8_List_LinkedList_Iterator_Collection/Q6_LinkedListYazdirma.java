package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class Q6_LinkedListYazdirma {

     /*56-----
    Bir linkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

    LinkedList elemanları: sari,mavi,mor,yesil,beyaz

    Beklenen Çıktı:
    sari
    mavi
    mor
    yesil
    beyaz
    */

    public static void main(String[] args) {

        LinkedList<String> renkler = new LinkedList<>(Arrays.asList("Sarı","Mavi","Mor","Yeşil","Beyaz"));
        for (int i=0;i<renkler.size();i++){
            System.out.println(renkler.get(i));
        }

    }
}
