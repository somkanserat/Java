package ornekler9_Maps;

import java.util.Arrays;
import java.util.TreeSet;

public class Q5_TreeSetIlkElemanSonElemanYazdirma {

    /*65-----
    Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

    TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

    Beklenen Çıktı:
    Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
    ilk elemen: kirmizi
    son eleman: yesil
    */

    public static void main(String[] args) {

        TreeSet<String> renkler = new TreeSet<>(Arrays.asList("sari","mavi","yesil","kirmizi","turuncu","pembe"));
        System.out.println("Orjinal Tree:"+renkler);

        System.out.println("İlk Eleman:"+renkler.first());
        System.out.println("Son Eleman:"+renkler.last());
    }
}
