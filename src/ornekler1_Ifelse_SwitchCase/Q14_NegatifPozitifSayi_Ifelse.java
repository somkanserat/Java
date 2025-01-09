package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q14_NegatifPozitifSayi_Ifelse {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı değeri giriniz:");
        int sayi = input.nextInt();


        if (sayi>=0){
            if (sayi<10){
                System.out.println("Sayı,rakamdır.");
            }
            else {
                System.out.println("Pozitif Sayı");
            }
        }
        else {
            System.out.println("Negatif Sayi");
        }


    }
}
