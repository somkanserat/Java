package calisma05_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");

        double kenar1 = input.nextDouble();
        double kenar2 = input.nextDouble();
        double kenar3 = input.nextDouble();

        if (kenar1 == kenar2 && kenar2== kenar3 && kenar1>0){  //kenar1 == kenar2 == kenar3 şeklinde yazamayız. kenar1 == kenar2 kontrol eder ve false/true yazar.
            //Bu sefer kenar3 ile karşılaştırdığında, boolean ile double karşılaştırmış oluruz.

            System.out.println("Eşkenar Üçgendir.");
        }
        else {
            System.out.println("Eşkenar Üçgen değildir.");
        }

    }

}
