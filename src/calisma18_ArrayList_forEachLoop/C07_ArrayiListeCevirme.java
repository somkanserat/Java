package calisma18_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer [] arr = {3,5,6,2,3,4,1,2,3,4,5,6,7,8};

        //arry'in elementlerini kullanarak bir list olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int each : arr){
            sayilar.add(each);
        }
        System.out.println("Sayılar listesi:"+sayilar);

        // Arrays class'ında bu çevirme işlemini yapan hazır bir method var.
        // ANCAK 2 büyük dezavantajı olduğu için GENELDE kullanılmaz;
        // 1.List'in en büyük avantajı olan ekleme(add) ve silme(remove) yapılamaz
        // 2.Java array ve list'de yapılan tüm değişkenlkeri ortak olarak kabul eder.

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Arrayden list:"+arraydenList);

        //arraydenList.add(5);

        //System.out.println("Arrayden list:"+arraydenList); //UnsupportedOperationException

        //arraydenList.remove(3);

        //System.out.println("Arrayden list:"+arraydenList);  //UnsupportedOperationException


        arr[0] = 20;

        System.out.println("Sayılar listesi:"+sayilar);

        System.out.println("Arrayden list:"+arraydenList);
    }
}
