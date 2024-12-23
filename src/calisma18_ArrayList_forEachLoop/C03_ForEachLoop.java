package calisma18_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ForEachLoop {

    public static void main(String[] args) {
        /*
            1- for loop
                başlangıç ve sonuc biliniyorsa, tekrar sayısı biliniyorsa

            2- while loop
                tekrar sayısı belli değilse

            3- do-while loop
                loop body'nin en az bir kere çalışması gereken durumlarda

            4- for Each Loop
                Özel bir kullanım için oluşturulmuştur. O kullanımda ideal'dir.

                For-each loop birden fazla eleman barındıran yapılardaki
                TUM ELEMENTLERİ sıralama olmaksızın (index kullanmadan) bize getirir
         */

        int [] arr = {3,4,5,2,3,4,5,1,2,3};
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,5,2,3,4,5,1,2,3,6,5,7,3));

        //arr'deki elementlerin toplamını yazdır.

        int toplam=0;

        for (int i=0; i< arr.length;i++){

            toplam+=arr[i];
        }
        System.out.println("Array'deki elementlerin toplamı:"+toplam);

        System.out.println("***FOREACH****");
        toplam=0;

        for ( int each  : arr){ // arr'deki her bir integer'i getir
            toplam+=each;
        }
        System.out.println("Array'deki elementlerin toplamı:"+toplam);

        //sayıları listesindeki çift sayıları toplayın
        System.out.println("\n");

        toplam =0;

        for (int i=0; i<sayilar.size();i++){

            if (sayilar.get(i)%2==0){
                toplam+= sayilar.get(i);
            }
        }
        System.out.println("Listedeki çift sayıların toplamı:"+toplam);

        System.out.println("***FOREACH****");
        toplam=0;

        for (Integer each : sayilar){

            if (each%2==0){
                toplam+=each;
            }
        }
        System.out.println("Listedeki çift sayıların toplamı:"+toplam);


    }
}
