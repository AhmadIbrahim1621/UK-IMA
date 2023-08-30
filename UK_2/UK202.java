package UK_2;

import java.util.ArrayList;
import java.util.Scanner;

public class UK202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahToples = scanner.nextInt();
        int jumlahPermenDikehendaki = scanner.nextInt();

        ArrayList<Integer> permenDiToples = new ArrayList<>();
        for (int i = 0; i < jumlahToples; i++) {
            int jumlahPermen = scanner.nextInt();
            permenDiToples.add(jumlahPermen);
        }

        findToplesPairs(permenDiToples, jumlahPermenDikehendaki);

        scanner.close();
    }

    public static void findToplesPairs(ArrayList<Integer> permenDiToples, int jumlahPermenDikehendaki) {
        int n = permenDiToples.size();
        ArrayList<Pair> hasil = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (permenDiToples.get(i) + permenDiToples.get(j) == jumlahPermenDikehendaki) {
                    hasil.add(new Pair(i + 1, j + 1)); // Menambahkan pasangan toples yang memenuhi syarat
                }
            }
        }

        if (hasil.isEmpty()) {
            System.out.println("Tidak ada kombinasi yang cocok");
        } else {
            for (Pair pair : hasil) {
                System.out.println(pair.first + " " + pair.second);
            }
        }
    }

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
