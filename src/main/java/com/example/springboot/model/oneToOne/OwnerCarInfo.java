package com.example.springboot.model.oneToOne;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@SqlResultSetMapping(
        name = "OwnerCarInfoMapping",
        classes = @ConstructorResult(
                targetClass = OwnerCarInfo.class,
                columns = {
                        @ColumnResult(name = "firstName", type = String.class),
                        @ColumnResult(name = "brand", type = String.class)
                }
        )
)

public class OwnerCarInfo {

    private String firstName;
    private String brand;
    @Id
    private Long id;


    public  OwnerCarInfo(String firstName, String brand) {
        this.firstName = firstName;
        this.brand = brand;

    }

    public OwnerCarInfo() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
