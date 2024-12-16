package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C09_Ternary {

    public static void main(String[] args) {

        //kullanıcıdan bir tam sayi isteyin, sayi 100'den büyükse, değeri 10 azaltın
        //sayi 100 veya daha küçükse değerini 10 artırın

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir tam sayi girin:");
        int sayi = input.nextInt();

        sayi = sayi>100? sayi-10: sayi+10;
                      //true olursa   //false olursa
        //System.out.print(sayi);

        // sayı çift ise, değerini yarıya indirin
        // sayı tek ise, değerini 20 artırın

        sayi = sayi % 2 == 0?    sayi/2:     sayi+20;
                            //true olursa   //false olursa
        System.out.println(sayi);

    }
}
