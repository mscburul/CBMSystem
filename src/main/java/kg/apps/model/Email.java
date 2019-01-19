package kg.apps.model;



import javax.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmailId")
    private long emailId;

    @Column(name = "Email",nullable = false)
    private String email;


    //Foreign Key

    @ManyToOne
    @JoinColumn(name = "ContactId")
    private Contact contact;


    //TODO: ConstructorEmail

    public Email(String email, Contact contact) {
        this.email = email;
        this.contact=contact;
    }


    //Getter and Setters

    public long getEmailId() {
        return emailId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contactemail) {
        this.contact = contactemail;
    }
}
