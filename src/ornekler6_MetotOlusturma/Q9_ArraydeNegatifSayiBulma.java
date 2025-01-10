package ornekler6_MetotOlusturma;

import java.util.Arrays;

public class Q9_ArraydeNegatifSayiBulma {

    /*-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.

    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
    */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15};
        System.out.println(Arrays.toString(toplam(arr)));
    }

    public static int[] toplam(int[] arr){

        int[] yeniArr = new int[2];

        for (int i=0; i<arr.length;i++){

            if (arr[i]<0){

                yeniArr[1]+=arr[i];
            }
            else if (arr[i]>0) {

                yeniArr[0]+=1;
            }
        }
        return yeniArr;
    }
}
