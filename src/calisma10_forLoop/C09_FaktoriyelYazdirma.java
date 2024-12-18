package calisma10_forLoop;

import java.util.Scanner;

public class C09_FaktoriyelYazdirma {

    public static void main(String[] args) {

        //Kullanıcıdan 18'den küçük sayı alın ve faktöriyel değerini hesaplayın.
        //hesabı yapılsa da konsola hesabının yapılmasını yazdırın.
        //Orn: 6!=5*4*3*2*1

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı değeri girin:");
        int sayi= input.nextInt();
        int faktoriyel=1;

        System.out.print(sayi+"!=");
        for (int i=sayi; i>=1; i--){

            if (i > 1){
                System.out.print(i + "*");
            } else {
                System.out.print(i);
            }

            faktoriyel*=i;
        }
        System.out.println("="+faktoriyel);


    }
}
