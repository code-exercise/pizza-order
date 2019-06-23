package com.pizza.order;

import java.util.List;

public class NonVegPizzaSmall extends NonVegPizza{

    private double price = 150.0;

    @Override
    public void addToppings(List<ToppingType> toppingTypes) {

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Size getSize() {
        return null;
    }


}
