package ornekler9_Maps;

import java.util.*;

public class Q1_HashSetListTreeSetOlarakYazdirma {

    /*61-----
    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım
    ve listeyi yazdıralım.


    HashSet List: sari,mavi,kirmizi,yesil,mor

    Beklenen Çıktı:
    TreeSet elements:
    kirmizi
    mavi
    mor
    sari
    yesil
    */
    public static void main(String[] args) {

        HashSet<String> renklerHashSet = new HashSet<>(Arrays.asList("sari","mavi","kirmizi","yesil","mor"));
        System.out.println("HashSet renkler:"+renklerHashSet);

        List<String> renklerList = new ArrayList<>(renklerHashSet);
        System.out.println("HashSet List:"+renklerList);

        TreeSet<String> treeSetRenkler = new TreeSet<>(renklerList);

        for (String renk : treeSetRenkler ){
            System.out.println(renk);
        }
    }
}
