public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Miftahul");
        sayHello(" " , "Ihsan");

    }
    static void  sayHello(){
        System.out.print("Hello ");
    }
    static void sayHello(String firstName){
        System.out.print(firstName);
    }
    static void sayHello(String spasi, String lastName){
        System.out.println(spasi + lastName);
    }


}
