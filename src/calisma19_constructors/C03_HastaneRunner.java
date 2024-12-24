package calisma19_constructors;

public class C03_HastaneRunner {

    public static void main(String[] args) {

        C02_Hastane per1 = new C02_Hastane();

        System.out.println(per1.perIsim);
        System.out.println(per1.perAdres);
        System.out.println(per1.perTel);

        C02_Hastane per2;  //Constructor olmadığı için, obje oluşturulmadı.

        /*
            System.out.println(per2.perIsmı);  //hata verir.
            System.out.println(per2.perAdres); //hata verir.
            System.out.println(per2.perTelNo); //hata verir.
        */

        System.out.println(new C02_Hastane().perIsim);

        String adres = new C02_Hastane().perAdres;

    }
}
