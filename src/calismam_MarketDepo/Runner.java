package calismam_MarketDepo;

import java.util.*;

public class Runner extends MarketNestedMapDepo{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        //System.out.println(urunMap);
        /*
            {
                1={Ürün Stok Miktarı=10, Ürün Fiyatı=30, Ürün İsmi=Çikolata},
                2={Ürün Stok Miktarı=40, Ürün Fiyatı=50, Ürün İsmi=Un},
                3={Ürün Stok Miktarı=45, Ürün Fiyatı=60, Ürün İsmi=Kola}
            }
         */

        //stokEklemeCikarma();

        girisEkrani();
    }

    public static void girisEkrani() throws InterruptedException {

        System.out.println("******        SOMKAN MARKET SİSTEM GİRİŞ SAYFASI        ******\n\n");

        String kayitliKullaniciAdi = "admin";
        String kayitliSifre = "sifre1234";
        int sifreDenemeSayisi = 3;

        System.out.println("SİSTEME GİRİŞ YAPMAK İÇİN LÜTFEN KULLANICI ADI VE ŞİFREYİ GİRİNİZ\n");

        while (sifreDenemeSayisi>0){

            System.out.print("KULLANICI ADI:");
            String kullaniciAdi = scan.nextLine();
            System.out.print("ŞİFRE:");
            String kullaniciSifre = scan.nextLine();

            if (kayitliKullaniciAdi.equals(kullaniciAdi) && kayitliSifre.equals(kullaniciSifre)){

                System.out.println("SİSTEME GİRİŞ YAPILIYOR...");
                Thread.sleep(3000);
                menu();
            }
            else {

                sifreDenemeSayisi--;
                System.out.println("Kullanıcı adı veya şifre geçersizdir."+sifreDenemeSayisi+" deneme hakkınız kalmıştır.");
            }
        }
        if (sifreDenemeSayisi==0){

            System.out.println("*****   SİSTEM KİLİTLENMİŞTİR!  *****");
        }
    }

    public static void menu(){

        System.out.println("\n**** SOMKAN MARKET DEPO BİLGİLERİ ****");

        System.out.print("\nYapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.Depodaki Tüm Ürünlerin Listesi\n"+
                "2.ID Numarasına Göre Ürün Bilgileri\n" +
                "3.ID Numarasına Göre Ürün Stok Sorgulama\n" +
                "4.Tüm Stok Görüntüle\n" +
                "5.Minimum Adet Sayısına Göre Ürün Stok Bilgileri\n" +
                "6.Stoklara Ekleme/Çıkarma Yapma\n" +
                "7.ID Numarasına Göre Ürün Bilgisi Güncelleme\n"+
                "8.Yeni Ürün Ekleme\n"+
                "9.CIKIS\n" +
                "Seciminiz:");

        int secim = scan.nextInt();

        switch (secim){

            case 1:
                tumUrunBilgileri();
                menu();
                break;
            case 2:
                idyeGoreUrunCagirma();
                menu();
                break;
            case 3:
                idyeGoreStokGosterme();
                menu();
                break;
            case 4:
                tumStokMiktari();
                menu();
                break;
            case 5:
                SinirlananStokAdediKontrol();
                menu();
                break;
            case 6:
                stokEklemeCikarma();
                menu();
                break;
            case 7:
                bilgiGuncelleme();
                menu();
                break;
            case 8:
                urunEkleme();
                menu();
                break;
            case 9:
                System.out.println("*** İyi Günler ***");
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Ana Menüye aktarılıyorsunuz...");
                menu();
                break;
        }


    }

    public static void tumUrunBilgileri(){

        System.out.println("****    Depodaki Tüm Ürünlerin Listesi     ****");

        for (int i=1; i<=urunMap.size();i++){

            System.out.println(
                    "Ürün "+i+": "+
                    urunMap.get(i)+"\n"
            );
        }
    }

    public static void idyeGoreUrunCagirma(){

        System.out.print("Ürün ID'si giriniz(Menüye dönmek için herhangi bir harfi tuşlayınız):");
        int ID = 0;

        try{
            ID = scan.nextInt();
            if (ID<= urunMap.size() && ID>=1){

                System.out.println("Marketteki "+ID+" numaralı barkodlu ürünün bilgileri:");
                System.out.println(urunMap.get(ID));
                //{Ürün Stok Miktarı=40, Ürün Fiyatı=50, Ürün İsmi=Un}
                menu();
            }
            else {
                System.out.println("Hatalı Tuşlama. Yeniden Deneyin...");
                idyeGoreUrunCagirma();
            }
        }
        catch (InputMismatchException e){

            System.out.println("Harf tuşladınız. Menüye aktarılıyorsunuz...");
            scan.next();
            menu();
        }
    }

    public static void idyeGoreStokGosterme(){

        System.out.print("Ürün ID'si giriniz(Menüye dönmek için herhangi bir harfi tuşlayınız):");
        int ID = 0;

        try{
            ID = scan.nextInt();

            if (ID<= urunMap.size() && ID>=1){
                System.out.println("Marketteki "+ID+" numaralı barkodlu ürünün stok bilgisi:");
                System.out.print(urunMap.get(ID).get("Ürün Stok Miktarı")); //10
                menu();
            }
            else {
                System.out.println("Hatalı Tuşlama. Yeniden Deneyin...");
                idyeGoreStokGosterme();
            }

        }
        catch (InputMismatchException e){
            System.out.println("Harf tuşladınız. Menüye aktarılıyorsunuz...");
            scan.next();
            menu();
        }


    }

    public static void tumStokMiktari(){

        System.out.println("Tüm Ürünlerin Stok Miktarı:");

        for (int i=1; i<=urunMap.size();i++){

            System.out.println(
                    urunMap.get(i).get("Ürün İsmi")+":"+
                     urunMap.get(i).get("Ürün Stok Miktarı"));
        }
        menu();
    }

    public static void SinirlananStokAdediKontrol(){

        System.out.print("Minimum adet sayısını giriniz(Menüye dönmek için herhangi bir harfi tuşlayınız):");
        int adet = 0;

        try{
            adet = scan.nextInt();

            System.out.println("Stok Miktarı "+adet+" üzeri olan ürünlerin ismi:");

            Set<Integer> IDno = urunMap.keySet();

            for (Integer tumIDno : IDno){

                int urunStokMiktari = Integer.parseInt(urunMap.get(tumIDno).get("Ürün Stok Miktarı"));

                if (urunStokMiktari>=adet){

                    System.out.println(
                            urunMap.get(tumIDno).get("Ürün İsmi")+":"+urunMap.get(tumIDno).get("Ürün Stok Miktarı")
                    );
                }
            }
            menu();
        }
        catch (InputMismatchException e){
            System.out.println("Harf tuşladınız. Menüye aktarılıyorsunuz...");
            scan.next();
            menu();
        }

    }

    public static void stokEklemeCikarma(){

        Scanner scan = new Scanner(System.in);

        System.out.println(urunMap);
        System.out.println("1:Ekleme\n2:Azaltma\nHangi işlemi yapmak istersiniz. Lütfen Tuşlama Yapınız(Menüye dönmek için herhangi bir harfi tuşlayınız):");
        int secim = 0;
        int adet;

        try {
            secim = scan.nextInt();
            if (secim == 1){
                System.out.print("Hangi ürüne ekleme yapmak istersin? ID no'ya göre tuşlama yapınız:");
                int ID = scan.nextInt();

                if (ID<= urunMap.size() && ID>=1){

                    System.out.print("Kaç adet eklemek istersin:");
                    adet = scan.nextInt();

                    urunMap.get(ID).put("Ürün Stok Miktarı",(Integer.parseInt(urunMap.get(ID).get("Ürün Stok Miktarı"))+adet)+"");

                    System.out.println(urunMap.get(ID).get("Ürün İsmi")+" ürününün güncel adedi:"+urunMap.get(ID).get("Ürün Stok Miktarı"));
                    menu();
                }
                else {

                    System.out.println("Yanlış tuşlama yaptınız. Başa Dönüyorsunuz...");
                    stokEklemeCikarma();
                }
            }

            else if (secim == 2){

                System.out.print("Hangi üründen azaltma yapmak istersin? ID no'ya göre tuşlama yapınız:");
                int ID = scan.nextInt();

                if (ID<= urunMap.size() && ID>=1){
                    System.out.print("Kaç adet azaltmak istersin:");
                    adet = scan.nextInt();

                    if (Integer.parseInt(urunMap.get(ID).get("Ürün Stok Miktarı")) >= adet){

                        urunMap.get(ID).put("Ürün Stok Miktarı",(Integer.parseInt(urunMap.get(ID).get("Ürün Stok Miktarı"))-adet)+"");

                        System.out.println(urunMap.get(ID).get("Ürün İsmi")+" ürününün güncel adedi:"+urunMap.get(ID).get("Ürün Stok Miktarı"));
                        menu();
                    }
                    else {
                        System.out.println("Azaltılacak adet sayısı, stok miktarını aşmaktadır. Başa döndürülüyorsunuz...");
                        stokEklemeCikarma();
                    }
                }
                else {

                    System.out.println("Yanlış tuşlama yaptınız. Başa Dönüyorsunuz...");
                    stokEklemeCikarma();
                }

            }
            else {
                System.out.println("Yanlış tuşlama yaptınız. Başa Dönüyorsunuz...");
                stokEklemeCikarma();
            }
        }

        catch (InputMismatchException e){
            System.out.println("Harf tuşladınız. Menüye aktarılıyorsunuz...");
            scan.next();
            menu();
        }
    }

    public static void bilgiGuncelleme(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Güncelleme Yapılacak Ürün ID'si Tuşlayınız(Menü için herhangi bir harf tuşlayınız):");
        int ID = 0;

        try {

            ID = scan.nextInt();
            switch (ID) {

                case 1:

                case 2:

                case 3:

                case 4:
                    System.out.print("1:Ürün İsmi\n2:Ürün Fiyatı\n3:Ürün Stok Miktarı\nGüncelleme Yapılacak Bilgiyi Tuşlayınız:");
                    int bilgi = scan.nextInt();
                    scan.nextLine();

                    switch (bilgi) {

                        case 1:
                            System.out.print("Yeni Ürün İsmi Giriniz:");
                            String yeniIsim = scan.nextLine();

                            urunMap.get(ID).put("Ürün İsmi", yeniIsim);
                            System.out.println(ID+" numaralı barkodlu ürünün güncel bilgileri:"+urunMap.get(ID));
                            bilgiGuncelleme();
                            break;
                        case 2:
                            System.out.print("Yeni Ürün Fiyatını Giriniz:");
                            String yeniFiyat = scan.nextLine();

                            urunMap.get(ID).put("Ürün Fiyatı", yeniFiyat);
                            System.out.println(ID+" numaralı barkodlu ürünün güncel bilgileri:"+urunMap.get(ID));
                            bilgiGuncelleme();
                            break;
                        case 3:
                            System.out.print("Yeni Ürün Stok Miktarını Giriniz:");
                            String yeniStokMiktari = scan.nextLine();

                            urunMap.get(ID).put("Ürün Fiyatı", yeniStokMiktari);
                            System.out.println(ID+" numaralı barkodlu ürünün güncel bilgileri:"+urunMap.get(ID));
                            bilgiGuncelleme();
                            break;
                        default:
                            System.out.println("Yanlış seçim yapıldı. Yeniden Deneyin...");
                            bilgiGuncelleme();
                            break;
                    }
                default:
                    System.out.println("Yanlış seçim yapıldı. Yeniden Deneyin...");
                    bilgiGuncelleme();
            }
        }
        catch (InputMismatchException e){

            System.out.println("Harf tuşladınız. Menüye aktarılıyorsunuz...");
            scan.next();
            menu();
        }
    }

    public static void urunEkleme(){

        Map<String,String> eklenecekUrun = new HashMap<>();


        //ürün ismi eklemesi
        System.out.println("Devam etmek için herhangi bir tuşa basınız");
        scan.nextLine();//Buffer temizliği için
        System.out.print("\nYeni Ürün ismini giriniz:");
        String yeniUrunIsmi = scan.nextLine();

        int isimKontrol = 0;

        for (Map<String, String> urunDetaylari : urunMap.values()){

            String isim =urunDetaylari.get("Ürün İsmi");

            if (isim.equalsIgnoreCase(yeniUrunIsmi)){
                isimKontrol++;
            }
        }
        if (isimKontrol == 0){
            eklenecekUrun.put("Ürün İsmi",yeniUrunIsmi);

            //ürün fiyatı ekleme
            System.out.print("\nYeni Ürün fiyatını giriniz:");
            String yeniUrunFiyati = scan.nextLine();
            eklenecekUrun.put("Ürün Fiyatı",yeniUrunFiyati);


            //ürün stok ekleme
            System.out.print("\nYeni Ürün stok miktarını giriniz:");
            String yeniUrunStokMiktari = scan.nextLine();
            eklenecekUrun.put("Ürün Stok Miktarı",yeniUrunStokMiktari);

            //ürün kodu eklemesi
            System.out.print("Yeni Ürün kodunu giriniz:");
            Integer yeniUrunKodu = scan.nextInt();

            Set<Integer> mevcutUrunKodu = urunMap.keySet(); //urun kodları Set olarak kaydedildi ve kontrol buradan sağlandı.
            int kodKontrol=0;

            for (int eachKod : mevcutUrunKodu){

                if (yeniUrunKodu.equals(eachKod)){
                    kodKontrol++;
                }
            }

            if (kodKontrol == 0){
                urunMap.put(yeniUrunKodu,eklenecekUrun);
                System.out.println(urunMap);
                System.out.println("Ürün başarıyla kaydedilmiştir.");
                menu();
            }
            else {
                System.out.println("Girilen ürün kodu mevcuttur. Yeniden İşlem Yapın...");
                urunEkleme();
            }

        }
        else {
            System.out.println("Girilen ürün ismi mevcuttur. Yeniden İşlem Yapmak İçin E, menü'ye dönmek için H harfine basınız");
            String secim = scan.nextLine();

            if (secim.equalsIgnoreCase("e")){
                urunEkleme();
            }
            else {
                menu();
            }
        }
    }
}
