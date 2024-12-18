package calisma11_NestedForLoop_MethoduOlusturma;

public class C07_Odev {

    public static void main(String[] args) {

        /*
        aşağıdaki şekli çizdiren programı yazın

            1
           1 2
          1 2 3
         1 2 3 4

        */


        for (int i=1;i<=4; i++){

            for (int k=3;k>=i;k--){
                System.out.print(" ");
            }

            for (int j=1; j<=i;j++){

                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}
