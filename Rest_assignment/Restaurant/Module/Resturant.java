package com.example.Restaurant.Module;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="restaurants")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Resturant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rest_id;

    private  String rest_name;


    @OneToMany(mappedBy = "restaurants")
    private List<Order> orders;



}



