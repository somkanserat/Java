package calisma05_ifElseStatements;

import java.util.Scanner;

public class C10_BuyukHarf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan karakter almamız gereklidir. Girilin karakter büyük harf mmi? Değil mi?

        System.out.print("Harf giriniz: ");
        char harf = input.next().charAt(0);

        /*
        //---------1.yöntem ASCII Table-------------
        if(harf >= 'A' && harf<= 'Z'){
            System.out.println("Büyük harf girdiniz.");
        }

        else{
            System.out.println("Büyük harf değildir.");
        }
        */

        //----------2.yöntem Wrapper Class kullanımı-----------

        if (Character.isUpperCase(harf)){
            System.out.println("Büyük harf girdiniz.");
        }

        else{
            System.out.println("Büyük harf değildir.");
        }

    }
}
