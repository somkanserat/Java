package calismam_FutbolcuArama_Map;

public class Runner {

    public static void main(String[] args) {

        FutbolcuBilgileri.isimdenFormaNoYazdir("Maxim"); // Maxim'in forma numarası:28

        System.out.println();
        FutbolcuBilgileri.ayniMevkidekiOyunculariYazdirma("OS");
        //OS'de yer alan futbolcular:
        //Amrabat
        //Szymanski

        System.out.println();
        FutbolcuBilgileri.ayniMevkidekiOyunculariYazdirma("KNT");
        //KNT'de yer alan futbolcular:
        //Maxim
        //Tadic

        System.out.println();
        FutbolcuBilgileri.numaraAraligindakiFutbolcular(15,65);
        //15 ve 65 forma numaraları arasındaki futbolcular:
        //34 Amrabat
        //21 Osayi
        //53 Szymanski

        System.out.println();
        //FutbolcuMapDepo.kullaniciyaFutbolcuEkletme();

        FutbolcuBilgileri.formaNoIleFutbolcuUpdate(10,"ALex","OS","45");
    }
}
