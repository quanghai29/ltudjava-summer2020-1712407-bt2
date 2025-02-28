package pojos;
// Generated 20-Jun-2020 22:28:32 by Hibernate Tools 4.3.1

/**
 * Phuckhao generated by hbm2java
 */
public class Phuckhao implements java.io.Serializable {

    private PhuckhaoId id;
    private String hoten;
    private String cotdiem;
    private Float diemmongmuon;
    private String lydo;
    private Integer tinhtrang;

    public Phuckhao() {
    }

    public Phuckhao(PhuckhaoId id) {
        this.id = id;
    }

    public Phuckhao(PhuckhaoId id, String hoten, String cotdiem, Float diemmongmuon, String lydo, int tinhtrang) {
        this.id = id;
        this.hoten = hoten;
        this.cotdiem = cotdiem;
        this.diemmongmuon = diemmongmuon;
        this.lydo = lydo;
        this.tinhtrang = tinhtrang;
    }

    public PhuckhaoId getId() {
        return this.id;
    }

    public void setId(PhuckhaoId id) {
        this.id = id;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getCotdiem() {
        return this.cotdiem;
    }

    public void setCotdiem(String cotdiem) {
        this.cotdiem = cotdiem;
    }

    public Float getDiemmongmuon() {
        return this.diemmongmuon;
    }

    public void setDiemmongmuon(Float diemmongmuon) {
        this.diemmongmuon = diemmongmuon;
    }

    public String getLydo() {
        return this.lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    public Integer getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(Integer tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
}
