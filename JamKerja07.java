import java.util.Scanner;

public class JamKerja07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Meminta input jumlah jam kerja
            System.out.print("Masukkan jumlah jam kerja (negatif untuk berhenti): ");
            int jamKerja = sc.nextInt();

            // Jika jam kerja negatif, keluar dari loop
            if (jamKerja < 0) {
                System.out.println("Program dihentikan.");
                break;
            }

            // Meminta input gaji harian
            System.out.print("Masukkan gaji harian: ");
            double gajiHarian = sc.nextDouble();

            double bonus = 0;

            // Jika jam kerja lebih dari 8 jam, hitung bonus 20%
            if (jamKerja > 8) {
                bonus = 0.2 * gajiHarian;
            }

            // Tampilkan bonus dan total gaji
            double totalGaji = gajiHarian + bonus;
            System.out.println("Bonus: " + bonus);
            System.out.println("Total gaji: " + totalGaji);
        }
    }
}
