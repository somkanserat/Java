package calismam_SekilHesaplama;

public class Dikdortgen extends Sekil{

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Uzun Kenar:"+uzunKenar+
                "\nKısa Kenar:"+kisaKenar+
                "\nDikdörtgenin Alanı:"+dikdortgenAlanHesaplama(uzunKenar,kisaKenar)+
                "\nDildörtgen Çevresi:"+dikdortgenCevreHesaplama(uzunKenar,kisaKenar);
    }
}
