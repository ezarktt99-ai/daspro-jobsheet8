import java.util.Scanner;

public class Tugas313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int totalBarangSeluruhToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        int[] pelangganPerToko = new int[jumlahToko + 1];
        int[] barangPerToko = new int[jumlahToko + 1];

        for (int i =1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i );
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangTokoIni = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("jumlah barang pelanggan" + j + ": ");
                int barang = sc.nextInt();
                totalBarangTokoIni += barang;
            }
            pelangganPerToko[i] = jumlahPelanggan;
            barangPerToko[i] = totalBarangTokoIni;
            totalBarangSeluruhToko += totalBarangTokoIni;

            if (totalBarangTokoIni > barangTerbanyak) {
                barangTerbanyak = totalBarangTokoIni;
                tokoTerbanyak = i;
            }
        }
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("toko " + i + " - pelanggan: " + pelangganPerToko[i] + ", total barang: " + barangPerToko[i]);

        }
        System.out.println("total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
