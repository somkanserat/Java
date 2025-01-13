package ornekler7;

public class Q10_IDYazdirma {

    /*50-----
    Youtube video sayfasının urlsinde yer alan video id'sini
    return eden bir method yazınız :

     ÖRNEKLER
    youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
    ID : XPEr1cArWRg

    youtubeId("https://youtu.be/BCDEDi5gDPo")
    ID : BCDEDi5gDPo

    youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
    ID : vxP3bY-XxY4
    */

    public static void main(String[] args) {

        String youtubeID = "https://www.youtube.com/watch?v=XPEr1cArWRg";

        System.out.println(urlDondurme(youtubeID));
    }

    public static String urlDondurme(String youtubeID){

        int esittirSembolu = youtubeID.lastIndexOf('=');
        String ID = youtubeID.substring(esittirSembolu+1);
        return ID;
    }
}
