import java.util.Scanner;

public class Parkir07 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//.......................deklarasi........................//

        int jenis, durasi, total = 0;
        
        System.out.println("-----pilih jenis kendaraan-----");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");
       
    
//.....................perulangan........................//

        do {
            System.out.print("Masukkan jenis kendaraan anda : ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                System.out.println("----Transaksi selesai----");
                break;
            }
            if (jenis < 0) {
                System.out.println("--!!Input tidak valid!!--");
                continue;
            }
            if (jenis > 2) {
                System.out.println("--!!Input tidak valid!!--");
                continue;
            }
            else if ((jenis == 1)||(jenis == 2)) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (durasi <= 5) {
                    total += 12500;
                    System.out.println("Total yang harus dibayarkan: Rp" + total);
                }
                else if (jenis == 1) {
                    total += durasi*3000;
                    System.out.println("Total yang harus dibayarkan: Rp" + total);
                }
                else if (jenis == 2) {
                    total += durasi*2000;
                    System.out.println("Total yang harus dibayarkan: Rp" + total);
                }
            }
            
        }while (jenis != 0);

//........................output........................//

    }
}
