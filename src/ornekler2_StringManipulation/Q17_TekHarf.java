package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q17_TekHarf {

    public static void main(String[] args) {

        /*
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime giriniz:");
        String cumle = input.nextLine();

        cumle = cumle.toLowerCase();

        birKereYazdir(cumle);

    }

    public static void birKereYazdir(String str){
        String sonuc="";

        for(int i=0; i<str.length(); i++){

            if(! sonuc.contains(str.substring(i,i+1))){
                sonuc += str.substring(i,i+1);
            }
        }
        System.out.println(sonuc);
    }
}

