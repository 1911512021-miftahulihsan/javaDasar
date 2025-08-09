public class ForEach {
    public static void main(String[] args) {
        //tanpa foreach
        String[] namanama = {"ihsan, ", "nufus, ", "miftahul, ", "hayatun"};
        for (int i = 0; i < namanama.length; i++){
            var nama =  namanama[i];
            System.out.print(nama);
        }
        System.out.println();
        //with foreach
        String[] names = {"ihsan, ", "nufus, ", "miftahul, ", "hayatun"};
        for (var name : names){
            System.out.printf(name);
        }





    }
}
