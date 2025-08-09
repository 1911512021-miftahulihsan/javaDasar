public class Array {
    public static void main(String[] args) {
        String[] Nama = new String[2];
        Nama[0] = "Miftahul ";
        Nama[1] = "Ihsan";

        System.out.println("Nama: " + Nama[0]);
        System.out.println("Nama: " + Nama[1]);
        Nama[1] = "ihsanmt";
        System.out.println("Nama: " + Nama[0] + Nama[1]);

        String[] namaLengkapSekaligus = {
                "Miftahul", "Ihsan"
        };
        System.out.println("Nama Panggilan: " + namaLengkapSekaligus[1]);
        namaLengkapSekaligus[1] = null;
        System.out.println("Nama Panggilan: " + namaLengkapSekaligus[1]);
        System.out.println(namaLengkapSekaligus.length);

        // ini array di dalam  array (array 2 dimensi)
        String[][] kkBaru = {
                {"Miftahul", "Ihsan & "},
                {"Hayatun", "Nufus"}
        };
        System.out.print(kkBaru[0][1]);
        System.out.println(kkBaru[1][1]);
    }
}
