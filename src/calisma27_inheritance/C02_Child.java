package calisma27_inheritance;

/*
    Java bir variable'in degerini bulmak icin
     - once bulundugu scope'a bakar
     - scope'da yoksa class level'a bakar
     - class level'da da yoksa parent class(lar)'a bakar
     ve ilk buldugu degeri (en guncel degeri) kullanir

     this. ve super. kullanildi ise
     Java aramaya baslama noktasini degistirir
     this. denilmisse aramaya class level'dan,
     super. denilmisse aramaya parent class'dan baslar
     ve ilk buldugunu kullanir

     Java aramaya basladiktan sonra hep yukari dogru cikar
     bulursa kullanir bulamazsa CTE verir (geriye donuk arama yapmaz)
 */

public class C02_Child extends C01_Parent{
    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";
    public static void main(String[] args) {
        C02_Child obj = new C02_Child();
        obj.method1();
    }

    public void method1(){
        String str = "Child class method";
        String t = "Cansu";
        String z = "Oguzhan";

        System.out.println(s);      // Anil --> method1() scope içerisinde s tanımlı değil, C02_Child Class levelinde tanımlı değil fakat C01_Parent Class levelinde tanımlı
        System.out.println(this.s); // Anil --> C02_Child Class Level'inde tanımlı değil, fakat C01_Parent Class Level'inde tanımlı s olduğu için
        System.out.println(super.s);// Anil --> C01_Parent Class Level'inde tanımlı s olduğu için

        System.out.println(k);         // Ahmet  --> method1() içerisinde k tanımlı değil fakat C02_Child Class levelinde tanımlı olduğu için
        System.out.println(this.k);    // Ahmet  --> C02_Child Class Level'inde tanımlı k olduğu için
        //System.out.println(super.k); // CTE    --> C01_Parent Class Level'inde tanımlı k olmadığı için

        System.out.println(z);        // Oguzhan  --> method1() içerisinde z tanımlı olduğu için
        //System.out.println(this.z); // CTE      --> C02_Child Class Level'inde ve C01_Parent Class Level'inde tanımlı z olmadığı için
        //System.out.println(super.z);// CTE      --> C01_Parent Class Level'inde tanımlı z olmadığı için

        System.out.println(t);        // Cansu  --> method1() içerisinde t tanımlı olduğu için
        System.out.println(this.t);   // Hamza  --> C02_Child Class Level'inde tanımlı t olduğu için
        //System.out.println(super.t);// CTE    --> C01_Parent Class Level'inde tanımlı t olmadığı için

        System.out.println(str); // Child class method
        System.out.println(this.str); // Child class
        System.out.println(super.str); // Java candir C01_Parent içerisinde tanımlı str olduğu için

    }
}
