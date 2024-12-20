package calisma16_arrays_MultidimensionalArrays;

import java.util.Arrays;

public class C01_BinarySearch {

    public static void main(String[] args) {

        String[] harfler = {"k","e","t","r","n"};

        // sort kullanmadan binarysearch kullanılırsa, sonucun doğru ya da yanlış olduğuna emin olamayız.
        System.out.println(Arrays.binarySearch(harfler,"k")); //0
        System.out.println(Arrays.binarySearch(harfler,"e")); //-1
        System.out.println(Arrays.binarySearch(harfler,"t")); //2
        System.out.println(Arrays.binarySearch(harfler,"r")); //-3
        System.out.println(Arrays.binarySearch(harfler,"n")); //-3

        Arrays.sort(harfler); // [e,k,n,r,t] sıraladı

        System.out.println(Arrays.binarySearch(harfler,"k")); //1
        System.out.println(Arrays.binarySearch(harfler,"e")); //0
        System.out.println(Arrays.binarySearch(harfler,"t")); //4
        System.out.println(Arrays.binarySearch(harfler,"r")); //3
        System.out.println(Arrays.binarySearch(harfler,"n")); //2

        //olmayan bir har olursa
        System.out.println(Arrays.binarySearch(harfler,"a")); //-1
        System.out.println(Arrays.binarySearch(harfler,"b")); //-1
        System.out.println(Arrays.binarySearch(harfler,"g")); //-2
        System.out.println(Arrays.binarySearch(harfler,"s")); //-5
        //olsaydı, hangi sırada olacağını karakter sırasına göre verir. İndex şeklinde değil


    }
}
