import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        doubleLinkedList dll = new doubleLinkedList();
        Scanner input = new Scanner(System.in);
        int menu;

        // Memasukkan data antrean awal lewat program (Sesuai catatan instruksi soal)
        dll.tambahAntrian("Ainra", "08224500000");
        dll.tambahAntrian("Danra", "08224511111");
        dll.tambahAntrian("Sanri", "08224522222");

        do {
            System.out.println("\n===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();
            input.nextLine(); // Membersihkan sisa baris baru buffer token

            switch (menu) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = input.nextLine();
                    System.out.print("No HP        : ");
                    String hp = input.nextLine();
                    dll.tambahAntrian(nama, hp);
                    break;

                case 2:
                    dll.cetakAntrian();
                    break;

                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kode = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String menuMakan = input.nextLine();
                    System.out.print("Harga        : ");
                    int harga = input.nextInt();
                    dll.hapusAntrianDanPesan(kode, menuMakan, harga);
                    break;

                case 4:
                    dll.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 0);

        input.close();
    }
}