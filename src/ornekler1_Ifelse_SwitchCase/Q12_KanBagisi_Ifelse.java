package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q12_KanBagisi_Ifelse {

    public static void main(String[] args) {

        // Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz:");
        int yas = input.nextInt();
        System.out.print("Kilonuzu Giriniz:");
        int kilo = input.nextInt();

        if (yas<18){
            System.out.println("Kan bağışı yapamazsınız.");
        }
        else if (yas>18 && kilo<50) {
            System.out.println("Kan bağışı yapamazsınız.");
        }
        else if (yas>18 && kilo>50) {
            System.out.println("Kan bağışı yapabilirsiniz.");
        }
        else {
            System.out.println("Kan bağışı yapamazsınız.");
        }
    }
}
