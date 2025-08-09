public class WhileLoopDoLoop {
    public static void main(String[] args) {
        var counter = 1;
        while (counter <=10){
            System.out.println("Perulangan While ke-" + counter);
            counter++;
        }

        var counter2 = 100;
        do {
            System.out.println("Perulangan Do While ke-" + counter2);
            counter2++;
        }while (counter2<=10);
        System.out.println(counter2);
    }
}
