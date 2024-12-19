package calisma13_doWhileLoop_scope;

public class C07_Scope_ClassLevelVariables {

    /*
        static olmayan bir variable'i, static method'dan
        direkt kullanılamaz

        Class level'da oluşturulan variable'ların scope'u tum class'dır.
        yani her yerden kullanılabilir olmalı

        AMA direkt kullanılabilir olması, static keyword'e bağlıdır.
        -static variable'lar her yerde direkt kullanılabilir.
        -instance variable'lar(statick olmayan variable'lar),static olmayan methodlardan
         direkt kullanılabilir ama static method'lardan direkt KULLANILAMAZ, obje olusturup kullanmamiz gerekir

     */
    public String str = "java candir";
    static String isim;
    static int sayi1 = 10;
    public int numara;
    public boolean emekliMi = true;
    public static boolean aktifMi ;
    public static char ilkHarf ='A';
    static char karakter;

    public static void main(String[] args) {

        System.out.println(isim); // null
        System.out.println(sayi1); // 10
        System.out.println(aktifMi); // false
        System.out.println(ilkHarf); // A
        System.out.println(karakter); // hiclik

        C07_Scope_ClassLevelVariables obj = new C07_Scope_ClassLevelVariables();

        System.out.println(obj.emekliMi); // true
        System.out.println(obj.str); // java candir
        System.out.println(obj.numara); // 0
    }
}
