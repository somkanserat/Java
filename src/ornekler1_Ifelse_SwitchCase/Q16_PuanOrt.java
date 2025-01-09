package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q16_PuanOrt {

    public static void main(String[] args) {

        /*
        Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
                1. 0(dahil) ile 50 arasi - D
                2. 50(dahil) ile 60 arası - C
                3. 60(dahil) ile 80 arası - B
                4. 80(dahil) ustu- A
        Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

        dip not : switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        switch() de int, byte, short, char, String kullanilir.
         */

        Scanner input = new Scanner(System.in);


        System.out.println("1:0(dahil)-50 Arası" +
                "\n2:50(dahil)-60 Arası\n3:60(dahil)-80 Arası" +
                "\n4:80(dahil) Üstü");

        System.out.print("Notunuzu Giriniz:");
        int not = input.nextInt();


    }
}
