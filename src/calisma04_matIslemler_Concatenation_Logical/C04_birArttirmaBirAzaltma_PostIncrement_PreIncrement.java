package calisma04_matIslemler_Concatenation_Logical;

public class C04_birArttirmaBirAzaltma_PostIncrement_PreIncrement {

    public static void main(String[] args) {

        int a=30;
        int b=50;

        int x=40;
        int y=60;

        System.out.println("x = " + x++);
        System.out.println("x = " + x);

        System.out.println("y = " + ++y);
        System.out.println("y = " + y);

        /*
        a++; //a değerinin bir arttırılması(a=a+1)
        // önce a değerini alır, sonra bir arttırır. Bu olaya post-increment denir.
        System.out.println("a = " + a);

        ++a; //değeri arttır ve yeni değeri kullan. Bu olaya pre-increment denir.
        System.out.println("a = " + a);
        */

        //post-increment
        int c;
        c=a++; //önce a'yı kullandı ve atadı. daha sonra a değişkenini arttırdı.
        System.out.println("c = " + c); //30
        System.out.println("a = " + a); //31

        //pre-increment
        int d;
        d=++b; //önce b değerini arttırdık, sonra bu yeni değeri d değişkenine atadık
        System.out.println("d = " + d); //51
        System.out.println("b = " + b); //51

        int e=c--;
        System.out.println("e = " + e); //30
        System.out.println("c = " + c); //29

        int f=--d;
        System.out.println("f = " + f); //50
        System.out.println("d = " + d); //50
    }
}
