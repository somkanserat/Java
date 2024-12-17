package calisma08_StringManipulation;

import java.util.Scanner;

public class C07_emailKontrol {

    public static void main(String[] args) {

        /*
            SORU : kullanicidan bir mail alin
            - mail @ icermiyorsa “gecersiz mail”
            - mail @gmail.com icermiyorsa, “mail gmail olmali”
            - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
             yazdirin
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Mail adresini giriniz:");
        String mail = input.nextLine();

        if (!mail.contains("@")){
            System.out.println("Geçersiz Mail");
        }

        if (!mail.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }
        if (!mail.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }
    }
}
