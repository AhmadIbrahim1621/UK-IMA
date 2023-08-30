package UK_1;
import java.util.Scanner;

public class UK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Masukan angka secara satu per satu
        System.out.println("Masukan matriks bilangan : ");
        int[][] matriks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum = hitungDiagonal(matriks);
        System.out.println("Jumlah bilangan diagonal: " + diagonalSum);

        scanner.close();
    }

    public static int hitungDiagonal(int[][] matriks) {
        int sum = 0;
        for (int i = 0; i < matriks.length; i++) {
            sum += matriks[i][i];
        }
        return sum;
    }
}
