package calisma12_methodOverloding_WhileLoop;

public class P02_WhileLoop {

    public static void main(String[] args) {

        /*
            1'den 100'e kadar olan sayıların toplamını yazdırın.
         */

        int toplam=0;
        for (int i=1;i<100;i++){

            toplam +=i;
        }
        System.out.println("toplam:" +toplam);

        System.out.println("--------");

        int sayi=1;
        int toplam2=0;

        while (sayi<100){
            toplam2 +=sayi;
            sayi++;
        }
        System.out.println("toplam2:"+toplam2);

    }
    /*
        For loop bize otomatik olarak bir format verir. Artış miktarı, başlangıç ve bitiş değerleri
        otomatik olarak verilir.

        While Loop'da ise baslangic, bitis değerleri ve asrtış miktarı manuel olarak tanımlanır.


     */
}
