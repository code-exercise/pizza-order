package com.pizza.order;

public abstract class NonVegPizza implements Pizza{

    public PizzaType getType() {
        return PizzaType.NONVEG;
    }
}
