package calisma10_forLoop;

import java.util.Scanner;

public class C10_RakamlarToplami {

    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin

        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayı girin:");
        int sayi= input.nextInt();
        System.out.println("Girmiş olduğunuz sayı:"+sayi);

        int basamakSayisi = (sayi+"").length(); //sayiyi String'e çevirdik.
        System.out.println("Basamak Sayısı:"+basamakSayisi);

        int rakamlarToplami = 0;

        for (int i=1; i<=basamakSayisi; i++){

            rakamlarToplami+=sayi%10; //son basamağı aldık ve rakamlar toplamına ekledik.
            sayi/=10; //bir sonraki işlem için son basamaktan kurtulduk.
        }
        System.out.println(rakamlarToplami);

        /*
        *****************İKİNCİ YOL******************

        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayı girin:");
        int sayi= input.nextInt();
        System.out.println("Girmiş olduğunuz sayı:"+sayi);

        int basamakSayisi=0;

        int rakamlarToplami=0;
        int sabit = sayi;

        for(int i=0;sabit>0;i++){
            basamakSayisi++;
            sabit /= 10;
        }
        System.out.println("Basamak Sayısı:"+basamakSayisi);

        for (int j=0;j<=basamakSayisi;j++){
            rakamlarToplami += sayi%10;
            sayi /= 10;
        }
        System.out.println("Rakamlar Toplamı:"+rakamlarToplami);
         */
    }
}
