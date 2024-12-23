package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.List;

public class C10_TamBolenSayilarListesi {

    public static void main(String[] args) {

        //30 sayısını tam bölebilen pozitif tam sayıları bir liste olarak yazdırın.

        /*
        List <Integer> tamBolenler = new ArrayList<>();

        for (int i=1;i<=30;i++){

            if (30%i==0){
                tamBolenler.add(i);
            }
        }
        System.out.println(tamBolenler);
        */

        System.out.println(tamBolenlerListesi(66));

        // tamBolenlerListesi methodu kullanarak
        // 2 basamaklı asal sayıları yazdırın

        for (int i=10; i<99;i++){
            int bolenSayisi= tamBolenlerListesi(i).size(); //11 için ==> [1,11]'in uzunluğu 2 olacağı için

            if (bolenSayisi == 2){      // bu şartı sağlayacak ve 11'i yazdıracak.
                System.out.print(i+" ");
            }
        }
    }

    // Soru 6- Verilen pozitif bir tamsayiyi, tam bolebilen tum pozitif tamsayilari bir liste olarak
    // bize donduren bir method olusturun.

    public static List<Integer> tamBolenlerListesi(int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i=1;i<=sayi;i++){

            if (sayi%i==0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}
