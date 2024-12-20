package calisma16_arrays_MultidimensionalArrays;

import java.util.Arrays;

public class C03_multiDimensionalArray {

    public static void main(String[] args) {

        //Arraylerde herhangi bir yazdırma işlemi yapacağımız zaman
        //ne yazdırdığımızı iyi bilmeliyiz.
        //eğer bir String veya primitive bir değer yazdıracaksak, direkt sout
        //eğer yazdırmak istediğimiz şey tek katlı bir array ise Arrays.toString(array[2])
        //eğer yazdırmak istediğimiz şey multidimensional array ise

        int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        //int [] arr = {arr[0],arr[1],arr[2],arr[3],arr[4]};

        System.out.println(arr.length); //5 = eleman sayısı

        System.out.println(arr[0].length); //4 = 0.indeksin eleman sayısı

        System.out.println((arr[0])); //==>[I@4c203ea1
        System.out.println(Arrays.toString(arr[0])); //==>{3,1,2,4}==>[3, 1, 2, 4]
        System.out.println(Arrays.toString(arr[1])); //==>{1,2} ==> [1, 2]
        System.out.println(Arrays.toString(arr[2])); //==>{3,4,5} ==> [3, 4, 5]
        System.out.println(Arrays.toString(arr[3])); //==>{10}==>[10]
        System.out.println(Arrays.toString(arr[4])); //==>{2,7}==>[2, 7]

        System.out.println(arr[0][3]);  //==> {4}
        System.out.println(arr[1][1]);  //==> {2}
        System.out.println(arr[2][2]);  //==> {5}
        System.out.println(arr[4][1]);  //==> {2}


        //Array içindeki array'i yazdırmak için;
        System.out.println(Arrays.toString(arr[2])); //[3, 4, 5]

        System.out.println(Arrays.deepToString(arr)); //[[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]


    }
}
