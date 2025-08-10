public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Miftahul", "Ihsan");
    }
    static void sayHelloWorld() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
    }
    static  void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
