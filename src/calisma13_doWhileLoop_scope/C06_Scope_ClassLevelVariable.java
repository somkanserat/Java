package calisma13_doWhileLoop_scope;

public class C06_Scope_ClassLevelVariable {
    /*
        1- Class level'da olusturulan variable'larin scope'u tum class'dir
           yani tum class'dan kullanilabilirler

        2- Class level'da olusturulan variable'lar icin java 2 alternatif sunar
            - static variable : deklarasyonunda static keyword kullanilan variable'lar
            - instance variable : deklarasyonunda static keyword kullanilmayan variable'lar

        3- ANCAK class level variable'larin kullanim seklinde static keyword'u de etkilidir
            - eger variable static ise heryerden direkt olarak kullanilabilir
            - variable instance ise ( static degil ), secim hakki method'a gecer
                * static method'lar sinirlarindan iceri static olmayan hicbir sey girmesine
                  izin vermezler
                * method da static degilse
         4- Local variable'lar deger atanmadan deklare edilebilir
            AMA deger atanmadan kullanilamaz

            Class level variable'lar DEGER ATANMADAN DA kullanilabilir
            Biz deger atamamissak Java Class level variable'lar icin
            belirlemis oldugu default degerleri atama yapar
            non-primitive'ler icin ==> null
            sayisal primitive'ler  ==> 0
            boolean                ==> false
            char                   ==> hiclik
     */

    public String str = "java candir";
    static String isim;
    static int sayi1 = 10;
    public int numara;
    public boolean emekliMi=true;
    public static boolean aktifMi;
    public static char ilkHarf='A';
    static char karakter;


    public static void main(String[] args) {
        System.out.println(isim);       //null
        System.out.println(sayi1);      //10
        System.out.println(aktifMi);    //false
        System.out.println(ilkHarf);   // A
        System.out.println(karakter);   //
        //System.out.println(str);
        //System.out.println(numara);
        //System.out.println(emekliMi);

        method1();
        //method2();
    }

    static void method1(){
        System.out.println(isim);   //null
        System.out.println(sayi1);  //10
        System.out.println(aktifMi);//false
        System.out.println(karakter);//

        //System.out.println(str); // Non-static field 'str' cannot be referenced from a static context
        //System.out.println(numara); // static olmayan 'numara' static bir method'dan kullanilamaz
        //System.out.println(emekliMi);

        //method2();
    }

    public void method2(){
        System.out.println(isim);
        System.out.println(sayi1);
        System.out.println(aktifMi);
        System.out.println(karakter);

        System.out.println(str);    //str static değil,method2 de static değil.
        System.out.println(numara);
        System.out.println(emekliMi);

        method1();
    }
}
