package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q20_TerstenYazma {

    /*
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.
        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir cümle girin:");
        String cumle = input.nextLine();

        System.out.println(reverseString(cumle));

    }

    public static String reverseString(String cumle){

        String yeniCumle="";

        for (int i=cumle.length()-1; i>=0; i--){
            yeniCumle += cumle.charAt(i);
        }
        return yeniCumle;
    }
}
