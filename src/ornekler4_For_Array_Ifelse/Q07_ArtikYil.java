package ornekler4_For_Array_Ifelse;

    /*
        kullanıcıdan artık yıl olup olmadığını kontrol etmek için yıl girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil degildi
        Kural 2: 4 ile bolunup 100 ile bolunmeyen yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
    */

import java.util.Scanner;

public class Q07_ArtikYil {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir yıl giriniz:");
        int yil = scan.nextInt();

        if (yil % 4 == 0){

            if (yil % 100 == 0){

                if (yil % 400 == 0){
                    System.out.println("Artık Yıl.");
                }
                else {
                    System.out.println("Artık Yıl Değildir.");
                }
            }
            else {
                System.out.println("Artık Yıl");
            }
        }
        else {
            System.out.println("Artık Yıl Değildir.");
        }
    }
}
