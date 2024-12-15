package calisma01_veriableOlusturmaVeKullanma;

public class C04_DikkatEdilecekler {

    public static void main(String[] args) {

        // 1 - Deklarasyon 1 kere olur, değer ataması istrediğimiz kadar yapılabilir.

        int sayi =30;

        // int sayi=40; //Variable "sayi" is already defined in the scope

        // double sayi=34.6 //Variable "sayi" is already defined in the scope

        sayi = 45;

        sayi = sayi + 4;

        sayi = sayi * 5;

        // 2 - esitliğin sol tarafında SADECE variable ismi olur. Başka bir şey kullanılmasına java izin vermez.

        // 50 = sayi; //Variable expected

        //sayi * 2 = sayi + 10; //Variable expected

        int sayi1 = 34;

        //sayi +sayi1 = 45;  //Variable expected

        // 3 - Javada kullanılan = işareti matematikteki = işareti gibi eşitliği kontrol etmez.
        //görevi assingment(atama)'dır. Java önce ='in sağındaki değeri hesaplar.
        //Bulduğu değeri soldaki variable(değer)'a ATAMA yapar.

    }
}
