package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q7_SonIkiHarfYazdirma {

    public static void main(String[] args) {

        /*
            Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
             * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
             *
             * ornek
             * input = Ali
             * output = lilili
             *
             * input = el
             * output = el

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime giriniz:");
        String kelime = input.nextLine();

        if (kelime.length() >=3){
            for (int i=0;i<3;i++){
                System.out.print(kelime.substring(kelime.length()-2));
            }
        }
        else {
            System.out.println(kelime);
        }

    }
}
