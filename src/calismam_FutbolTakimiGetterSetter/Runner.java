package calismam_FutbolTakimiGetterSetter;

public class Runner {

    public static void main(String[] args) {

        Takim takimim = new Takim();
        System.out.println(takimim.getTakimIsmi());
        takimim.setTakimYili(2000);

        Stadyum stadyum = new Stadyum();
        System.out.println(takimim.getTakimIsmi());
        stadyum.setStadyumKapasitesi(60000);
    }

}
