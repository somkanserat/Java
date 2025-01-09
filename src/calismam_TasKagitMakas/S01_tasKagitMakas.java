package calismam_TasKagitMakas;

import java.util.Random;
import java.util.Scanner;

public class S01_tasKagitMakas {

    public static void main(String[] args) {
        /*
            Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
            Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
            Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
            5 kez kazandiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

            Kâğıt taşı sarar
            Taş makası kırar
            Makas kağıdı keser

        */

        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Taş-Kağıt-Makas oyununun kaç kez oynanacağını seçin:");
        int kacKez = scan.nextInt();

        int kullaniciSkor = 0;
        int bilgisayarSkor = 0;



        if (kacKez>0){

            for (int i=0;i<kacKez;i++){

                System.out.print("1:Taş\n2:Kağıt\n3:Makas\nTaş-Kağıt-Makas'tan bir tanesini seçin:");
                int kullaniciSecimi = scan.nextInt();
                int bilgisayarSecimi = random.nextInt(3)+1; //sadece 3 elemanı olacak anlamına gelir.(0,1,2 seçeceği için +1 yaptık ve değer aralığını 1,2,3 yaptık)

                switch (kullaniciSecimi){

                    case 1:

                        if (bilgisayarSecimi==1){
                            System.out.println("İki tarafta Taş'ı seçti. Berabere");
                            kacKez--;
                        }
                        else if (bilgisayarSecimi ==2) {
                            System.out.println("Kullanıcı Taş'ı seçti. Bilgisayar Kağıt'ı seçti. Bilgisayar kazandı");
                            bilgisayarSkor++;
                            kacKez--;
                        }
                        else {
                            System.out.println("Kullanıcı Taş'ı seçti. Bilgisayar Makas'ı seçti.Kullanıcı kazandı.");
                            kullaniciSkor++;
                            kacKez--;
                        }
                        break;

                    case 2:

                        if (bilgisayarSecimi==1){
                            System.out.println("Kullanıcı Kağıt'ı seçti. Bilgisayar Taş'ı seçti. Kullanıcı kazandı");
                            kullaniciSkor++;
                            kacKez--;
                        }
                        else if (bilgisayarSecimi ==2) {
                            System.out.println("İki tarafta Kağıt'ı seçti. Berabere");
                            kacKez--;
                        }
                        else {
                            System.out.println("Kullanıcı Kağıt'ı seçti. Bilgisayar Makas'ı seçti. Bilgisayar kazandı.");
                            bilgisayarSkor++;
                            kacKez--;
                        }
                        break;

                    case 3:

                        if (bilgisayarSecimi==1){
                            System.out.println("Kullanıcı Makas'ı seçti. Bilgisayar Taş'ı seçti. Bilgisayar kazandı");
                            bilgisayarSkor++;
                            kacKez--;
                        }
                        else if (bilgisayarSecimi ==2) {
                            System.out.println("Kullanıcı Makas'ı seçti. Bilgisayar Kağıt'ı seçti. Kullanıcı kazandı.");
                            kullaniciSkor++;
                            kacKez--;
                        }
                        else {
                            System.out.println("İki tarafta Makas'ı seçti. Berabere");
                            kacKez--;
                        }
                        break;

                    default:
                        System.out.println("Yalnış değer girdiğiniz için bu el sayılmamaktadır. 1-3 arasında değer girmelisiniz.");
                        i--;
                        // Kullanıcı yanlış değer girdiği için, o el sayılmamış olacak.
                        // Bu yüzden i'nin artmasını engelleriz ve i. el tekrardan oynanır.
                        break;
                }
                System.out.println("Skorlar\nKullanıcı Skoru:"+kullaniciSkor+"\nBilgisayar Skoru:"+bilgisayarSkor);
            }

            if (kullaniciSkor>bilgisayarSkor){
                System.out.println("OYUNUN GALİBİ: ***KULLANICI***");
            }
            else if (kullaniciSkor<bilgisayarSkor) {
                System.out.println("OYUNUN GALİBİ: ***BİLGİSAYAR***");
            }
            else {
                System.out.println("***OYUN BERABERE BİTTİ, DOSTLUK KAZANDI***");
            }

        }
        else {
            System.out.println("Yanlış değer girdiniz.");
        }
    }
}
