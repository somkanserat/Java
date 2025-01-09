package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q22_ManavHesabi {
    /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float armut = 2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlican = 5f;

        System.out.print("Kaç kg armut aldınız:");
        float kg1 = scan.nextFloat();
        float tutar1 = armut*kg1;
        System.out.println("Armutun fiyatı:"+tutar1);

        System.out.println("------");

        System.out.print("Kaç kg elma aldınız:");
        float kg2 = scan.nextFloat();
        float tutar2 = elma*kg2;
        System.out.println("Elmanın fiyatı:"+tutar2);

        System.out.println("------");

        System.out.print("Kaç kg domates aldınız:");
        float kg3 = scan.nextFloat();
        float tutar3 = domates*kg3;
        System.out.println("Domatesin fiyatı:"+tutar3);

        System.out.println("------");

        System.out.print("Kaç kg muz aldınız:");
        float kg4 = scan.nextFloat();
        float tutar4 = muz*kg4;
        System.out.println("Muzun fiyatı:"+tutar4);

        System.out.println("------");

        System.out.print("Kaç kg patlıcan aldınız:");
        float kg5 = scan.nextFloat();
        float tutar5 = patlican*kg5;
        System.out.println("Patlıcanın fiyatı:"+tutar5);

        System.out.println("Toplam ödenecek fiyat:"+(tutar1+tutar2+tutar3+tutar4+tutar5));
    }
}
