package ornekler5_Array;

public class Q8_ArraydekiCiftVeTekSayilar {

    /*28----
        Array içerisindeki tek ve çift sayıların
        kaçar tane olduğunu bulan Java Kodu yazınız.

        Array: [1,2,3,4,5,6,7,8,9]

        Beklenen Çıktı:
        Tek Sayilar: 5
        Cift Sayilar: 4
    */

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};
        ciftVeTekSayilar(array);

    }

    public static void ciftVeTekSayilar(int [] array){

        int ciftSayac=0;
        int tekSayac=0;

        for (int i=0; i<array.length;i++){

            if (array[i]%2 == 0){
                ciftSayac++;
            }
            else {
                tekSayac++;
            }
        }
        System.out.println("Array'deki çift sayıların adedi:"+ciftSayac);
        System.out.println("Array'deki tek sayıların adedi:"+tekSayac);
    }
}
