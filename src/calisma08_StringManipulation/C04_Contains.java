package calisma08_StringManipulation;

import java.util.Scanner;

public class C04_Contains {

    public static void main(String[] args) {

        //Kullanıcıdan bir metin isteyin. Metin ev içeriyorsa, "Ev gibisi yok"
        //iş içeriyorsa "Çalışmak ne güzel"
        // metin hem ev hem de iş içeriyorsa "Evden çalışmak ne güzel"
        // her ikisi de yoksa "Çalışmak lazım" yazdırın.

        Scanner input = new Scanner(System.in);

        System.out.print("Gününüzü nasıl geçiriyorsunuz?");
        String metin = input.nextLine();

        if (metin.toLowerCase().contains("ev") && metin.toLowerCase().contains("iş")){
            System.out.println("Evden çalışmak ne güzel.");
        }
        else if (metin.toLowerCase().contains("ev")) {
            System.out.println("Ev gibisi yok.");
        }
        else if (metin.toLowerCase().contains("iş")) {
            System.out.println("Çalışmak ne güzel.");
        }
        else {
            System.out.println("Çalışmak lazım.");
        }


    }
}
