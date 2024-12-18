package calisma11_NestedForLoop_MethoduOlusturma;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        /*
            Tek seferde asagidaki tabloyu yazdirin

            2 3 4 5
            3 4 5 6
            4 5 6 7
            5 6 7 8
        */

        for (int i=1; i<=4; i++){   //satırlar

            for (int j=1; j<=4; j++){ //her satırdaki sütunlar
                System.out.print(i+j+" ");
            }
            System.out.println("");
        }



    }
}
