import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
     MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(5);
     Scanner sc = new Scanner(System.in);
     for (int i = 0; i < 5; i++) {
         System.out.println("=== INPUT MAHASISWA KE-" + (i+1) + "===");
         System.out.print("NIM: ");
         String nim = sc.nextLine();
        System.out.println("Nama: ");
        String nama = sc.nextLine();
        System.out.println("Kelas: ");
        String kelas = sc.nextLine();
        System.out.println("IPK: ");
        double ipk = Double.parseDouble(sc.nextLine());

        Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
     }
     System.out.println("Data mahasiswa sebelum sorting: ");
     list.tampil();

     System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
     list.bubbleSort();
     list.tampil();

     System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
     list.selectionSort();
     list.tampil();

     System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
     list.insertionsort();
     list.tampil();
    }
}
