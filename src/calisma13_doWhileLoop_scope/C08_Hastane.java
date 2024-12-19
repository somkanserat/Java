package calisma13_doWhileLoop_scope;

public class C08_Hastane {

    static String hastaneIsmi = "Yıldız Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String basHekim = "Doktor Ali";

    String perIsmi ="İsim Atanmadı.";
    String perAdresi = "Adres Atanmadı.";
    String perTel = "Tel No. Atanmadı.";

    public static void main(String[] args) {

        C08_Hastane per1 = new C08_Hastane();

        System.out.println(per1.perIsmi);   //İsim Atanmadı.
        System.out.println(per1.perAdresi); //Adres Atanmadı.
        System.out.println(per1.perTel);    //Tel No. Atanmadı.

        per1.perIsmi = "Hamza";
        per1.perTel = "544 345 45 45";
        per1.perAdresi = "Balgat";
        System.out.println(per1.perIsmi);
        System.out.println(per1.perTel);
        System.out.println(per1.perAdresi);
        System.out.println(hastaneAdresi);


        C08_Hastane per2 = new C08_Hastane();

        System.out.println(per2.perIsmi);   //İsim Atanmadı.
        System.out.println(per2.perTel);    //Tel No. Atanmadı.
        System.out.println(per2.perAdresi); //Adres Atanmadı.

        per2.perIsmi = "Cansu";
        per2.perTel = "543 891 43 12";
        per2.perAdresi = "Kızılay";
        System.out.println(per2.perIsmi);
        System.out.println(per2.perTel);
        System.out.println(per2.perAdresi);
        System.out.println(hastaneAdresi);

        C08_Hastane per3 = new C08_Hastane();

        System.out.println(per3.perIsmi);   //İsim Atanmadı.
        System.out.println(per3.perTel);    //Tel No. Atanmadı.
        System.out.println(per3.perAdresi); //Adres Atanmadı.

        per3.perIsmi = "Sezen";
        per3.perTel = "543 432 06 ";
        per3.perAdresi = "Mamak";
        System.out.println(per3.perIsmi);
        System.out.println(per3.perTel);
        System.out.println(per3.perAdresi);
    }
}
