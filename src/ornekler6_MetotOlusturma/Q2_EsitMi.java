package ornekler6_MetotOlusturma;

import java.util.Scanner;

public class Q2_EsitMi {

    /*32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen karşılaştırılacak 2 sayıyı giriniz:");
        System.out.print("1.Sayı:");
        int number1 = scan.nextInt();
        System.out.print("2.Sayı:");
        int number2 = scan.nextInt();

        aynimİ(number1,number2);
    }

    public static void aynimİ(int number1,int number2){

        if (number1==number2){
            System.out.println(number1+" = "+number2+" => true");
        }
        else {
            System.out.println(number1+" = "+number2+" => false");
        }
    }


}
