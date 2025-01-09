package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q11_UcgenOlusturmaDurumu {

    public static void main(String[] args) {
        /*
        Kullanicidan 3 tene pozitif  tam sayi alniz.
        bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

        üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
                herhangi iki kenar farkı diger kenardan büyük olmali

         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
         a=b=c ise es kenar ucgen
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz.");
        System.out.print("1.Kenar Uzunluğu:");
        int kenar1 = input.nextInt();
        System.out.print("2.Kenar Uzunluğu:");
        int kenar2 = input.nextInt();
        System.out.print("3.Kenar Uzunluğu:");
        int kenar3 = input.nextInt();

        if ((kenar1+kenar3>kenar2) && (kenar1-kenar3)<kenar2){
            System.out.println("Seçilen değerler üçgen olma şartını sağlamaktadır.");

            if ((kenar1 == kenar2) && (kenar1==kenar3)){
                System.out.println("Eşkenar üçgendir.");
            }
            else {
                System.out.println("Üçgendir fakat, eşkenar üçgen değildir.");
            }
        }
        else {
            System.out.println("Girilen değerler, üçgen olma şartını sağlamamaktadır.");
        }

    }
}
