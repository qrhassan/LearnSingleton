package learnSingleton;

public class TestSingleton {

    public static void main(String[] args) {
        LearnSingleton test = new LearnSingleton();

        Pizza myPizza = new Pizza( "Four Seasons");
        Pizza hisPizza = new Pizza("PineApple", 25.50);

        myPizza.pizzaName="Four Seasons";
    }
}
