package pojos;
// Generated 13-Jun-2020 10:53:55 by Hibernate Tools 4.3.1



/**
 * DiemId generated by hbm2java
 */
public class DiemId  implements java.io.Serializable {


     private String mssv;
     private String malop;

    public DiemId() {
    }

    public DiemId(String mssv, String malop) {
       this.mssv = mssv;
       this.malop = malop;
    }
   
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public String getMalop() {
        return this.malop;
    }
    
    public void setMalop(String malop) {
        this.malop = malop;
    }




}


