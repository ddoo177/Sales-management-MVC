//package QLBH_MVC.Entity;
//
//import jakarta.persistence.*;
//import java.util.Date;
//import lombok.*;
//
//@Data
//@Entity(name = "Order")
//@Table(name = "Order")
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer OrderID;
//
//    @ManyToOne
//    @JoinColumn(name = "CustomerID")
//    private Customer CustomerID;
//
//    private Date Date;
//    
//    private Float Total;
//
//    private String Note;
//}
