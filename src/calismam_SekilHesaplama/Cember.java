package calismam_SekilHesaplama;

public class Cember extends Sekil {


    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "Cemberin yarıçapı:" +yaricap +
                "\nÇemberin alanı:" +cemberAlanHesaplama(yaricap) +
                "\nÇemberin Çevresi:" +cemberCevreHesaplama(yaricap);
    }
}
