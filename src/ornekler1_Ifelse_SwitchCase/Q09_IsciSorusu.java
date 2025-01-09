package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q09_IsciSorusu {

    public static void main(String[] args) {

        //Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        //hesaplayan kodu yazınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir işçinin, işi bitirme süresi: ");
        int sure = input.nextInt();

        System.out.print("İşçi Sayısı: ");
        int iscisayisi = input.nextInt();

        double bitirmesuresi = (double)sure/(double)iscisayisi;
        System.out.println(iscisayisi +" işçinin, işi bitirme süresi "+bitirmesuresi +" gündür");

    }
}
