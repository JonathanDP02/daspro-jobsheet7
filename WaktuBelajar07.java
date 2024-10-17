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

        int hari = 1;
        while (hari <= 7) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + " : ");
            jmlJam = sc.nextInt();
            if (jmlJam > 10) {
                System.out.println("Tidak mungkin");
                continue;
            }
            hari++;
            totalJam += jmlJam;
        }
        System.out.println("Total jam: "  + totalJam );
    }
}
