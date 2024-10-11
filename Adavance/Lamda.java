public class Lamda {
    // No Parameter Lambda Expression
    /*
     * This is what the interface looks like
     */
    interface Hello {
        public void sayHello();
    }

    public static Hello helperFunction() {
        // Your code here
        // Implement sayHello using lambda expression and return the object.
        // Write this in the lambda expression: System.out.println("Hello")
        return () -> System.out.println("Hello");

    }
}
