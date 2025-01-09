package calismam_SicaklikGostergesi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S03_SicaklikGostergesiArrayList {

    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // "e" girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> gununSicakliklari = new ArrayList<>();

        while (true){

            String input = scan.nextLine();
            if (input.equals("e")){

                System.out.println("Sistem sonlandırılmıştır.");
                System.out.println(gununSicakliklari);
                break;
            }
            else if (input.matches("-?\\d+(\\.\\d+)?")) {

                double girilenSicaklik = Double.parseDouble(input);
                gununSicakliklari.add(girilenSicaklik);
            }
            else {
                System.out.println("Geçersiz veri girişi.");
            }
        }
        if (!gununSicakliklari.isEmpty()){

            Collections.sort(gununSicakliklari);
            System.out.println("Girilen değer sayısı:"+gununSicakliklari.size());
            System.out.println("Girilen en düşük sıcaklık değeri:"+gununSicakliklari.get(0));
            System.out.println("Girilen en yüksek sıcaklık değeri:"+gununSicakliklari.get(gununSicakliklari.size()-1));

        }
        else {
            System.out.println("Liste boş, hiçbir değer girilmedi.");
        }
    }
}
