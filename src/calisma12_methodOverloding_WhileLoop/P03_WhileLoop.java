package calisma12_methodOverloding_WhileLoop;

public class P03_WhileLoop {

    public static void main(String[] args) {
        //While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.

        int sayi = 10;
        String sayilar = "";

        while (sayi < 100) {

            if (sayi % 7 == 0) {

                sayilar += sayi + ",";

            }
            sayi++;
        }
        System.out.println(sayilar);


        //While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilarin toplamını yazdırın

        int sayi2 = 10;
        int toplam = 0;

        while (sayi2 < 100) {

            if (sayi2 % 7 == 0) {

                toplam += sayi2;

            }
            sayi2++;
        }
        System.out.println("Toplam:"+toplam);

    }

}

