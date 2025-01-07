package calismam_FutbolTakimiInheritanceVariable;

public class Galatasaray extends FutbolTakimlari{

    String takimBaskani="Dursun Özbek";
    String teknikDirektor="Okan B.";
    int oynananMacSayisi=60;

    public static void main(String[] args) {

        Galatasaray gs = new Galatasaray();
        System.out.println("Bulunduğu Lig:"+gs.lig);
        System.out.println("Lig Başkanı:"+gs.ligBaskani);
        System.out.println("Ligte oynanılan maç sayısı:"+gs.oynananMacSayisi);
        System.out.println("Takım Başkanı:"+gs.takimBaskani);
        System.out.println("Takım Teknik Direktörü:"+gs.teknikDirektor);
    }


}
