package com.sda.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "consult")
public class Consult {
    private String veterinarian;
    private String pet;
    private Date date;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Consult(String veterinarian, String pet, Date date, String description) {
        this.veterinarian = veterinarian;
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public String getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(String veterinarian) {
        this.veterinarian = veterinarian;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
