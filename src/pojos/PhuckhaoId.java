package pojos;
// Generated 20-Jun-2020 22:28:32 by Hibernate Tools 4.3.1



/**
 * PhuckhaoId generated by hbm2java
 */
public class PhuckhaoId  implements java.io.Serializable {


     private String mssv;
     private String mamon;

    public PhuckhaoId() {
    }

    public PhuckhaoId(String mssv, String mamon) {
       this.mssv = mssv;
       this.mamon = mamon;
    }
   
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public String getMamon() {
        return this.mamon;
    }
    
    public void setMamon(String mamon) {
        this.mamon = mamon;
    }




}


