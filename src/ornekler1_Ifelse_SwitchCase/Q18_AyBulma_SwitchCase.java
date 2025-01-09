package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q18_AyBulma_SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı Ayı Seçmek İstersiniz:");
        int ay = input.nextInt();

        switch (ay){

            case 1:
                System.out.println("Ocak Ayını Seçtiniz.\nGün Sayısı:31");
                break;
            case 2:
                System.out.println("Şubat Ayını Seçtiniz.\nGün Sayısı:28");
                break;
            case 3:
                System.out.println("Mart Ayını Seçtiniz.\nGün Sayısı:31");
                break;
            case 4:
                System.out.println("Nisan Ayını Seçtiniz.\nGün Sayısı:30");
                break;
            case 5:
                System.out.println("Mayıs Ayını Seçtiniz.\nGün Sayısı:31");
                break;
            case 6:
                System.out.println("Haziran Ayını Seçtiniz.\nGün Sayısı:30");
                break;
            case 7:
                System.out.println("Temmuz Ayını Seçtiniz.\nGün Sayısı:31");
                break;
            case 8:
                System.out.println("Ağustos Ayını Seçtiniz.\nGün Sayısı:31");
                break;
            case 9:
                System.out.println("Eylül Ayını Seçtiniz.\nGün Sayısı:30");
                break;
            case 10:
                System.out.println("Ekim Ayını Seçtiniz.\nGün Sayısı:31");
                break;
            case 11:
                System.out.println("Kasım Ayını Seçtiniz.\nGün Sayısı:30");
                break;
            case 12:
                System.out.println("Aralık Ayını Seçtiniz.\nGün Sayısı:31");
                break;
            default:
                System.out.println("Yanlış numara girdiniz.");
                break;
        }
    }
}
