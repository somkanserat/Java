package calisma10_forLoop;

public class C02_forLoop {

    public static void main(String[] args) {

        //iki basamaklı  sayıların toplamını yazdırın

        int toplam=0;

        for (int i=10; i<=99; i++){
            toplam+=i;
        }
        System.out.println(toplam);


        //3 bas. pozitif çift sayıların toplamını yazdır.
        toplam = 0;
        for (int i=100; i<1000; i+=2){
            toplam+=i;
        }
        System.out.println(toplam);

        //234'den başlayıp, 673'e kadar()673 dahil) 7şerli arttırarak sayıları yan yana yazdırın.
        /*
        for (int i=234; i<=573; i+=7){
            System.out.print(i+" ");
        }
        */

        //3 basamaklı pozitif tam sayılardan 11'e bölünebilenleri yan yana yazdır
        /*
        for (int i=100; i<1000; i++){
            if (i%11==0){
                System.out.print(i+" ");
            }

        }
        */

        //437 ile 681 (sınırlar dahil) arasında 23 ile bölünebilen sayıları yazdır.)

        for (int i=437; i<=681; i++){
            if (i%23==0){
                System.out.print(i+" ");
            }

        }
    }
}
