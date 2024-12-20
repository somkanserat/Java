package calisma15_Arrays;

import java.util.Arrays;

public class C06_ArreyeElemanEklemeMEtodu {

    public static void main(String[] args) {
        // verilen String bir array'in sonuna
        // verilen yeni bir metni eleman olarak ekleyip
        // array'in yeni halini bize donduren bir method olusturun

        String[] isimler ={"ali","hamza"};

        isimler = arrayeElementEkle(isimler,"cansu");
        System.out.println("Cansu eklenmiş hali:" + Arrays.toString(isimler));

        isimler = arrayeElementEkle(isimler,"serat");
        System.out.println("Serat eklenmiş hali:"+Arrays.toString(isimler));
    }

    public static String[] arrayeElementEkle(String[] eskiArray, String eklenecekYeniElement){

        //1.adım: yeni array oluştur
        String[] yeniArr = new String[eskiArray.length+1]; //{null,null,null}
        System.out.println(Arrays.toString(yeniArr));

        //2.adım: eski array'deki elementleri, eski array'e kopyala

        for (int i=0; i< eskiArray.length;i++){

            yeniArr[i] = eskiArray[i];

        }
        System.out.println(Arrays.toString(yeniArr));//{ali,hamza,null}

        //3.adım: sonda kalan elemana, eklenecekYeniElement değerini atayalım

        yeniArr[yeniArr.length-1] = eklenecekYeniElement;

        //4.adım: eski array'e, yeni array değerini atayalım
        eskiArray = yeniArr;
        return eskiArray; //4.adım şart değil. 4.adımı yapmayıp, yeniArr değerini return edebiliriz.
    }
}
