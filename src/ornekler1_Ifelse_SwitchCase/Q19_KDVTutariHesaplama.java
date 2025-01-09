package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q19_KDVTutariHesaplama {

    /*
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Aldığınız ürünün fiyatını giriniz:");
        double tutar = scan.nextInt();

        double KdvliTutar=0;

        if (tutar>0 && tutar<1000){
            KdvliTutar += tutar + tutar*0.18;
            System.out.println("Aldığınız ürünün KDV'li tutarı:"+KdvliTutar);
        } else if (tutar>=1000) {
            KdvliTutar += tutar + tutar*0.08;
            System.out.println("Aldığınız ürünün KDV'li tutarı:"+KdvliTutar);
        }
        else {
            System.out.println("Yanlış değer girdiniz.");
        }

    }
}
