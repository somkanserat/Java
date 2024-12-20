package calisma16_arrays_MultidimensionalArrays;

public class C04_TumElemanlariToplama {

    public static void main(String[] args) {

        int[] sayilar = {3,6,9,1};

        //array'in tüm elementlerin toplamını yazdır.

        int toplam = 0;

        for (int i=0;i< sayilar.length;i++){
            toplam += sayilar[i];
        }
        System.out.println("Sayılar array'indeki elementlerin toplamı:"+toplam);






        int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        toplam = 0;

        for (int i=0; i< arr.length; i++){  //outer array'deki inner array'leri kontrol eder.

            for (int j=0;j<arr[i].length; j++){ //her bir inner array'deki elementleri

                toplam += arr[i][j];
            }
        }
        System.out.println(toplam);
    }

}
