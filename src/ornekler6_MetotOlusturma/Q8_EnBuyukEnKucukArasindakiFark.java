package ornekler6_MetotOlusturma;

public class Q8_EnBuyukEnKucukArasindakiFark {

    /*38----
        Verilen array'deki en büyük[ ve en küçük sayı arasındaki farkı return eden bir method yazınız.

        Örnek -
        farkBul([10, 15, 20, 2, 10, 6])
        18
    */

    public static void main(String[] args) {

        int[] arr = {10,15,20,2,10,6,45,6,-1,4,-5,5};
        System.out.println(fark(arr));
    }

    public static int fark(int[] arr){

        int enKucuk=arr[0];
        int enBuyuk=arr[0];
        int fark;
        for (int i=0; i<arr.length;i++){

            if (arr[i]<enKucuk){

                enKucuk=arr[i];
            }
            if (arr[i]>enBuyuk){

                enBuyuk=arr[i];
            }
        }
        fark = enBuyuk-enKucuk;
        return fark;
    }
}
