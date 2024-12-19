package calisma14_Scope_arrays;

public class C01_Hastane {

    static String hastaneIsmi = "Yıldız Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String basHekim = "Doktor Ali";

    String perIsmi ="İsim Atanmadı.";
    String perAdresi = "Adres Atanmadı.";
    String perTel = "Tel No. Atanmadı.";

    public static void main(String[] args) {

        System.out.println(hastaneAdresi); //Yeni Mahalle

        C01_Hastane per1 = new C01_Hastane(); //obje
        per1.perIsmi = "Yelda";
        per1.perAdresi = "Sincan";
        per1.perTel = "544 429 06 94";

        System.out.println(per1.basHekim); //Doktor Ali
        /*
            static variable'lar, class içinde her yerden Direkt kullanılabilir.
            Eğer static variable'lara oble üzerinden kullanmak isterseniz, Java buna da itiraz etmez.
            sadece static variable'a niye instance muamelesi yapıyorsun diye SARARTIR.
         */

        C01_Hastane per2 = new C01_Hastane(); //obje
        per2.perIsmi = "Oğuzhan";
        per2.perAdresi = "Çankaya";

        per2.hastaneAdresi = "Cankaya"; //Hastane adresini değiştirdik.

        //per2'nin yaptığı atamalar, per1'i etkiler mi?

        System.out.println(per1.perIsmi); //Yelda
        System.out.println(per1.hastaneAdresi);//Cankaya

        C01_Hastane per3= new C01_Hastane();
        per3.perIsmi="Esra";
        per3.hastaneAdresi = "Mamak";
        per3.basHekim = "Dr İpek";

        /*
            per2'ün yaptığı atamalardan, kişisel olanlar (instance veriables)
            diğer personeli etkilemez.
            ANCAK ortak olanlar (static variables) tüm personeli etkiler.
         */

        System.out.println(per1.basHekim);  //Dr İpek
        System.out.println(per2.basHekim);  //Dr İpek
        System.out.println(per3.basHekim);  //Dr İpek

        System.out.println(per1.perIsmi); //Yelda
        System.out.println(per2.perIsmi); //Oğuzhan
        System.out.println(per3.perIsmi); //Esra
        //static variable değişirse, herkes için değişir. AMMA instance variable
        //kişiyi etkiler.

        //static variable'ların AVANTAJI, erişim kolaylığıdır.

    }

}
