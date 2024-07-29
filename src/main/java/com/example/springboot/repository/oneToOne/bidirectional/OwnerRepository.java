package com.example.springboot.repository.oneToOne.bidirectional;

import com.example.springboot.entity.oneToOne.bidirectional.Owner;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
//    @Query(value = "SELECT owner.first_name, car.brand from owner inner join car on owner.car_id=car.id", nativeQuery = true)
//    @Query(value = "SELECT o.first_name AS firstName, c.brand AS brand " +
//        "FROM owner o " +
//        "INNER JOIN car c ON o.car_id = c.id", nativeQuery = true)
//    List<OwnerCarInfo> findAllCars();


//    @Query("SELECT new com.example.springboot.model.oneToOne.OwnerCarInfo(o.firstName, c.brand) " +
//            "FROM Owner o INNER JOIN o.car c")
//    List<Tuple> findAllCarsTuple();
}
