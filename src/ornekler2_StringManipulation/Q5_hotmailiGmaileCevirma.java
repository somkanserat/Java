package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q5_hotmailiGmaileCevirma {

    public static void main(String[] args) {

        /*
            -kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
            örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen eposta adresinizi giriniz:");
        String email = input.nextLine();

        if (email.contains("hotmail")){

            email = email.replace("hotmail","gmail");
            System.out.println(email);

        }

    }
}
