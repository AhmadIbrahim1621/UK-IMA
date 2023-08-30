package UK_1;
import java.util.Scanner;

public class UK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan input");
        String pesanEnkripsi = scanner.nextLine();
        String pesanTafsir = tafsirPesan(pesanEnkripsi);
        System.out.println("Pesan Terenkripsi: " + pesanTafsir);

        scanner.close();
    }
    public static String tafsirPesan(String pesanEnkripsi) {
        String[] kataKode = pesanEnkripsi.split(" ");
        String hurufVokal = "AIUEO";
        StringBuilder pesanTafsir = new StringBuilder();
        String hurufKonsonan = "BCDFGHJKLMNPQRSTVWXYZ";

        for (String kata : kataKode) {
            if (kata.length() < 2) {
                pesanTafsir.append(kata).append(" ");
                continue;
            }
            char hurufVokalPertama = kata.charAt(kata.length() - 2);
            char hurufVokalKedua = kata.charAt(kata.length() - 1);

            if (hurufVokal.indexOf(hurufVokalPertama, hurufVokalKedua) != -1 && hurufKonsonan.indexOf(hurufVokalKedua) != -1) {
                pesanTafsir.append(kata.substring(0, kata.length() -2)).append(" ");
            } else {
                pesanTafsir.append(kata).append(" ");
            }
        }

        return pesanTafsir.toString().trim();
    }
}
