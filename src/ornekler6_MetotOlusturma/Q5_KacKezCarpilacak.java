package ornekler6_MetotOlusturma;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_KacKezCarpilacak {

     /*35----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.

    Test Data:
    arrayOfMultiples(7, 5)

    sonuç: [7,14,21,28,35]
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Toplanacak Sayı Girin:");
        int toplanacakSayi = scan.nextInt();
        System.out.print("Kendisi ile kaç kez toplansın?:");
        int kacKez = scan.nextInt();

        kacKezToplansin(toplanacakSayi,kacKez);
    }

    public static void kacKezToplansin(int toplanacakSayi, int kacKez){

        int[] arr = new int[kacKez];

        for (int i=0; i<kacKez;i++){

            arr[i]=toplanacakSayi*(i+1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
