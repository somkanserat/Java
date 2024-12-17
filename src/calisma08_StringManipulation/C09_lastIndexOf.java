package calisma08_StringManipulation;

public class C09_lastIndexOf {

    public static void main(String[] args) {

        /*

        lastIndexOf methodu, indexOf metoduna benzer fakat bu method sondan itibaren aranan değerin nerede olduğuna bakar.
        Sondan başa doğru arar fakat bulunca hangi indexte olduğunu baştan sayarak söyler.

         */
                    //0123456789012345678901
        String str = "Benim çok çalışmam lazım çok";

        System.out.println(str.indexOf("çok"));  //6
        System.out.println(str.lastIndexOf("çok")); //25

        //çok kelimesi kaç kez kullanılmış
        int a=str.indexOf("çok");
        int b=str.lastIndexOf("çok");

        if(a==b){
            System.out.println("çok kelimesi 1 kere kullanılmış.");
        }
        else {
            System.out.println("çok kelimesi 1'den fazla kullanılmış.");
        }
    }
}
