package calisma10_forLoop;

public class C03_forLoop {

    public static void main(String[] args) {

        //765'den başlayıp, 543'e kadar 13 ile bölünebilen sayıları yazdır.

        for (int i=765; i>=543; i--){
            if (i%13==0){
                System.out.print(i+" ");
            }
        }


        //623'ten başlayarak 441'e kadar 9'ar azaltarak tüm sayıları yazdırın
        /*
        for (int i=623; i>=441; i-=9){
            System.out.print(i+" ");
        }

         */
    }
}
