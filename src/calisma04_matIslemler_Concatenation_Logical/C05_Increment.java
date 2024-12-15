package calisma04_matIslemler_Concatenation_Logical;

public class C05_Increment {

    public static void main(String[] args) {

        int sayi=20;
        System.out.println("sayi = " + sayi); //20

        /*
        sayi = sayi+3;
        System.out.println("sayi = " + sayi); //23
        */

        sayi+=3; //sayının değerini 3 arttır ve yeni değer olarak ata.
        System.out.println("sayi = " + sayi);

        int ogrenciNo = 2025001;
        System.out.println("1.Öğrenci: " + ogrenciNo++); //2025001
        System.out.println("2.Öğrenci: " + ogrenciNo++); //2025002
        System.out.println("3.Öğrenci: " + ogrenciNo++); //2025003
        System.out.println("4.Öğrenci: " + ogrenciNo++); //2025004
        System.out.println(ogrenciNo); //2025005

        int kitapNo1 = 2025001;
        System.out.println("1.Öğrenci: " +kitapNo1); //2025001
        System.out.println("2.Öğrenci: " + ++kitapNo1); //2025002
        System.out.println("3.Öğrenci: " + ++kitapNo1); //2025003
        System.out.println("4.Öğrenci: " + ++kitapNo1); //2025004
        System.out.println(++kitapNo1); //2025005

        int dersNo = 2025000;
        System.out.println("1.Öğrenci: " +(dersNo+=5)); //2025005
        System.out.println("2.Öğrenci: " +(dersNo+=5)); //2025010
        System.out.println("3.Öğrenci: " +(dersNo+=5)); //2025015
        System.out.println("4.Öğrenci: " +(dersNo+=5)); //2025020

        int a=50;
        a*=3;
        System.out.println("a = " + a); //150
        a/=5;
        System.out.println("a = " + a); //30

        double c=23.12;
        c-=5;
        System.out.println("c = " + c); //18.12

        int d=23;
        d-=5.22;
        System.out.println("d = " + d); //17, int olduğu için, tam sayı yazdı





    }
}
