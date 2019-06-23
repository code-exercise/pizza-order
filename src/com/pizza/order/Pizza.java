package com.pizza.order;


import java.util.List;

public interface Pizza {

    void addToppings(final List<ToppingType> toppingTypes);
    double getPrice();
    Size getSize();
    
}
