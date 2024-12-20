package calisma16_arrays_MultidimensionalArrays;

import java.util.Arrays;

public class C05_TumElementleriKontrolEtme {

    public static void main(String[] args) {

        int [][] arr = {{2,3,7},{3,5},{4},{1,2,3,6,8}};

        //******SORU1:arr'deki çift sayıların toplamını yazdırın******

        int ciftToplam=0;

        for (int i=0;i<arr.length;i++){

            for (int j=0; j<arr[i].length;j++){

                if(arr[i][j]%2==0){

                    ciftToplam +=arr[i][j];
                }
            }
        }
        System.out.println("Array'deki çift sayıların toplamı:"+ciftToplam);


        //******SORU2:arr'deki tek sayılardan en büyük olanı yazdırın******
        //int [][] arr = {{2,3,7},{3,5},{4},{1,2,3,6,8}};

        int enBuyukTekSayi= Integer.MIN_VALUE;
        //en buyuk tek sayiyi arıyoruz. gecici atadığımız bu değer en küçük değer olarak atadık.

        for (int i=0;i<arr.length;i++){

            for (int j=0; j<arr[i].length;j++){

                if(arr[i][j]%2==1 && arr[i][j]>enBuyukTekSayi ){ //arr[i][j]%2!=0
                    enBuyukTekSayi=arr[i][j];
                }
            }
        }
        System.out.println("Array'deki en büyük tek sayı:"+enBuyukTekSayi);

        //******SORU3:arr'deki tüm sayıları 1 artırın******

        for (int i=0;i<arr.length;i++){

            for (int j=0; j<arr[i].length;j++){
                arr[i][j] +=1;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        //******SORU4:arr'deki tüm tek sayıları ve çift sayıları ayrı ayrı toplayıp******
        //            çift sayılartoplamı - teksayılarıtoplamı

        ciftToplam=0;
        int tekSayilarinToplami=0;

        for (int i=0;i<arr.length;i++){

            for (int j=0; j<arr[i].length;j++){

                if ( arr[i][j]%2 == 0 ){

                    ciftToplam += arr[i][j];
                }
                else {
                    tekSayilarinToplami += arr[i][j];
                }
            }
        }
        System.out.println("Çift sayıların toplamı:"+ciftToplam);
        System.out.println("Tek sayıların toplamı:"+tekSayilarinToplami);
        System.out.println("Çift sayıların toplamının, tek sayıların toplamından farkı="+(ciftToplam-tekSayilarinToplami));

    }
}
