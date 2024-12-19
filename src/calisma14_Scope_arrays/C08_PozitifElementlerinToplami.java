package calisma14_Scope_arrays;

public class C08_PozitifElementlerinToplami {

    public static void main(String[] args) {

        //VErilen bir array'deki pozitif tam sayıların toplamını yazdırın

        int [] arr = {-4,-6,7,2,5,-1,0};

        int toplam=0;

        for (int i=0; i<arr.length; i++){
            if( arr[i] >0){
                toplam+=arr[i];
            }
        }
        System.out.println("Pozitif elementlerin toplamı:"+toplam);

        System.out.println(pozitifElementlerinToplaminiDondur(arr));

    }

    //Verilen bir array'deki pozitif tam sayıları toplayıp,
    //sonucu bize döndüren bir method yazınız.

    public static int pozitifElementlerinToplaminiDondur(int[] arr){

        int toplam = 0;

        for (int i=0; i<arr.length; i++){
            if( arr[i] >0){
                toplam+=arr[i];
            }
        }
        return toplam;

    }
}




