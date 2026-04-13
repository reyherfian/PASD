import java.util.Scanner;

public class MainDosen03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen03 data = new DataDosen03();

        int menu;

        do {
            System.out.println("MENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Kode: ");
                String kode = sc.nextLine();

                System.out.print("Nama: ");
                String nama = sc.nextLine();

                System.out.print("Jenis Kelamin (true=LK false=PR): ");
                boolean jk = sc.nextBoolean();

                System.out.print("Usia: ");
                int usia = sc.nextInt();
                sc.nextLine();

                data.tambah(new Dosen03(kode, nama, jk, usia));
            } else if (menu == 2) {
                data.tampil();
            } else if (menu == 3) {
                data.sortingASC();
                System.out.println("Data sudah diurutkan ASC");
            } else if (menu == 4) {
                data.sortingDSC();
                System.out.println("Data sudah diurutkan DSC");
            }

        } while (menu != 0);
    }
}