package calisma10_forLoop;

import java.util.Scanner;

public class C14_StringiTersineCevirme {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz:");

        String metin = input.nextLine();
        String tersMetin = "";

        for (int i=metin.length()-1; i>=0;i--){
            tersMetin += metin.charAt(i);
        }
        System.out.println("Metnin tersten yazılışı:"+tersMetin);

        if(metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALINDROMDUR.");
        }
        else {
            System.out.println("Girilen metin PALINDROM değildir.");
        }


    }
}
