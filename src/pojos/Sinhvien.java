package pojos;
// Generated 12-Jun-2020 18:52:38 by Hibernate Tools 4.3.1



/**
 * Sinhvien generated by hbm2java
 */
public class Sinhvien  implements java.io.Serializable {


     private String mssv;
     private String hoten;
     private String gioitinh;
     private String cmnd;
     private String lop;

    public Sinhvien() {
    }

	
    public Sinhvien(String mssv) {
        this.mssv = mssv;
    }
    public Sinhvien(String mssv, String hoten, String gioitinh, String cmnd, String lop) {
       this.mssv = mssv;
       this.hoten = hoten;
       this.gioitinh = gioitinh;
       this.cmnd = cmnd;
       this.lop = lop;
    }
   
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getGioitinh() {
        return this.gioitinh;
    }
    
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getCmnd() {
        return this.cmnd;
    }
    
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public String getLop() {
        return this.lop;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }




}


