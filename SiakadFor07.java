import java.util.Scanner;

public class SiakadFor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //...................deklarasi..........................//

        double nilai, tertinggi = 0, terendah = 100;
        int jmlLulus = 0, jmlTidak = 0;

    //.................perulangan..........................//

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai>tertinggi) {
                tertinggi = nilai;                
            }
            if (nilai<terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jmlLulus ++;
            }else{
                jmlTidak ++;
            }
        }
    
    //....................output.......................//

    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    }
}