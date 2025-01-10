package ornekler6_MetotOlusturma;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_ArrayiTersineCevirme {

     /*33-----
    Bir arrayi tersine çeviren  method yazınız.

    Test Data:

    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Array'e kaç adet sayı girmek istersiniz:");
        int adet = scan.nextInt();

        tersArray(adet);
    }

    public static void tersArray(int adet){

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[adet];

        for (int i=0; i<adet;i++){
            System.out.print((i+1)+".sayıyı giriniz:");
            int sayi = scan.nextInt();
            arr[i]+=sayi;
        }
        System.out.println("Oluşturulan Array:"+ Arrays.toString(arr));

        int[] tersArr = new int[adet];
        int index=0;

        for (int i=arr.length-1; i>=0; i--){
            tersArr[index]+=arr[i];
            index++;
        }
        System.out.println("Oluşturulan Array'in Tersi:"+Arrays.toString(tersArr));

    }
}
