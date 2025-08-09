public class tesswitch {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Wow Selamat Nilai Anda Memuaskan");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }
        switch (nilai){
            case "A" -> System.out.println("Wow Selamatek Nilai Anda Memuaskan");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> System.out.println("Anda salah jurusan");
        }
        var ucapan = switch (nilai){
            case "A" :
                yield "wow selamat nilai anda memuaskan 3";
            case  "B", "C" :
                yield "Nilai anda cukup baik 3";
            case "D":
                yield "Anda tidak lulus 3";
            default :
                yield "Anda salah jurusan 3";
        };
        System.out.println(ucapan);
    }
}
