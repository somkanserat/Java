package calisma15_Arrays;

public class C01_ElemanArama {

    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac
        // kere kullanildigini yazdirın

        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        String arananHarf = "z";
        int sayac=0;

        for (int i=0; i< harfler.length; i++){

            if ( harfler[i].equals(arananHarf) ){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("Aradığınız harf, array'de kullanılmamıştır.");
        }
        else {
            System.out.println("Aradığınız harf, array'de "+sayac+" kez kullanılmış.");
        }

    }

    // Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
    // kullanildigini yazdiran bir method olusturun.

    public static void arraydekiArananElemaninSayisiniYazdir(String[] harfler, String arananHarf){

        int sayac=0;

        for (int i=0; i< harfler.length; i++){

            if ( harfler[i].equals(arananHarf) ){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("Aradığınız harf, array'de kullanılmamıştır.");
        }
        else {
            System.out.println("Aradığınız harf, array'de "+sayac+" kez kullanılmış.");
        }
    }
}
