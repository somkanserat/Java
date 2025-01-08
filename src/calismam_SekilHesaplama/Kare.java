package calismam_SekilHesaplama;

public class Kare extends Dikdortgen{

    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Karenin kenar uzunluğu:"+uzunKenar+
                "\nKarenin Çevresi:"+dikdortgenCevreHesaplama(uzunKenar,kisaKenar)+
                "\nKarenin Alanı:"+dikdortgenAlanHesaplama(uzunKenar,kisaKenar);
    }
}
