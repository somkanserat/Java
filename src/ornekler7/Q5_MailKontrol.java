package ornekler7;

import java.util.Scanner;

public class Q5_MailKontrol {

     /*45-----
    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir mail adresi giriniz:");
        String mail = scan.nextLine();

        if (mail.contains("@") && mail.substring(mail.indexOf("@")).contains(".com")){
            System.out.println("Mail adresi başarı ile girilmiştir.");
        }
        else {
            System.out.println("Girilen mail adresi kabul edilmemiştir.");
        }
    }
}
