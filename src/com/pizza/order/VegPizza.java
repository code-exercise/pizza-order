package com.pizza.order;

public abstract class VegPizza implements Pizza{

    public PizzaType getType() {
        return PizzaType.VEG;
    }
}
