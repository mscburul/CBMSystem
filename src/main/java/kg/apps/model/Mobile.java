package kg.apps.model;

import javax.persistence.*;

@Entity
@Table(name = "Mobile")
public class Mobile {
    @Id
    @Column(name = "MobileID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mobileID;

    @Column(name = "PhoneNumber" ,nullable = false)
    private String phoneNumber;

//Foreign Keys
    @ManyToOne
    @JoinColumn(name = "ContactId")
    private Contact contactMobile;

    @ManyToOne
    @JoinColumn(name = "MobileTypeId")
    private MobileType mobileType;

//TODO: ConstructorMobile


    public Mobile() {
    }

    public Mobile(String phoneNumber, Contact contactMobile, MobileType mobileType) {
        this.phoneNumber = phoneNumber;
        this.contactMobile = contactMobile;
        this.mobileType = mobileType;
    }


    //Getters and Setters


    public long getMobileID() {
        return mobileID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(Contact contactMobile) {
        this.contactMobile = contactMobile;
    }

    public MobileType getMobileType() {
        return mobileType;
    }

    public void setMobileType(MobileType mobileType) {
        this.mobileType = mobileType;
    }
}
