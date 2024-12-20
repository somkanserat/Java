package calisma16_arrays_MultidimensionalArrays;

import java.util.Arrays;

public class C08_AyniIndextekileriTopla {

    public static void main(String[] args) {

        // Verilen 2 katli ve 2 inner array'e sahip bir array'de
        // ayni index'e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.

        //    input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //     output:                       [5, 7, 11]

        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        //once ortak index sayısını bulalım.
        //ortak index sayısı uzun olmayan inner array'in lenght'ine eşit

        int ortakIndexSayisi = arr[0].length<arr[1].length?arr[0].length:arr[1].length; //Ternary kullandık. Sen if ile yap
        System.out.println(ortakIndexSayisi); //3

        int[] istenenArray = new int[ortakIndexSayisi];
        System.out.println(Arrays.toString(istenenArray)); // [0, 0, 0]

        for (int i=0; i<istenenArray.length;i++){

            istenenArray[i] += arr[0][i]+arr[1][i];

        }
        System.out.println(Arrays.toString(istenenArray));

    }
}
