package calismam_OgrenciBilgiSistemi;

public class Ogrenci {

    private int id;
    private String isim;
    private String soyisim;
    private String email;

    public Ogrenci(int id, String isim, String soyisim, String email){

        this.id=id;
        this.isim=isim;
        this.soyisim=soyisim;
        this.email=email;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
