package calisma14_Scope_arrays;

public class C02_Scope {

    public static void main(String[] args) {

        /*
            static variable'ların AVANTAJI, erişim kolaylığıdır.
            - Class içerisinden her yerden direkt ulaşılabilir.
            - Başka class'lardan da ClassIsmi.staticVariableIsmi şeklinde kolayca ulaşılabilir.

            static variable'ların EN BÜYÜK DEZAVANTAJI; ulaşan herkesin DEĞİŞTİREBİLMESİDİR.
         */

        System.out.println(C01_Hastane.hastaneIsmi);    //Yıldız Hastanesi
        System.out.println(C01_Hastane.basHekim);       //Doktor Ali
        System.out.println(C01_Hastane.hastaneAdresi);  //Yeni Mahalle
        //C01_Hastane class'ına git ve hastaneIsmi'ne,basHekim'e ve hastaneAdresi'ne bak ve yazdır.

        C01_Hastane.basHekim = "Dr Oğuzhan";
        System.out.println(C01_Hastane.basHekim); //Dr Oğuzhan
    }
}
