package learnSingleton;

//Very important points:
//Singleton class: we're allowed to create one instance of a class at a time
//Using private constructor we can ensure that no more than one object can be created at a time
//Singleton concept with the work default construct only

public class LearnSingleton {

    public LearnSingleton() {
        LearnSingleton object1 = new LearnSingleton();


    }

    public static void main(String[] args) {
        LearnSingleton object = new LearnSingleton();

    }
}
