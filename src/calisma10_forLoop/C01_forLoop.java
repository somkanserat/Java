package calisma10_forLoop;

public class C01_forLoop {

    public static void main(String[] args) {

        //1'den 10'a kadar yazdır.
        for (int i=1; i<10; i++){
            System.out.print(i);
        }
        //i:loop boyunca kullanmak istediğimiz degerleri kullanmamıza izin veren geçici variable sadece loop içerisinde
        //geçerlidir, loop dışında kullanılamaz.
        //System.out.println(i);

        //i<10 boolean şart, şart true olduğu müddetçe loop çalışmaya decam eder. false ise biter.
    }
}
