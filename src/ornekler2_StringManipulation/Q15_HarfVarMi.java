package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q15_HarfVarMi {

    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime giriniz:");
        String kelime = input.next();
        kelime = kelime.toLowerCase();

        System.out.println(varMi(kelime));

    }

    public static boolean varMi(String kelime){

        if ((kelime.contains("xyz"))){
            return true;
        }
        else {
            return false;
        }

    }
}
