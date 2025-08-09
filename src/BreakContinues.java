public class BreakContinues {
    public static void main(String[] args) {
        //break
        var counter = 1;
        while (true){
            System.out.println("Perulangan ke-" + counter);
            counter++;
            if (counter > 10){
                break;
            }
        }
        //continue
        for (var counter2 =1; counter2 <= 100 ;counter2++ ){
            if(counter2 % 2 == 0){
                continue;
            }
            System.out.println("Perulangan angka ganjil " + counter2);
        }
    }
}
