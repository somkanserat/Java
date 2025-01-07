package calismam_FutbolTakimiConstructorCall;

public class Runner {

    public static void main(String[] args) {

        System.out.println("****TAKIM BİLGİLERİ****");
        Takim takim = new Takim("Fenerbahçe","Boğa","Sarı Lacivert",1907);
        System.out.println(takim);

        System.out.println("\n");

        System.out.println("****STAT BİLGİLERİ****");
        Stadyum stadyum = new Stadyum("Şükrü Saraçoğlu","Sarı","Suni",55000);
        System.out.println(stadyum);
    }
}
