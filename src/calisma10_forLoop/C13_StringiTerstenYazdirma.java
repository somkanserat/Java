package calisma10_forLoop;

import java.util.Scanner;

public class C13_StringiTerstenYazdirma {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz:");
        String metin = input.nextLine();

        for (int i=metin.length()-1;i>=0;i--){
            System.out.print(metin.charAt(i));
        }

    }
}
