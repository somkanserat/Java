package calismam_FutbolTakimiInheritanceVariable;

public class Fenerbahce extends FutbolTakimlari{

    String takimBaskani="Ali Koç";
    String teknikDirektor="Jose M.";
    int oynananMacSayisi=55;

    public static void main(String[] args) {

        Fenerbahce fb = new Fenerbahce();
        System.out.println("Bulunduğu Lig:"+fb.lig);
        System.out.println("Lig Başkanı:"+fb.ligBaskani);
        System.out.println("Ligte oynanılan maç sayısı:"+fb.oynananMacSayisi);
        System.out.println("Takım Başkanı:"+fb.takimBaskani);
        System.out.println("Takım Teknik Direktörü:"+fb.teknikDirektor);


    }
}
