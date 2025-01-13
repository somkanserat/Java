package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4_ListElemeanDegistirme {

    /*54-----
    Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

    Array Elemanları: sari,yesil,mavi,pembe

    mavi rengini turuncu ile değiştirelim.

    Beklene Çıktı:
    [sari,yesil,mavi,pembe]
    [sari,yesil,turuncu,pembe]
    */

    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>(Arrays.asList("Sarı","Yeşil","Mavi","Pembe"));
        renkler.set(2, "Turuncu");
        System.out.println("Güncel:"+renkler);
    }
}
