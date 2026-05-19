import java.util.Scanner;

public class SuratMain03 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat03 stack = new StackSurat03(10);
        int pilih;

        do {
            System.out.println("\nMenu Administrasi Surat Izin:");
            System.out.println("1. Terima urat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Teraakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durai (hari): ");
                    int durasi = sc.nextInt();
                    Surat03 s = new Surat03(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat03 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Mmeproses surat " + diproses.idSurat + " atas nama " + diproses.namaMahasiswa);
                    } 
                    break;

                case 3:
                    Surat03 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat teratas: " + terakhir.idSurat + " - " + terakhir.namaMahasiswa);
                    } else {
                        System.out.println("Belum ada surat masuk.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 5);
    }
}
