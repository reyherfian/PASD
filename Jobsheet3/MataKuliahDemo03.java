import java.util.Scanner;
public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mata kuliah: ");
        int jumlah =Integer.parseInt(sc.nextLine());

        MataKuliah03[] arrayOfMataKuliah03 = new MataKuliah03[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah03[i] = new MataKuliah03();
            arrayOfMataKuliah03[i].tambahData(sc);
            System.out.println("-------------------------");
        }

        System.out.println("\n--- HASIL INPUT MATA KULIAH ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah03[i].cetakInfo();
        }
    }
}
