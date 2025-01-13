package ornekler9_Maps;

import java.util.PriorityQueue;

public class Q8_PriorityQueueElemanlariniYazdirma {

     /*68-----
    Bir Priority Queue  oluşturalım, elemanlarını ekleyim
    priority queue yazdıralım.

    priority queue elemanları: sari,yesil,mavi,kirmizi

    Beklenen Çıktı:
    Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
    */

    public static void main(String[] args) {

        PriorityQueue<String> renkler = new PriorityQueue<>();
        renkler.add("sari");
        renkler.add("yesil");
        renkler.add("mavi");
        renkler.add("kirmizi");

        System.out.println("Priorty Queue:"+renkler);
    }
}
