package kg.apps.model;

import javax.persistence.*;

@Entity
public class MobileType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="TypeId")
    private long mobileTypeId;

    @Column(nullable = false,name = "Type")
    private String mobileType;


    //TODO: Constructor
    public MobileType(String mobileType) {
        this.mobileType = mobileType;
    }


    //Getters and Setters
    public long getMobileTypeId() {
        return mobileTypeId;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String type) {
        this.mobileType = type;
    }
}
