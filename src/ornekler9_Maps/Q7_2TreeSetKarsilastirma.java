package ornekler9_Maps;

import java.util.Arrays;
import java.util.TreeSet;

public class Q7_2TreeSetKarsilastirma {

    /*67-----
    Ortak elemanları olan 2 farklı TreeSet oluşturalım ve
    elemanlarını tektek karşılaştırıp aynı olanlar için "yes"
    farklı olanlar için "no" yazdıralım.

    1. TreeSet: mavi,yesil,kirmizi,sari
    2. TreeSet: yesil,mavi,pembe,turuncu

    Beklenen Çıktı:
    1. TreeSet: [kirmizi,mavi,sari,yesil]
    2. TreeSet: [mavi,pembe,turuncu,yesil

    Karsilastirma Sonucu:

    no
    yes
    no
    yes
    */

    public static void main(String[] args) {

        TreeSet<String> renkler1 = new TreeSet<>(Arrays.asList("mavi","yesil","kirmizi","sari"));
        TreeSet<String> renkler2 = new TreeSet<>(Arrays.asList("yesil","mavi","pembe","turuncu"));

        System.out.println("1.Renkler:"+renkler1);
        System.out.println("2.Renkler:"+renkler2);


        for (String renk1 : renkler1){
            int sayac=0;
            for (String renk2 : renkler2){

                if (renk1.equalsIgnoreCase(renk2)){
                    sayac++;
                }
            }
            if (sayac !=0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
