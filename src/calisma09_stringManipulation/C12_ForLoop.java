package calisma09_stringManipulation;

public class C12_ForLoop {

    public static void main(String[] args) {

        String str = "Java Candir";

        //str'in harflerini yazdırın
        /*
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        //...
        */

        //str'nin harflerini her satırda 1 harf olacak şekilde alt alta yazdırın

        int i;

        for(i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }



    }
}
