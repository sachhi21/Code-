package com.example.Restaurant.Module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="orders")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    private String orderNumber;
    @ManyToOne
    @JoinColumn(name = "rest_id")
    private Resturant restaurants;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public void setRestaurants(Resturant restaurant) {
        this.restaurants = restaurant;
        if (!restaurant.getOrders().contains(this)) {
            restaurant.getOrders().add(this);
        }
    }

    public void setUser(User user) {
        this.user = user;
        if (!user.getOrders().contains(this)) {
            user.getOrders().add(this);
        }
    }
}


   /* @Override
    public String toString() {
        return "Order{" +
                "id=" + order_id +
                ", orderNumber='" + orderNumber + '\'' +
                ", restaurant=" + (restaurants != null ? restaurants.getRest_name() : null) +
                ", user=" + (user != null ? user.getUser_name() : null) +

                '}';
    }*/



