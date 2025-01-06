package calisma34_maps;

public class Runner {

    public static void main(String[] args) {

        MapDepo.isimdenListeYazdir("Ali");
        System.out.println();

        MapDepo.isimdenListeYazdir("veli");
        System.out.println();

        MapDepo.sinifSubeListesiYazdir(11,"M");
        System.out.println();

        MapDepo.soyisimdenListeYazdir("can");
        System.out.println();

        MapDepo.bolumListesiYazdir("MF");
        System.out.println();

        MapDepo.numaraAraligindakiOgrenciListesi(104,106);
        System.out.println();

        MapDepo.numaraIleSoyisimUpdate(102,"Mutlu");
        MapDepo.numaraIleSoyisimUpdate(103,"Sen");
        System.out.println();

        MapDepo.bolumGuncelle("MF","Say");

    }
}
