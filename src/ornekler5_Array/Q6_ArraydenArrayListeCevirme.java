package ornekler5_Array;

import java.util.ArrayList;
import java.util.List;

public class Q6_ArraydenArrayListeCevirme {

    /*26-----
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        Beklenen Çıktı:
        [Python, JAVA, PHP, Perl, C#, C++]
    */

    public static void main(String[] args) {

        String[] array = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> list = new ArrayList<>();

        for (int i=0; i<array.length; i++){

            list.add(array[i]);
        }
        System.out.println(list);
    }

}
