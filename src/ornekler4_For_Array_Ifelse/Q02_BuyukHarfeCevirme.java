package ornekler4_For_Array_Ifelse;

import java.util.Scanner;

public class Q02_BuyukHarfeCevirme {

    public static void main(String[] args) {

        /*12----
            Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

            Test Data:
            Java is fun

            Beklenen Sonuç:
            JAVA IS FUN
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle giriniz.");
        String cumle = scan.nextLine();

        System.out.println(cumle.toUpperCase());

    }
}
