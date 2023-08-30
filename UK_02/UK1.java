package UK_02;
import java.util.Scanner;

public class UK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi diamond: ");
        int tinggiDiamond = scanner.nextInt();

        cetakDiamond(tinggiDiamond);

        scanner.close();
    }

    public static void cetakDiamond(int tinggiDiamond) {
        for (int i = 1; i <= tinggiDiamond; i++) {
            for (int j = 1; j <= tinggiDiamond - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = tinggiDiamond - 1; i >= 1; i--) {
            for (int j = 1; j <= tinggiDiamond - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}