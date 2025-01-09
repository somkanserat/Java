package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q20_UcgeninAlani {
    /*
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin 3 uzunluğunu da giriniz:");
        int uzunluk1 = scan.nextInt();
        int uzunluk2 = scan.nextInt();
        int uzunluk3 = scan.nextInt();

        double cevre = (double) (uzunluk1 + uzunluk2 + uzunluk3)/2;
        System.out.println("Üçgenin Çevresi:"+cevre);

        double alan = Math.sqrt(cevre*(cevre-uzunluk1)*(cevre-uzunluk2)*(cevre-uzunluk3));
        System.out.println("Üçgenin Alanı:"+alan);
    }
}
