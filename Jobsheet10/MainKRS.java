import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Jumlah antrian maksimal diatur 10 sesuai petunjuk soal
        AntrianKRS antrian = new AntrianKRS(10); 
        int menu;

        do {
            System.out.println("\n=============================================");
            System.out.println("      SISTEM ANTRIAN LAYANAN KRS DOSEN       ");
            System.out.println("=============================================");
            System.out.println("1. Daftarkan Mahasiswa ke Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian KRS (Melayani 2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian Saat Ini");
            System.out.println("7. Cetak Total Mahasiswa Selesai KRS");
            System.out.println("8. Cetak Sisa Mahasiswa Belum KRS (Target DPA)");
            System.out.println("9. Kosongkan Seluruh Antrian (Clear)");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu (0-9): ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("NIM        : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama Mhs   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi      : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas      : ");
                    String kelas = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(m);
                    break;
                case 2:
                    antrian.panggilAntrianKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanPalingAkhir();
                    break;
                case 6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 7:
                    antrian.cetakJumlahSelesaiKRS();
                    break;
                case 8:
                    antrian.cetakBelumKRS();
                    break;
                case 9:
                    antrian.mengosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih! Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid! Silakan masukkan angka 0-9.");
            }
        } while (menu != 0);
        
        sc.close();
    }
}