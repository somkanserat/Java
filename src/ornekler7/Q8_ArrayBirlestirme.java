package ornekler7;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_ArrayBirlestirme {
    /*48-----
    İki farklı Array'i birleştiren bir program yazınız.

    Örnekler:

    birlestir([1, 3, 5], [2, 6, 8])
    Çıktı : [1, 3, 5, 2, 6, 8]

    birlestir([7, 8], [10, 9, 1, 1, 2])
    Çıktı : [7, 8, 10, 9, 1, 1, 2]

    birlestir([4, 5, 1], [3, 3, 3, 3, 3])
    Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi1;
        int sayi2;

        System.out.print("1.array için kaç adet sayı gireceksiniz:");
        int adet1=scan.nextInt();
        int[] array1= new int[adet1];

        for (int i=0;i<adet1;i++){
            System.out.print("Sayi "+(i+1)+":");
            sayi1= scan.nextInt();
            array1[i]+=sayi1;
        }

        System.out.print("2.array için kaç adet sayı gireceksiniz:");
        int adet2=scan.nextInt();
        int[] array2= new int[adet2];

        for (int i=0;i<adet2;i++){
            System.out.print("Sayi "+(i+1)+":");
            sayi2= scan.nextInt();
            array2[i]+=sayi2;
        }

        int[] birlestirilenArray = new int[adet1+adet2];

        for (int i=0;i<adet1;i++){
            birlestirilenArray[i]+=array1[i];
        }
        int ikinciArrayinIndexKontrolu=0;
        for (int i=adet1;i<adet1+adet2;i++){
            birlestirilenArray[i]+=array2[ikinciArrayinIndexKontrolu];
            ikinciArrayinIndexKontrolu++;
        }
        System.out.println("Birleştirilen Array:"+Arrays.toString(birlestirilenArray));
    }
}
