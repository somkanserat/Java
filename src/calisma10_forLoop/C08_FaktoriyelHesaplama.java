package calisma10_forLoop;

import java.util.Scanner;

public class C08_FaktoriyelHesaplama {

    public static void main(String[] args) {

        //Kullanıcıdan 14'ten küçük bir sayı alıp,
        //bu sayının faktöriyel değerini hesaplayın.
        //5! = 5*4*3*2*1

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı değeri girin:");
        int sayi= input.nextInt();
        int faktoriyel=1;
        for (int i=1; i<=sayi; i++){
             faktoriyel *=i;
        }
        System.out.println(sayi+" sayısının faktöriyeli:"+faktoriyel);

    }
}
