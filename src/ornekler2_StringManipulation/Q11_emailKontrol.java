package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q11_emailKontrol {

    public static void main(String[] args) {

        /*
            Kullanicidan email girmesini isteyin
            @ isareti icermiyorsa "gecerli bir email girin" yazdirin
            @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
            @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
            ORNEK:
            INPUT : techproed.com OUTPUT : "gecerli bir email girin "
            INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
            INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("E-mail adresinizi girin:");
        String email = input.nextLine();
        String i = email.substring(email.length()-9);

        if ( !(email.contains("@")) ){
            System.out.println("Geçerli bir email girin.");
        }
        else {
            if ( ! (i.contains("gmail.com")) ){
                System.out.println("Lütfen gmail hesabınızı girin.");
            }
            else {
                System.out.println("email onaylandı");
            }
        }

    }
}
