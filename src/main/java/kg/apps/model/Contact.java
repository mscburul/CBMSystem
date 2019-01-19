package kg.apps.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONTACT")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContactID")
    private long contactID;
    private String name;
    private String surname;
    private String nickname;
    private String company;
    private Date birthdate;


//Foreign Key
    @ManyToOne
    @JoinColumn(name = "ContactBookId")
    private ContactBook contactBook;


    //TODO: ConstructorContact


    public Contact() {

    }

    public Contact(String name, String surname, String nickname, String company, Date birthdate, ContactBook contactBook) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.company = company;
        this.birthdate = birthdate;
        this.contactBook = contactBook;
    }


//Getters and Setters

    public long getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public ContactBook getContactBook() {
        return contactBook;
    }

    public void setContactBook(ContactBook contactBook) {
        this.contactBook = contactBook;
    }
}
