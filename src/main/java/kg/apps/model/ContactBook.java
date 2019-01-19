package kg.apps.model;

import javax.persistence.*;

@Entity
public class ContactBook {

    @Id
    @Column(name = "ContactBookId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactBookId;

    @OneToOne
    @JoinColumn(name = "UserId")
    private Users user;



//TODO: ConstructorContactBook


    public ContactBook(Users user) {
        this.user = user;
    }

    //Getters and Setters
    public long getContactBookId() {
        return contactBookId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
