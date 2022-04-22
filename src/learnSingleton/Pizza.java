package learnSingleton;

public class Pizza {
    String pizzaName;
    double pizzaPrice;

    //default private constructor:
    private Pizza() {

    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;

    }
    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;

    }
}
