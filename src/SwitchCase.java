public class SwitchCase {
    public static void main(String[] args) {
        var nilai = "A";
//Switch case biasa
        switch (nilai) {
            case "A":
                System.out.println("Wow Selamat Nilai Anda Memuaskan");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Anda Salah jurusan");
        }
//Switch Case Lamda
        switch (nilai){
            case "A" -> System.out.println("Wow Selamat Nilai Anda Memuaskan");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default ->{
                System.out.println("Anda Salah jurusan");
                System.out.println("belajar lebih keras");
            }
            }
            String ucapan;
            switch (nilai){
                case "A" -> ucapan = "Wow Selamat Nilai Anda Memuaskan";
                case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
                case "D" -> ucapan = "Anda Tidak Lulus";
                default -> {
                    ucapan = "Anda Salah jurusan";
                    ucapan = "belajar lebih keras";
                }
            }
            //Switch case pakai yield
            System.out.println(ucapan);
            ucapan = switch (nilai){
                case "A" :
                    yield "Wow Selamat Nilai Anda Memuaskan";
                case "B" , "C" :
                    yield "Nilai Anda Cukup Baik";
                case "D" :
                    yield "Anda Tidak Lulus";
                default:
                    yield "anda Salah jurusan";
            };
        }

}
