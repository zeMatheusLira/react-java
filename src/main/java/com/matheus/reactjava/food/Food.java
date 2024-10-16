package com.matheus.reactjava.food;

import jakarta.persistence.*;

@Table(name="food")
@Entity(name="foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private String price;
}
