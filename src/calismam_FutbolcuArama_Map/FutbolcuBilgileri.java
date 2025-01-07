package calismam_FutbolcuArama_Map;

import java.util.*;

public class FutbolcuBilgileri {

    protected static Map<Integer,String> futbolcu = new HashMap<>();

    static {

        futbolcu.put(1,"Livakovic-GK-31");
        futbolcu.put(21,"Osayi-SB-27");
        futbolcu.put(10,"Tadic-KNT-36");
        futbolcu.put(53,"Szymanski-OS-26");
        futbolcu.put(97,"Maxim-KNT-28");
        futbolcu.put(34,"Amrabat-OS-28");
        futbolcu.put(9,"Dzeko-FW-39");
    }

    public static void isimdenFormaNoYazdir(String istenenIsim){

        Collection<String> info = futbolcu.values();

        System.out.println("İsmi "+istenenIsim+" olan futbolcu");

        for (String eachInfo : info){

            String[] infoArr = eachInfo.split("-");

            if (infoArr[0].equals(istenenIsim)){
                System.out.println(istenenIsim+"'in forma numarası:"+infoArr[2]);
            }
        }
    }

    public static void ayniMevkidekiOyunculariYazdirma(String istenenMevki){

        System.out.println(istenenMevki+"'de yer alan futbolcular:");

        Collection<String> value = futbolcu.values();

        for (String eachValue : value){

            String[] valueArr = eachValue.split("-"); // "[Amrabat, OS, 28]

            if (istenenMevki.equalsIgnoreCase(valueArr[1])){

                System.out.println(valueArr[0]);
            }

        }

    }

    public static void numaraAraligindakiFutbolcular(int basFormaNo, int btsFormaNo){

        System.out.println(basFormaNo+" ve "+btsFormaNo+" forma numaraları arasındaki futbolcular:");
        Set<Integer> formaNo = futbolcu.keySet();

        for (Integer eachFormaNo: formaNo){

            if (eachFormaNo>=basFormaNo && eachFormaNo<=btsFormaNo){

                String futbolcular = futbolcu.get(eachFormaNo);

                String[] futbolcularArr = futbolcular.split("-");

                System.out.println(eachFormaNo+" "+futbolcularArr[0]);
            }
        }
    }

    public static void kullaniciyaFutbolcuEkletme(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Futbolcunun forma no'sunu giriniz:");
        int formaNo = scan.nextInt();

        String value ="";
        scan.nextLine();

        System.out.print("Futbolcunun ismini giriniz:");
        value+= scan.nextLine();
        value+="-";

        System.out.print("Futbolcunun mevkisini giriniz:");
        value+= scan.nextLine().toUpperCase();
        value+="-";

        System.out.print("Futbolcunun yaşını giriniz:");
        value+= scan.nextLine();

        futbolcu.put(formaNo,value);
        System.out.println(futbolcu);
    }

    public static void formaNoIleFutbolcuUpdate(int formaNo, String yeniIsim, String yeniMevki,String yeniYas){

        String eskiValue = futbolcu.get(10); //Tadic-KNT-36

        String[] eskiValueArr = eskiValue.split("-"); //[Tadic, KNT, 36]

        eskiValueArr[0]=yeniIsim;
        eskiValueArr[1]=yeniMevki;
        eskiValueArr[2]=yeniYas;

        //[Alex, OS, 45]

        String yeniValue = String.join("-",eskiValueArr); //Alex-OS-45

        futbolcu.put(formaNo,yeniValue);
        System.out.println(futbolcu);
    }
}
