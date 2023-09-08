//package QLBH_MVC.Entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Data
//@Entity(name = "OrderDetail")
//@Table(name = "OrderDetail")
//public class OrderDetail {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer OrderDetailID;
//    
//    @ManyToOne
//    @JoinColumn(name = "OrderID")
//    private Order OrderID;
//    
//    @ManyToOne
//    @JoinColumn(name = "VegetableID")
//    private Vegetable VegetableID;
//    
//    @Column(name = "Quantity")
//    private int Quantity;
//    
//    @Column(name = "Price")
//    private float Price;
//}
