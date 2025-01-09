package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q13_TrafikCezasi_IFelse {

    public static void main(String[] args) {

        /*
        Kulanicidan aracacinin hizini aliniz Trafik cezasinin
        degerini hesaplayin. 45 hiz siniridir.
        Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
                * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
                * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
                * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
                * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Ehliyet Bilgisini Giriniz(VAR/YOK):");
        String ehliyet = input.nextLine();
        ehliyet = ehliyet.toLowerCase();
        int ehl = 200;

        if (ehliyet.equals("yok")){
            System.out.print("Hız Değerinizi Giriniz:");
            int hiz = input.nextInt();

            if (hiz<=55 && hiz>=0){
                System.out.println("Cezanız bulunmamaktadır ama ehliyetiniz yoksa cezanız " +ehl +"$ olacaktır.");
            }
            else if (hiz>=55 && hiz<=74) {
                System.out.println("Cezanız 100$'dır ama ehliyetiniz yoksa cezanız " +(ehl+100) +"$ olacaktır.");
            }
            else if (hiz>=75 && hiz<=84) {
                System.out.println("Cezanız 150$'dır ama ehliyetiniz yoksa cezanız " +(ehl+150) +"$ olacaktır.");
            }
            else if (hiz>=85 && hiz<=94) {
                System.out.println("Cezanız 320$'dır ama ehliyetiniz yoksa cezanız " +(ehl+320) +"$ olacaktır.");
            }
            else if (hiz>=95){
                System.out.println("Cezanız 500$'dır ama ehliyetiniz yoksa cezanız " +(ehl+500) +"$ olacaktır.");
            }
            else {
                System.out.println("Yanlış değer girdiniz.");
            }
        }
        else if (ehliyet.equals("var")){

            System.out.print("Hız Değerinizi Giriniz:");
            int hiz = input.nextInt();

            if (hiz<=55 && hiz>=0){
                System.out.println("Cezanız bulunmamaktadır.");
            }
            else if (hiz>=55 && hiz<=74) {
                System.out.println("Cezanız 100$'dır.");
            }
            else if (hiz>=75 && hiz<=84) {
                System.out.println("Cezanız 150$'dır.");
            }
            else if (hiz>=85 && hiz<=94) {
                System.out.println("Cezanız 320$'dır.");
            }
            else if (hiz>=95){
                System.out.println("Cezanız 500$'dır.");
            }
            else {
                System.out.println("Yanlış değer girdiniz.");
            }
        }
        else {
            System.out.println("Yanlış bilgi girdiniz.");
        }

    }
}
