import java.util.Scanner;

public class UK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan lirik lagu: ");
        String lirikMasukan = scanner.nextLine();

        String lirikKeluaran = ubahLagu(lirikMasukan);
        System.out.println("Lirik hasil ubahan: " + lirikKeluaran);

        scanner.close();
    }

    public static String ubahLagu(String lirik) {
        String[] hurufPengganti = { "a", "e", "i", "o", "u" };
        int panjangLirik = lirik.length();
        int sisaBagi = panjangLirik % 5;
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < panjangLirik; i++) {
            char karakter = lirik.charAt(i);

            if ("aeiou".indexOf(karakter) != -1) {
                int indeksPengganti = (i % 5 + sisaBagi) % 5;
                char pengganti = hurufPengganti[indeksPengganti].charAt(0);
                hasil.append(pengganti);
            } else {
                hasil.append(karakter);
            }
        }

        return hasil.toString();
    }
}
