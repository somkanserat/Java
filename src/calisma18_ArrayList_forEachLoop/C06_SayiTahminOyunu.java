package calisma18_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C06_SayiTahminOyunu {

    public static void main(String[] args) {

        //0-100 arasında rastgele sayı oluşturun

        Random random = new Random();
        int tutulanSayi = random.nextInt(100);

        // Kullanicilardan herkesin bir sayi tahmin etmesini isteyin
        // girilen sayilari bir liste olarak kaydedin
        // Kullanicilar negatif bir sayi girdiginde
        // - olusturulan rastgele sayiyi
        // - yapilan tahminleri
        // - rastgele sayiya en yakin tahmini yazdirin

        int girilenSayi=0;
        List<Integer> tahminlerListesi = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Bir tahmin giriniz:");
            girilenSayi = scan.nextInt();

            if (girilenSayi>=0){
                tahminlerListesi.add(girilenSayi);
            }

        }while (girilenSayi>=0);

        // - olusturulan rastgele sayiyi
        System.out.println("Tuttuğum sayi:"+tutulanSayi);

        // - yapilan tahminleri
        System.out.println("Yapılan tahminler listesi:"+tahminlerListesi);

        // - rastgele sayiya en yakin tahmini yazdirin
        int enYakinTahmin = tahminlerListesi.get(0);
        int enAzFark = enYakinTahmin > tutulanSayi ? enYakinTahmin - tutulanSayi:tutulanSayi-enYakinTahmin;

        for ( int each : tahminlerListesi){

            int eachFark = each > tutulanSayi ? each-tutulanSayi: tutulanSayi-each;

            if (eachFark<enAzFark){
                enYakinTahmin =each;
                enAzFark = eachFark;
            }

        }
        System.out.println("En yakın tahmin:"+enYakinTahmin);
    }
}
