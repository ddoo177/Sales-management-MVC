package QLBH_MVC.Repository;

import QLBH_MVC.Entity.Vegetable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VegetableRepository extends CrudRepository<Vegetable, Integer> {

    @Query(value = "select * from `vegetable` where CategoryID = ?1", nativeQuery = true)
    Iterable<Vegetable> findByCategory(int id);

    @Query(value = "SELECT * FROM `vegetable` WHERE Vegetable_Name LIKE %:key%", nativeQuery = true)
    Iterable<Vegetable> findByNameContaining(@Param("key") String key);

    @Query(value = "SELECT * FROM `vegetable` ORDER BY Sold DESC LIMIT 5", nativeQuery = true)
    Iterable<Vegetable> findTop5BySold();
}


