package calisma11_NestedForLoop_MethoduOlusturma;

import java.util.Scanner;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*

            aşağıdaki şekli çizdirecek kodu yazınız

            *
            * *
            * * *
            * * * *
            * * * * *
         */

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5 ; i++) { //satırlar

            for (int j = 1; j <= i ; j++) { //her satırdaki sutunlar

                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
