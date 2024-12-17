package calisma09_stringManipulation;

public class C02_NullPointer {

    public static void main(String[] args) {

        String isim1;

        //System.out.println(isim1);
        //Bir mwtot içinde oluşturulan String variable'lara değer atamadan kullanamayız.
        String isim2 = "Ali";
        String isim3 = "";
        String isim4 = "Buse Sena";
        //isim3'e hiçlik değeri atanmıştır.

        //EGER bir variable'a değer atamadan variable'i listeleyebilmek istersek
        //o variable'i null olarak isaretleyebiliriz.

        String isim5 = null;
        System.out.println(isim5); //null

        //NOT: null olarak işaretlene variable'lar YAZDIRILABİLİR.
        //ama başka metotlarla kullanılamaz

        System.out.println(isim2.length()); //3
        System.out.println(isim3.length()); //0
        //System.out.println(isim5.length()); //NullPointerException

        System.out.println("5.Öğrenci:"+isim5); // 5.öğrenci:null

    }
}
