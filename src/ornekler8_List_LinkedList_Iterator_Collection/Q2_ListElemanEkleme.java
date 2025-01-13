package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_ListElemanEkleme {

    /*52-----
    Array list oluşturun daha sonra aşağıda belirtilen yerlere
    yeni array elemanlarını ekleyen java kodunu yazınız.

    Array List:  siyah,mavi,kirmizi,beyaz

    en başa: pembe
    mavi-kirmizi arasına yesil  renk eklenecek.

    Beklenen Çıktı:
    [pembe,siyah,mavi,yesil,kirmizi,beyaz]
    */

    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>(Arrays.asList("Siyah","Mavi","Kırmızı","Beyaz"));
        System.out.println("Renkler"+renkler);
        renkler.add(0,"Pempe");
        renkler.add(3,"Yeşil");
        System.out.println("Güncel:"+renkler);
     }
}
