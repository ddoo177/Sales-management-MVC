package QLBH_MVC.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "Vegetable")
@Table(name = "vegetable")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer VegetableID;

    private Integer CategoryID;

    private String Vegetable_Name;

    private String Unit;

    private Integer Amount;

    private String Image;

    private Double Price;

    private Integer Sold;

}
