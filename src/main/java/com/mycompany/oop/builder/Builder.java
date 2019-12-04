package com.mycompany.oop.builder;

class Pizza {

    void setDough(String dough)     {
    }
    void setSauce(String sauce)     {
    }
    void setTopping(String topping) {
    }
}


/** "Abstrakcyjny budowniczy" */
abstract class PizzaBuilder {
    Pizza pizza;

    Pizza getPizza()
    {
        return pizza;
    }

    void createNewPizzaProduct()
    {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}

/** "Konkretny budowniczy" */
class HawaiianPizzaBuilder extends PizzaBuilder
{
    public void buildDough()   { pizza.setDough("cross"); }
    public void buildSauce()   { pizza.setSauce("mild"); }
    public void buildTopping() { pizza.setTopping("ham+pineapple"); }
}

/** "Konkretny budowniczy" */
class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough()   { pizza.setDough("pan baked"); }
    public void buildSauce()   { pizza.setSauce("hot"); }
    public void buildTopping() { pizza.setTopping("pepperoni+salami"); }
}


/** "Nadzorca" */
class Waiter {
    private PizzaBuilder pizzaBuilder;

    void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
    Pizza getPizza() { return pizzaBuilder.getPizza(); }

    void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}


/** Klient zamawiający pizzę. */
class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        SpicyPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}