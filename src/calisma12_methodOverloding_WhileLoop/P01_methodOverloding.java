package calisma12_methodOverloding_WhileLoop;

public class P01_methodOverloding {

    public static void main(String[] args) {

        /*
            Bir class içinde aynı isme sahip fakat farklı signature'a sahip methodlar yer alabilir. Bu duruma
            methodOverloding denir.
            Java'da bir method çalıştırıldığında eğer aynı isimli başka bir method  varsa
            Java argumentlerin uyumuna bakar.
            Uyum %100 olan varsa onu çalıştırır, yoksa en az casting yapacağı kısmı çalıştırır.
            Casting yaparak çalıştıracağı yoksa hata verir
            Eğer method call ile çalıştırdığımız methoda uygun bir method yoksa
            CTE verir ve kod çalışmaz
         */

        topla(3,7); //ctrl+shift+numpad7, ctrl+d
        topla(185,325);

        topla(3,2.1);

        topla(2.59,125.3);

    }

    public  static int topla(int sayi1,int sayi2){
        System.out.println(sayi1*sayi2);
        return (sayi1*sayi2);
    }

    public static double topla(int sayi1, double sayi2){
        System.out.println(sayi1*sayi2);
        return (sayi1*sayi2);
    }
    public static double topla(double sayi1, double sayi2) {
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }
}
