public class MethodVariabelArgument {
    public static void main(String[] args) {
        sayCongrats("ihsan", 0);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total/ values.length;
        if (finalValue >=75){
            System.out.println("Congratulations! " + name);
        }else{
            System.out.println("Sorry, you're not enough " + name);
        }
    }
}
