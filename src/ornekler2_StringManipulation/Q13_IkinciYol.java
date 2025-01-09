package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q13_IkinciYol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1. isim giriniz:");
        String isim1 = input.nextLine().toLowerCase();
        System.out.println("Lutfen 2. isim giriniz:");
        String isim2 = input.nextLine().toLowerCase();
        isimBirlestir(isim1, isim2);

    }

    public static void isimBirlestir(String isim1, String isim2){

        if (isim1.length() % 2 == 0){
            System.out.println(
                    isim1.substring(0,isim1.length()/2).concat(isim2).concat(isim1.substring(isim1.length()/2))
            );
        }
        else {
            System.out.println(isim1+" çift sayılı olmadığı için ortasına yerleştiremedik");
        }
    }
}
