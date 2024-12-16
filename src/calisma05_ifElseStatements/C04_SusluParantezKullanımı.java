package calisma05_ifElseStatements;

import java.util.Scanner;

public class C04_SusluParantezKullanımı {

    public static void main(String[] args) {

        //Kullanıcıdan 2 tam sayı isteyin. Birinci sayi daha kucukse, iki sayıyı yazdırın.
        //alt satıra gecip "ilk sayi daha küçük" yazdırın. 2.sayi çift ise "2.sayı çift"
        //yazdırın. alt satira "çift sayıları severim" yazdırın.

        Scanner input = new Scanner(System.in);

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        /*
        if(sayi1<sayi2){
            System.out.println("Girilen sayılar: " +sayi1 + " ve " + sayi2);
            System.out.println("İlk sayı daha küçüktür.");
        }

        if(sayi2 % 2 == 0){
            System.out.println("2.sayı çifttir.\nÇift sayıları severim.");
        }
        */

        //Eğer çift cümlesinde boolean şarttan sonra {} kullanılmazsa, Java if body'si olarak ilk ;'e kadar olan kısmı
        //alır. Sonraki satırların if ile ilgisi olmaz.

        //Kullanımda şuna dikkat etmeliyiz; Eğer if body'si SADECE 1 satır ise {} kullanmasak da olabilir.
        //ANCAK if body'si birden fazla ise MUTLAKA {} kullanılır.

        if(sayi1<sayi2)
            System.out.println("Girilen sayılar: " +sayi1 + " ve " + sayi2);
            System.out.println("İlk sayı daha küçüktür."); //bu satırın if ile bağlantısı yoktur. Her durumda çalışır.


        if(sayi2 % 2 == 0)
            System.out.println("2.sayı çifttir.\nÇift sayıları severim.");


    }
}
