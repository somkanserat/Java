package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C11_Ternary_EskenarUcgen {

    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse
        //“Eskenar degil” yazdirin.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");

        double kenar1 = input.nextDouble();
        double kenar2 = input.nextDouble();
        double kenar3 = input.nextDouble();

        System.out.println(kenar1 == kenar2 && kenar1==kenar3 ? "Eşkenar Ucgen": "Eşkenar Değil");

    }
}
