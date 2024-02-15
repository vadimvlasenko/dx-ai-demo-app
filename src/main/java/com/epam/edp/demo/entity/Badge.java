package com.epam.edp.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "badges")
public class Badge {

    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    // Getters and setters omitted for brevity. Implement them as needed.
}