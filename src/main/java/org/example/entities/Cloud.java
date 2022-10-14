package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

import javax.persistence.*;
        import java.io.Serializable;

@Entity
@Table(name = "cloud")
public class Cloud implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCloud;
    private String brand;
    private String name;
    private Integer year;
    private String description;
    private Integer categoria;

    @ManyToOne
    @JoinColumn(name= "categoryId")
    @JsonIgnoreProperties("cloud")
    private Category category;
    public Integer getIdCloud() {
        return idCloud;
    }

    public void setIdCloud(Integer idCloud) {
        this.idCloud = idCloud;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}