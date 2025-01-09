package calismam_TasKagitMakas;

import java.util.Random;
import java.util.Scanner;

public class S01_tasKgitMakasdoWhileIle {

        public static void main(String[] args) { // 'void' yerine 'static void' eklenmeli
            Scanner scan = new Scanner(System.in);
            Random random = new Random();

            int kacKez;

            // Pozitif bir sayı alıncaya kadar döngü
            do {
                System.out.print("Taş-Kağıt-Makas oyununun kaç kez oynanacağını seçin (pozitif bir değer girin): ");
                kacKez = scan.nextInt();

                // Kullanıcının girdiği sayının pozitif olup olmadığını kontrol et
                if (kacKez <= 0) {
                    System.out.println("Yanlış değer girdiniz. Lütfen pozitif bir değer girin.");
                }

            } while (kacKez <= 0); // Pozitif bir sayı girilene kadar döngüyü devam ettir

            int kullaniciSkor = 0;
            int bilgisayarSkor = 0;

            for (int i = 0; i < kacKez; i++) {
                System.out.print("1: Taş\n2: Kağıt\n3: Makas\nTaş-Kağıt-Makas'tan bir tanesini seçin: ");
                int kullaniciSecimi = scan.nextInt();
                int bilgisayarSecimi = random.nextInt(3) + 1; // 1-3 arası

                switch (kullaniciSecimi) {
                    case 1:
                        if (bilgisayarSecimi == 1) {
                            System.out.println("İki tarafta Taş'ı seçti. Berabere");
                        } else if (bilgisayarSecimi == 2) {
                            System.out.println("Kullanıcı Taş'ı seçti. Bilgisayar Kağıt'ı seçti. Bilgisayar kazandı");
                            bilgisayarSkor++;
                        } else {
                            System.out.println("Kullanıcı Taş'ı seçti. Bilgisayar Makas'ı seçti. Kullanıcı kazandı.");
                            kullaniciSkor++;
                        }
                        break;

                    case 2:
                        if (bilgisayarSecimi == 1) {
                            System.out.println("Kullanıcı Kağıt'ı seçti. Bilgisayar Taş'ı seçti. Kullanıcı kazandı");
                            kullaniciSkor++;
                        } else if (bilgisayarSecimi == 2) {
                            System.out.println("İki tarafta Kağıt'ı seçti. Berabere");
                        } else {
                            System.out.println("Kullanıcı Kağıt'ı seçti. Bilgisayar Makas'ı seçti. Bilgisayar kazandı.");
                            bilgisayarSkor++;
                        }
                        break;

                    case 3:
                        if (bilgisayarSecimi == 1) {
                            System.out.println("Kullanıcı Makas'ı seçti. Bilgisayar Taş'ı seçti. Bilgisayar kazandı");
                            bilgisayarSkor++;
                        } else if (bilgisayarSecimi == 2) {
                            System.out.println("Kullanıcı Makas'ı seçti. Bilgisayar Kağıt'ı seçti. Kullanıcı kazandı.");
                            kullaniciSkor++;
                        } else {
                            System.out.println("İki tarafta Makas'ı seçti. Berabere");
                        }
                        break;

                    default:
                        System.out.println("Yanlış değer girdiğiniz için bu el sayılmamaktadır. 1-3 arasında değer girmelisiniz.");
                        i--; // Hatalı giriş için el sayısını azalt
                        break;
                }
                System.out.println("Skorlar\nKullanıcı Skoru: " + kullaniciSkor + "\nBilgisayar Skoru: " + bilgisayarSkor);
            }

            // Oyun sonucunu yazdır
            if (kullaniciSkor > bilgisayarSkor) {
                System.out.println("OYUNUN GALİBİ: ***KULLANICI***");
            } else if (kullaniciSkor < bilgisayarSkor) {
                System.out.println("OYUNUN GALİBİ: ***BİLGİSAYAR***");
            } else {
                System.out.println("***OYUN BERABERE BİTTİ, DOSTLUK KAZANDI***");
            }

            scan.close(); // Kaynakları kapatmayı unutmayın
        }


}
