package com.example.university_pizzery.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "size")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 25)
    private String name;

    @Column(name = "diameter_cm", nullable = false)
    private Integer diameterCm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiameterCm() {
        return diameterCm;
    }

    public void setDiameterCm(Integer diameterCm) {
        this.diameterCm = diameterCm;
    }
}
