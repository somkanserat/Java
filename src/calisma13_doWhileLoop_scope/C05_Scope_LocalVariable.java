package calisma13_doWhileLoop_scope;

public class C05_Scope_LocalVariable {

    public static void main(String[] args) {

        String str = "Java candir.";

        //sayi=6;

        for (int i=0; i<5; i++){
            System.out.println(i+ " ");
            String isim = "Ali Can";
        }

        //System.out.println(i);

        //System.out.println(isim);
    }

    public static void method(){

        //System.out.println(str);

        int sayi = 0;
    }
}
