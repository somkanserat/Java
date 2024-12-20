package calisma15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullaniciyaArrayOlusturma {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve
        // bize donduren programı yazın

        Scanner input = new Scanner(System.in);

        System.out.print("Array'e eklenilecek eleman sayısını giriniz:");
        int arrlenght = input.nextInt();

        int[] sayilar = new int[arrlenght];

        for (int i=0; i<arrlenght;i++){

            System.out.print("Array'e eklenilecek bir tamsayı giriniz:");
            sayilar[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sayilar));
    }

    // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve
    // bize donduren bir method olusturun.

    public static int[] arrayOlustur(){

        Scanner input = new Scanner(System.in);

        System.out.print("Array'e eklenilecek eleman sayısını giriniz:");
        int arrlenght = input.nextInt();

        int[] sayilar = new int[arrlenght];

        for (int i=0; i<arrlenght;i++){

            System.out.print("Array'e eklenilecek bir tamsayı giriniz:");
            sayilar[i] = input.nextInt();
        }
        return sayilar;
    }

    public static String[] stringArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Array'e konulacak eleman sayisini giriniz:");
        int arrLength = scanner.nextInt();

        String[] metinler = new String[arrLength];
        scanner.nextLine(); //int'ten sonra string geçerken 2 kez yazdırdığı için bu hatayı engellemek için bunu yazdık

        for (int i = 0; i <arrLength ; i++) {

            System.out.println("Array'e konulacak bir metin giriniz");

            metinler[i] = scanner.nextLine();

        }

        return metinler;
    }

}
