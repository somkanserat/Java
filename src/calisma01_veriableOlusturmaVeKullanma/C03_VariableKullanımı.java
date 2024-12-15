package calisma01_veriableOlusturmaVeKullanma;

public class C03_VariableKullanımı {

    public static void main(String[] args) {
        //kullanıcının hesap bakiyesini tutan bir variable oluşturun

        double bakiye = 0;

        System.out.println("Bakiye:" +bakiye +" TL");

        // Kullanıcının hesabını 100 tl artırın

        bakiye = bakiye + 100;

        System.out.println("Yeni Bakiye: " +bakiye + " TL");

        //Yeni bakiyeyi 3 katına çıkar

        bakiye = bakiye * 3;

        System.out.println("Yeni Bakiye:" +bakiye +" TL");

    }
}
