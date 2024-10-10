import java.util.Scanner;

public class Bioskop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//.......................deklarasi......................//

        int hargaTiket = 50000, jmlTiket, totalTerjual = 0;
        float diskon = 0, totalHarha = 0, hargaDiskon = 0, totalPenjualan = 0;

//......................perulangan....................//

        do {
            System.out.print("Masukkan jumlah tiket (masukkan 0 jika ingin membatalkan): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                System.out.println("Transaksi selesai");
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Input tidak valid, mohon masukkan dengan benar!!");
                continue;
            }
            totalTerjual += jmlTiket;
            totalHarha = jmlTiket*hargaTiket;

            if (jmlTiket > 10) {
                diskon = 0.15f;
                hargaDiskon = totalHarha - (totalHarha*diskon);
            }else if (jmlTiket > 4) {
                diskon = 0.1f;
                hargaDiskon = totalHarha - (totalHarha*diskon);
            }else{
                hargaDiskon = totalHarha;
            }

            totalPenjualan += hargaDiskon;
            System.out.println("Total harga untuk " + jmlTiket + " tiket adalah Rp " + hargaDiskon);

        }while (true);

        //..................output.....................//

        System.out.println("Total tiket terjual\t : " + totalTerjual);
        System.out.println("Total penjualan\t : " + totalPenjualan);
    }
}
