package ornekler4_For_Array_Ifelse;

import java.util.Arrays;

public class Q08_Siralama {

    /*20----
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
        not: Test datadaki değerleri kullanınız.


        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]

        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]
    */

    public static void main(String[] args) {

        String[] diller = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        int[] sayilar = {1232,1134,2345,1022};

        Arrays.sort(diller);
        System.out.println(Arrays.toString(diller));

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
}
