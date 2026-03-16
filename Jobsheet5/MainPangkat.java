import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();

        // Instansiasi Array of Object
        Pangkat[] png = new Pangkat[elemen];

        // Input data ke dalam array
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int n = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int p = sc.nextInt();
            png[i] = new Pangkat(n, p);
        }

        // Menampilkan Hasil
        System.out.println("HASIL PANGKAT BRTEFORCE:");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat+ ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
} 
