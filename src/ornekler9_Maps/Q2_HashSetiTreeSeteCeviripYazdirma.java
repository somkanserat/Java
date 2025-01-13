package ornekler9_Maps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Q2_HashSetiTreeSeteCeviripYazdirma {

    /*62-----
    Bir HashSet oluşturalım ve
    HashSet elemanlarını TreeSet e dönüştürelim.
    Tree Set elemanlarını tektek yazdıralım.

    HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

    Beklenen Çıktı:
    Tree Set Elemanlari:
    kirmizi
    mavi
    sari
    turuncu
    yesil
    */

    public static void main(String[] args) {

        HashSet<String> renkler = new HashSet<>(Arrays.asList("sari","mavi","yesil","turuncu","kirmizi"));
        System.out.println(renkler);

        TreeSet<String> treeSetRenkler = new TreeSet<>(renkler);

        for (String renk : treeSetRenkler ){
            System.out.println(renk);
        }
    }
}
