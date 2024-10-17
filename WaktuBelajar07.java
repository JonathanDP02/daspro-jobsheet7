import java.util.Scanner;

public class WaktuBelajar07 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//............................deklarasi.................................//

        int jmlJam = 0,totalJam = 0;
        System.out.println("======waktu belajar selama seminggu======");
        System.out.println("Ketik 0 jika selesai");

//..........................perulangan................................//

        for (int hari = 1; hari <= 5; hari++) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            jmlJam = sc.nextInt();
            totalJam += jmlJam;

            if (jmlJam > 10) {
                System.out.println("Tidak mungkin masukkan dengan benar");
            }continue;
            
        }

        
        System.out.println("Total belajar minggu ini adalah " + totalJam + "jam");
    }
}
