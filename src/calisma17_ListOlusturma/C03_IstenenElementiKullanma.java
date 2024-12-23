package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {

    public static void main(String[] args) {

        int[] arr = {3,5,6,8,1};

        arr[2] = 10;
        System.out.println(Arrays.toString(arr));//[3, 5, 10, 8, 1]
        System.out.println(arr[4]);//1

        //arr'deki tüm elementleri toplayın

        int toplam=0;

        for (int i=0; i<arr.length;i++){

            toplam+=arr[i];
        }
        System.out.println("Array'deki elementlerin toplamı:"+toplam);//27


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,1,4,0));

        //sayılar listesindeki 2.indexdeki sayıyı yazdır.

        System.out.println(sayilar.get(2));//8

        //Sayılar listesindeki tüm elementi toplayın.

        toplam=0;
        for (int i=0;i<sayilar.size();i++){
            toplam+=sayilar.get(i);
        }
        System.out.println("Listedeki sayıların toplamı:"+toplam); //22

        System.out.println(sayilar);//[3, 6, 8, 1, 4, 0]

        //2.indexdeki elementi 5 yapin

        sayilar.set(2,5);
        System.out.println(sayilar);//[3, 6, 5, 1, 4, 0]

        //4.index'deki elementi yazdırın
        System.out.println(sayilar.get(4));//4

        //sayılar listesindeki sayılar index'deki elementi 11 yapın
        sayilar.set(4,11);
        System.out.println(sayilar);//[3, 6, 5, 1, 11, 0]

        //sayilar listesindeki 4.index'e 23 ekleyin
        sayilar.add(4,23);
        System.out.println(sayilar);//[3, 6, 5, 1, 23, 11, 0]
        /*
            add() yeni bir element ekler, element sayısı 1 artar.
            ve eklendiği index'ten sonraki elementler 1 ileriye itilir

            set() yeni element eklemez, listenin eleman sayısı aynı kalır
            sadece verilen index'teki eleman değiştirilir.
         */
    }
}
