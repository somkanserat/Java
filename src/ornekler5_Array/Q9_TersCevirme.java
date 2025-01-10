package ornekler5_Array;

import java.util.Scanner;

public class Q9_TersCevirme {

    /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

        Test Data:
        sentence -> "Java is fun"
        reversed -> "fun is Java"
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle girin:");
        String cumle = scan.nextLine();

        String[] arrayCumle = cumle.split(" ");

        String tersCumle = "";

        for (int i=arrayCumle.length-1; i>=0;i--){

            tersCumle += arrayCumle[i]+" ";
        }
        System.out.println("Cümlenin tersi:"+tersCumle);

    }
}
