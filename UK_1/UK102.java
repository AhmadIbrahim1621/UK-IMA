package UK_1;
import java.util.Scanner;

public class UK102 {
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
        StringBuilder pesanTafsir = new StringBuilder();

        for (String kata : kataKode) {
            if (kata.length() >= 4 && kata.endsWith("AR")) {
                pesanTafsir.append(kata).append(" ");
                continue;
            }
            char hurufAR = kata.charAt(kata.length() - 3);

            if ("AEIOUaeiou".indexOf(hurufAR) != -1) {
                pesanTafsir.append(kata.substring(0, kata.length() -2)).append(" ");
            } else {
                pesanTafsir.append(kata).append(" ");
            }
        }
        return pesanTafsir.toString().trim();
    }
}
