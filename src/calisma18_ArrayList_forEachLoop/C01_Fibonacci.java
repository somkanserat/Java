package calisma18_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_Fibonacci {

    public static void main(String[] args) {
        /*
        //Kullanıcıdan pozitif bir n tamsayisini alarak,
        //bize ilk n tane  Fibonacci sayisini bir liste olarak yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kaç adet fibonacci sayısını yazdırmak istediğinizi giriniz:");
        int n = scan.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>();

        //kullanıcı negatif veya 0 girerse ==>hata
        //kullanıcı 1 girerse? ==> 0
        //kullanıcı 2 girerse? ==> 1
        //kullanıcı 2den fazla girerse? ==> 0,1,...

        if (n<=0){
            System.out.println("Girilen değer pozitif olmalıdır.");
        }
        else if (n==1) {
            fibonacciSerisi.add(0);
        }
        else if (n==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }
        else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i=2; i<n;i++){
                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));
            }
            System.out.println(fibonacciSerisi);
        }
         */
        System.out.println(ilkNFibonacciListesi(7));  //[0, 1, 1, 2, 3, 5, 8]
        System.out.println(ilkNFibonacciListesi(13)); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]

    }

    /*
            Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
            sayisini bir list olarak donduren bir method olusturun.
    */

    public static List<Integer> ilkNFibonacciListesi(int n){

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (n<=0){
            System.out.println("Girilen değer pozitif olmalıdır.");
        }
        else if (n==1) {
            fibonacciSerisi.add(0);
        }
        else if (n==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }
        else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i=2; i<n;i++){
                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));
            }
        }
        return fibonacciSerisi;
    }
}
