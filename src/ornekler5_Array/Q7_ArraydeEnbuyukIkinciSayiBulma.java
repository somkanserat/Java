package ornekler5_Array;

import java.util.Arrays;

public class Q7_ArraydeEnbuyukIkinciSayiBulma {

    /*27----
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

        Array: [1232,2345,5467,678,3454,2312,3451]
    */

    public static void main(String[] args) {

        int[] array = {1232,2345,5467,678,3454,2312,3451};

        Arrays.sort(array);

        System.out.println("Array'deki en büyük 2.sayi: " +array[array.length-2]);
    }
}
