package calisma24_stringBuilder_accessModifier.p2;

import calisma24_stringBuilder_accessModifier.p1.Datalar;

public class FarkliPackageChildClass extends Datalar {

    public static void main(String[] args) {

        // System.out.println(Datalar.sayiPrivate);
        // Datalar.methodPrivate();

        // System.out.println(Datalar.strDefault);
        // Datalar.methodDefault();

        System.out.println(Datalar.chrProtected); //buna ulaşmak için yukarıda *extends Datalar* yaptık
        Datalar.methodProtected();

        System.out.println(Datalar.doublePublic);
        Datalar.methodPublic();
    }
}
