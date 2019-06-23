package com.pizza.order;

import java.util.List;

public class VegPizzaSmall extends VegPizza{

    private double price = 100.0;

    @Override
    public void addToppings(final List<ToppingType> toppingTypes) {

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
