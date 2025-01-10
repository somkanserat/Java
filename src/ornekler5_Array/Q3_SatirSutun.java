package ornekler5_Array;

import java.util.Scanner;

public class Q3_SatirSutun {

    /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

        Beklenen Çıktı:
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Satır sayısını girin:");
        int satir = scan.nextInt();
        System.out.print("Sütun sayısını girin:");
        int sutun = scan.nextInt();

        for (int i=1; i<=satir; i++){
            for (int j=1; j<=sutun; j++){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
