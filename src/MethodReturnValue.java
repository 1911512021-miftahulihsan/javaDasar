public class MethodReturnValue {
    public static void main(String[] args) {
//ini memakai hasil dari return valua dari methodnya
        int hasil = sum(10, 20);
        System.out.println(hasil);
//ini memakai hasil dari return valua dari methodnya
        System.out.println(hitung(10, "+", 30));
        System.out.println(hitung(50, "-", 30));
        System.out.println(hitung(10, "salah", 30));
    }
    static  int sum(int a, int b) {
        var hasil = a+b;
        return hasil;
    }
    static int hitung(int angka1, String operator, int angka3) {
        switch (operator) {
            case "+":
                return angka1 + angka3;
            case "-":
                return angka1 - angka3;
            default:
                return 0;
        }
    }
}
