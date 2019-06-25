package com.pizza.order;


import java.util.List;

public interface Pizza {

    void addToppings(final List<ToppingType> toppingTypes);
    void addBreadType(final BreadType breadType);
    double getPrice();
    Size getSize();
}
