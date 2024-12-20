package calisma15_Arrays;

import java.util.Arrays;

public class C07_ArrayMethotlari_sort {

    public static void main(String[] args) {

        String[] isimler = {"MEtin","Mete","metehan","Mikail","Nevzat","Yasar","yakup","Yaman"};

        //array'i natural order'a göre düzenleyin(doğal sıralama)

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
        //[MEtin, Mete, Mikail, Nevzat, Yaman, Yasar, metehan, yakup]

        /*
            Not1: Natural order sayıları için küçükten büyüğe,
                                metinler için ise sözlük sıralamasına göre sıralama demektir.
                                ANCAK java'nın case sensitive olduğunu ve
                                kucuk harflerin buyuk harflerden sonra geldiğini UNUTMAMALIYIZ.

            NOT2:String'de method ile yapılan değişiklikler atama olmazsa KALICI değişiklik olmaz
                 ANCAK bu kural tüm non-primitive'ler için geçerli değildir.
                 (ilerde bu konu detaylı anlatılacak)
                 array ve arrayList'de method ile yapılan değişiklikler KALICI OLUR.
         */


    }
}
