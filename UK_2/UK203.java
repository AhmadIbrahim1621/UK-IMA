package UK_2;
import java.util.ArrayList;
import java.util.Scanner;

public class UK203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Membaca newline setelah bilangan bulat

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String element = scanner.nextLine();
            arrayList.add(element);
        }

        tukarIsi(arrayList);

        for (String element : arrayList) {
            System.out.println(element);
        }

        scanner.close();
    }

    public static void tukarIsi(ArrayList<String> arrayList) {
        int n = arrayList.size();
        for (int i = 0; i < n - 1; i += 2) {
            String temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(i + 1));
            arrayList.set(i + 1, temp);
        }
    }
}
