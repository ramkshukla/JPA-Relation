package com.example.springboot.UserRelation.service.model.oneToOne.bidirectional;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@SqlResultSetMapping(
        name = "OwnerCarInfoMapping",
        classes = @ConstructorResult(
                targetClass = OwnerCarDTO.class,
                columns = {
                        @ColumnResult(name = "firstName", type = String.class),
                        @ColumnResult(name = "brand", type = String.class)
                }
        )
)
public class OwnerCarDTO {
    @Id
    private Long id;
    private String firstName;
    private String brand;

    public OwnerCarDTO(String firstName, String brand) {
        this.firstName = firstName;
        this.brand = brand;
    }

    public OwnerCarDTO() {}

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
