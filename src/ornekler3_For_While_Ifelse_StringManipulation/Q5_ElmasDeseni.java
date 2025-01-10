package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q5_ElmasDeseni {

    /*5-----
            Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
            Test Data:
            Yarım elmas uzunluğu : 7
            Beklenen Çıktı:
                *
               ***
              *****
             *******
            *********
           ***********
          *************
           ***********
            *********
             *******
              *****
               ***
                *
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Yarım elmas uzunluğunu giriniz:");
        int elmasUzunlugu = scan.nextInt();

        for (int i=1; i<=elmasUzunlugu; i++){

            for (int k=elmasUzunlugu-1;k>=i;k--){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("");

        }

        for (int l=elmasUzunlugu-1;l>=1;l--){

            for (int m=elmasUzunlugu-l;m>=1;m--){
                System.out.print(" ");
            }

            for (int n=1; n<=l; n++){
                System.out.print(" *");
            }
            System.out.println("");
        }




    }
}
