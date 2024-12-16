package calisma05_ifElseStatements;

import java.util.Scanner;

public class C03_EskenarUcgen {

    public static void main(String[] args) {

        //Soru-4 Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın. Üçgen eşkenarsa Eşkenar üçgendir yazdırın

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");

        double kenar1 = input.nextDouble();
        double kenar2 = input.nextDouble();
        double kenar3 = input.nextDouble();

        if (kenar1 == kenar2 && kenar2== kenar3 && kenar1>0){  //kenar1 == kenar2 == kenar3 şeklinde yazamayız. kenar1 == kenar2 kontrol eder ve false/true yazar.
                                                               //Bu sefer kenar3 ile karşılaştırdığında, boolean ile double karşılaştırmış oluruz.

            System.out.println("Eşkenar Üçgendir.");

        }
    }

}
