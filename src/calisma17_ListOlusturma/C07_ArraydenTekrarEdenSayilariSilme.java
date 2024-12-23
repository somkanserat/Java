package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArraydenTekrarEdenSayilariSilme {

    public static void main(String[] args) {
        //Verilen bir array'de tekrar eden sayi varsa, tekrar eden sayıları silin.
        //array'i her sayidan sadece 1 tane bulunacak şekilde kaydedin
        //ornek input:{2,4,5,2,4,2,2,4,2,4,3,5,1}
        //      output:{1,2,3,4,5}

        int [] arr = {2,4,5,2,4,2,2,4,2,4,3,5,1};

        List<Integer> tekrarsizList = new ArrayList<>();

        //arr'deki tüm elemanları gözden geçirip, tekrarsız list'de yoksa ekleyin.

        for (int i=0;i<arr.length;i++){

            if (! (tekrarsizList.contains(arr[i])) ){

                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println("Tekrarsız Liste:"+tekrarsizList); //[2, 4, 5, 3, 1]

        //Array'deki tekrar etmeyen sayıları bulduk ama görev bitmedi.
        //arr ile ilgili bir işlem yapmadık, tekrarsız elementler list'e kaydedildi.

        //****************
        //Collections.sort(tekrarsizList); //[1, 2, 3, 4, 5]
        //List'i sıralamak istediğimizde Collections.sort() kullanılırr

        arr = new int[tekrarsizList.size()]; //[0, 0, 0, 0, 0]

        for (int i=0; i<arr.length;i++){   //for (int i=0; i<tekrarsizList.size();i++)
            arr[i]+=tekrarsizList.get(i);
        }
        Arrays.sort(arr);
        System.out.println("arr'nin son hali:"+Arrays.toString(arr));

    }
}
