package DesignPatters;

// Singleton class
class SingletonClass {
    // Static variable to hold the single instance of the class
    // Using 'volatile' to ensure visibility of changes to 'instance' across threads
    private static volatile SingletonClass instance;

    // Private constructor to prevent instantiation from outside
    private SingletonClass() {
        // Guard clause to prevent reflection-based instantiation
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
        System.out.println("Singleton instance created");
    }

    // Method to maintain singleton property during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    // Prevent cloning of the singleton instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot be cloned");
    }

    // Static method to get the single instance of the class
    public static SingletonClass getInstance() {
        // First check for existing instance without synchronization for performance
        if (instance == null) {
            // Synchronize on the class to ensure thread safety during instantiation
            synchronized (Singleton.class) {
                // Double-checked locking to avoid unnecessary synchronization
                if (instance == null) {
                    System.out.println("Creating first instance");
                    instance = new SingletonClass();
                }
            }
        }
        System.out.println("Fetching instance");
        return instance;
    }
}

// Main class to test the Singleton pattern
public class SingletonPatternExample2 {
    public static void main(String[] args) {
        // Get the only object available (first call will create the instance)
        SingletonClass singleton1 = SingletonClass.getInstance(); // Output: Creating first instance, Singleton instance created

        // Get the instance again (will not create a new instance)
        SingletonClass singleton2 = SingletonClass.getInstance(); // Output: Fetching instance

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (singleton1 == singleton2)); // Output: Are both instances the same? true
    }
}
