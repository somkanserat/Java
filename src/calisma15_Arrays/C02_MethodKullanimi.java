package calisma15_Arrays;

import calisma14_Scope_arrays.C07_TumElementleriArtirma;

import java.util.Arrays;

public class C02_MethodKullanimi {

    // Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
    // kullanildigini yazdiran bir method olusturun.

    public static void main(String[] args) {

        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"a");
        // Aradiginiz harf, array'de 5 kere kullanilmis

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"f");
        // Aradiginiz harf, array'de 1 kere kullanilmis


        System.out.println("------------------------------");


        int[] kullaniciArr = C03_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArr));

        //kullanıcıdan alarak oluşturulan int[]'in elemanlarını 5 arttırıp yazdırın

        kullaniciArr = C07_TumElementleriArtirma.arrayinElementleriniArtir(kullaniciArr,5);//day14_C07
        System.out.println("5'er sayi da bizden:"+Arrays.toString(kullaniciArr));

        System.out.println("------------------------------");

        //kullanıcıdan değerler alarak bir String array oluşturun

        String[] isimler = C03_KullaniciyaArrayOlusturma.stringArrayOlustur();
        System.out.println(Arrays.toString(isimler));

        //bu String array'deki en kısa ve en uzun metinleri yazdırın

        C04_EnUzunEnKisaKelime.enKisaVeEnUzunYazdir(isimler);


    }
}
