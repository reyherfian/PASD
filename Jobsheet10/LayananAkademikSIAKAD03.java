import java.util.Scanner;

public class LayananAkademikSIAKAD03 {
    public static void menu() {
        System.out.println("\n=== Menu Antrian Layanan Akademik ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat Mahasiswa Terdepan");
        System.out.println("4. Lihat Semua Antrian");
        System.out.println("5. Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Cek Antrian paling belakang"); // <--- MODIFIKASI MENU 6
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        
        AntrianLayanan03 antrian = new AntrianLayanan03(kapasitas);
        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer sisa kursor baris baru

            switch (pilihan) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa03 mhs = new Mahasiswa03(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa03 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    // =========================================================
                    // MODIFIKASI CASE 6: Memanggil fungsi antrian paling belakang
                    // =========================================================
                    antrian.LihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}