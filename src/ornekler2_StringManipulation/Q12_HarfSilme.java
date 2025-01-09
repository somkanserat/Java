package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q12_HarfSilme {

    public static void main(String[] args) {

        /*
        String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
           ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime giriniz:");  //serat
        String kelime = input.next();

        System.out.println(harfkontrol(kelime));  //rat
       //System.out.println(kelime); //serat

    }

    public static String harfkontrol(String kelime){

        if ( ! (kelime.charAt(0) == 'g') && ! (kelime.charAt(1) == 'h')){
            return kelime.substring(2);
        }
        else if (! (kelime.charAt(0) == 'g')) {
            return kelime.substring(1);
        }
        else if (! (kelime.charAt(1) == 'h')) {
            return (kelime.substring(0,1) + kelime.substring(2));
        }
        else {
            return kelime;
        }

    }
}
