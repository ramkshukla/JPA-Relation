package com.example.springboot.UserRelation.service.repository.oneToOne.bidirectional;

import com.example.springboot.UserRelation.service.entity.oneToOne.bidirectional.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
