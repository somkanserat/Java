package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q8_CiftUzunluktaIseYarisiniYazdirma {

    public static void main(String[] args) {

        /*
        StringMethods:
                cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
                ORNEK:
                INPUT      :  Python
                OUTPUT :   Pyt
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Kelime giriniz:");
        String kelime = input.nextLine();

        if (kelime.length()%2 == 0){

            kelime = kelime.substring(0,kelime.length()/2);
            System.out.println(kelime);

        }

    }
}
