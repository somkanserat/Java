package calisma15_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {

    public static void main(String[] args) {

        int sayilar [] = {3,5,6};

        //sayılar array'ine 4.element olarak(yani 3.index'e) 8 ekleyin
        //array [3,5,6,8] haline getirin

        //sayilar[3] = 8;  // ArrayIndexOutOfBoundsExpection

        //int sayilar [] = {3,5,6,8}; //Array initializer is not allowed here
        //daha önce oluşturulmuş bir array'e bu şekilde yani değer ataması yapılamaz.

        //sayilar = new int[4]; //[0,0,0,0]
        //eğer direkt değer ataması olarak new int[4] dersek, tüm elemanlar 0 olur.

        //1.adım: önce yeni bir array oluşturalım.
        //        yeni array'in kapasitesi(lenght) eskisinden 1 fazla olsun.

        int [] yeniArr = new int[sayilar.length+1]; // [0,0,0,0]

        //2.adım: yeni array 0'lardan oluşur
        //        oncelikle eski array'deki elementleri yeni array'e kopyalamalıyız

        for (int i=0; i< sayilar.length; i++){
            yeniArr[i] = sayilar[i];
        }   //[3,5,6,0]

        //3.adım: sonda kalan tek 0 yerine, eklemek istediğimz sayıyı atamalıyız.
        yeniArr[yeniArr.length-1] = 8; // [3,5,6,8]

        //4.adım: eklemeyi yeni array'e yaptık
        //        eski array'e yeni array'i değer olarak atayalım

        sayilar = yeniArr;

        System.out.println("sayılar array'inin son hali:" + Arrays.toString(sayilar));

    }
}
