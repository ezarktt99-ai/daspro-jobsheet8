import java.util.Scanner;

public class Tugas213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int jumlahSeluruh = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahSeluruh += hasil;
            }
            System.out.println();
        }
        System.out.println("jumlah seluruh angka: " + jumlahSeluruh);
        sc.close();
    }
}
