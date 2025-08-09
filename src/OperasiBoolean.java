public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 75;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >=75;
        var lulusNilaiAkhir = nilaiAkhir >=80;

        System.out.println(lulusAbsen && lulusNilaiAkhir);
    }
}
