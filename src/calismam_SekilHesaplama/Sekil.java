package calismam_SekilHesaplama;

public class Sekil {
    /*
            Cember, dikdortgen ve kare sekillerinin alan ve cevre hesaplamasi yapan bir uygulama gelistiriniz.
            1-asagidaki hiyarasiye gore classlar creat ediniz...
            Sekil class(parent) <--Cember class(child)
            Sekil class(parent) <--Dikdortgen class(child)<--Kare class(child)
            2- Classlara uygun olacak sekilde yaricap, uzunluk ve genislik veriable'ler ekleyiniz.
            3- Cember Dikdortgen Karenin alan ve cevre hesaplamalarini yaptirip sonuclari Runner classta yazdiriniz.

        */

    double yaricap;
    double uzunKenar;
    double kisaKenar;

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }


    double cemberAlanHesaplama(double yaricap){

        return 3.14*(yaricap*yaricap);
    }

    double cemberCevreHesaplama(double yaricap){

        return 2*3.14*yaricap;
    }

    double dikdortgenAlanHesaplama(double kisaKenar, double uzunKenar){

        return uzunKenar*kisaKenar;
    }

    double dikdortgenCevreHesaplama(double kisaKenar, double uzunKenar){

        return 2*(uzunKenar+kisaKenar);
    }
}
