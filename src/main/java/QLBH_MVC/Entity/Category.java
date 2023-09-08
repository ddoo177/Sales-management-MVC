package QLBH_MVC.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "Category")
@Table(name = "category")
public class Category {

    @Id
    private Integer CategoryID;

    private String Category_Name;

    private String Description;
}
