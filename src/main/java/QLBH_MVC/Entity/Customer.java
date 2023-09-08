package QLBH_MVC.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Customers")
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer CustomerID;

    @Column(name="Fullname")
    private String Fullname;

    @Column(name="Email")
    private String Email;

    @Column(name="Password")
    private String Password;

    @Column(name="Address")
    private String Address;
    
    @Column(name="City")
    private String City;
}
