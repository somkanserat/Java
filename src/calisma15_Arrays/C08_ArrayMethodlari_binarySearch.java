package calisma15_Arrays;

import java.util.Arrays;

public class C08_ArrayMethodlari_binarySearch {

    public static void main(String[] args) {

        String[] harfler = {"d","r","y","t","d","a","t","d","b","r","d","y","k"};

        //verilen bir array'de a harfinin var olup olmadığını yazdırın.

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"d");
        //Aradığınız harf, array'de 4 kez kullanılmış.

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"x");
        //Aradığınız harf, array'de kullanılmamıştır.


        int[] sayilar = {3,4,7,9,1,12};
        //sayilar array'inde 8'in var olup olmadığını kontrol edin.
        //C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(sayilar,8);
        //method call için kullanılan argumentler (sayilar ve 8)
        //method parametreleri ile uyumlu değil(String[] br string arananHarf)

        System.out.println(Arrays.binarySearch(sayilar,3)); //0
        System.out.println(Arrays.binarySearch(sayilar,4)); //1
        System.out.println(Arrays.binarySearch(sayilar,7)); //2
        System.out.println(Arrays.binarySearch(sayilar,9)); //-6
        System.out.println(Arrays.binarySearch(sayilar,1)); //-1
        System.out.println(Arrays.binarySearch(sayilar,12)); //5

        /*
            Array.binarySearch() bir array'de aranan elementin hangi index'de olduğunu verir
            ANCAK bu method'dan önce sort() çalıştırılmalıdır.
         */

        Arrays.sort(sayilar);

        System.out.println(Arrays.binarySearch(sayilar,3)); //1
        System.out.println(Arrays.binarySearch(sayilar,4)); //2
        System.out.println(Arrays.binarySearch(sayilar,7)); //3
        System.out.println(Arrays.binarySearch(sayilar,9)); //4
        System.out.println(Arrays.binarySearch(sayilar,1)); //0
        System.out.println(Arrays.binarySearch(sayilar,12)); //5

        // olmayan bir eleman arandiginda ise
        // olsaydi bulunacagi SIRALAMAYI - olarak verir
        // index kullanilsaydi -0 diyemeyecegimiz icin index degil SIRALAMAYI verir

        System.out.println(Arrays.binarySearch(sayilar, 10)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 5)); // -4
        System.out.println(Arrays.binarySearch(sayilar, 0)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 40)); // -7
        System.out.println(Arrays.binarySearch(sayilar, 10000)); // -7
        System.out.println(Arrays.binarySearch(sayilar, 234510)); // -7

    }
}
