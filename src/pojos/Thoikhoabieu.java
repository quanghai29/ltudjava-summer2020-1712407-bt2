package pojos;
// Generated 12-Jun-2020 18:52:38 by Hibernate Tools 4.3.1



/**
 * Thoikhoabieu generated by hbm2java
 */
public class Thoikhoabieu  implements java.io.Serializable {


     private ThoikhoabieuId id;
     private String tenmon;
     private String phonghoc;

    public Thoikhoabieu() {
    }

	
    public Thoikhoabieu(ThoikhoabieuId id) {
        this.id = id;
    }
    public Thoikhoabieu(ThoikhoabieuId id, String tenmon, String phonghoc) {
       this.id = id;
       this.tenmon = tenmon;
       this.phonghoc = phonghoc;
    }
   
    public ThoikhoabieuId getId() {
        return this.id;
    }
    
    public void setId(ThoikhoabieuId id) {
        this.id = id;
    }
    public String getTenmon() {
        return this.tenmon;
    }
    
    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }
    public String getPhonghoc() {
        return this.phonghoc;
    }
    
    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }




}


