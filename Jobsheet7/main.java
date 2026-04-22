//Nama: Aqila Herfian F.S
//Kelas: TI-1H
//NIM: 254107020041
//Absen: 03

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswa m1 = new mahasiswa("22001", "Andi", "TI");
        mahasiswa m2 = new mahasiswa("22002", "Budi", "TI");
        mahasiswa m3 = new mahasiswa("22003", "Citra", "SIB");

        buku bk1 = new buku("B001", "Algoritma", 2020);
        buku bk2 = new buku("B002", "Basis Data", 2019);
        buku bk3 = new buku("B003", "Pemrograman", 2021);
        buku bk4 = new buku("B004", "Fisika", 2024);

        mahasiswa[] mhs = {m1, m2, m3};
        buku[] bk = {bk1, bk2, bk3, bk4};

        dataPinjam dp = new dataPinjam();

        dp.tambah(new peminjaman(m1, bk1, 7));
        dp.tambah(new peminjaman(m2, bk2, 3));
        dp.tambah(new peminjaman(m3, bk3, 10));
        dp.tambah(new peminjaman(m3, bk4, 6));
        dp.tambah(new peminjaman(m1, bk2, 4));

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampil Mahasiswa");
            System.out.println("2. Tampil Buku");
            System.out.println("3. Tampil peminjaman");
            System.out.println("4. Urutkan Denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                for (int i = 0; i < mhs.length; i++) {
                    mhs[i].tampil();
                }
            } else if (pilih == 2) {
                for (int i = 0; i < bk.length; i++){
                    bk[i].tampil();
                }
            } else if (pilih == 3) {
                dp.tampil();
            } else if (pilih == 4) {
                dp.sortDendaDesc();
                dp.tampil();;
            } else if (pilih == 5) {
                System.out.println("Masukkan NIM: ");
                String nim = sc.nextLine();
                dp.cariNim(nim);
            } else if (pilih == 0) {
                System.out.println("Program selesai");
            } else {
                System.out.println("Pilihan invalid! Coba lagi");
            }

        } while (pilih !=0);

        System.out.println("Terima kasih");
    }    
}
