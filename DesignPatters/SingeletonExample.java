package DesignPatters;

class Singeleton {
    // Eager Initialization
    private static Singeleton instance = new Singeleton();

    // Lazy Initialization
    //private static Singeleton instance;

    private Singeleton() {
        System.out.println("Singeleton class created");
    }
    public static Singeleton getInstance() {
        if (instance == null) {
            System.out.println("Creating Singeleton instance");
            instance = new Singeleton();
        }
        System.out.println("Fetching Singeleton instance");
        return instance;
    }
}

public class SingeletonExample {
    public static void main(String[] args) {
        Singeleton singeleton1 = Singeleton.getInstance();
        Singeleton singeleton2 = Singeleton.getInstance();
        System.out.println("Both instances are same?" + (singeleton1 == singeleton2));
    }
}
