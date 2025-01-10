package ornekler4_For_Array_Ifelse;

import java.util.Scanner;

public class Q5_enKucukSayi {


    /*17---
        Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

        Test data:
        12,24,34

        Beklenen Çıktı:
        12
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Kaç adet sayı arasında karşılaştırma yapmak istersiniz:");
        int adet = scan.nextInt();

        int min = 0;

        for (int i=1; i<=adet;i++){

            System.out.print(i+". sayı giriniz:");
            int sayi= scan.nextInt();

            if (sayi<min || min ==0){
                min=sayi;
            }
        }
        System.out.println("Girilen sayılardan en küçüğü:"+min);

    }

}
