import java.util.Scanner;
public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen03[] arrayOfDosen03 = new Dosen03[3];
        String kode, nama, dummy, jk;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen Ke-"+ (i+1));
            System.out.print("Kode    : ");
            kode = sc.nextLine();
            System.out.print("Nama    : ");
            nama = sc.nextLine();
            System.out.print("Jenis kelamin (Pria/Wanita) : ");
            jk = sc.nextLine();
            System.out.print("Usia    :");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("----------------------------");

            boolean jkKeadaan = jk.equalsIgnoreCase("Pria");
            arrayOfDosen03[i] = new Dosen03(kode, nama, jkKeadaan, usia);
        }

        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen03 setiapDosen : arrayOfDosen03) {
            System.out.println("Kode    : " + setiapDosen.kode);
            System.out.println("Nama    : " + setiapDosen.nama);

            String teksJenisKelamin;
            if (setiapDosen.jenisKelamin == true) {
                teksJenisKelamin = "Pria";
            } else {
                teksJenisKelamin = "Wanita";
            }

            System.out.println("Jenis Kelamin   : " + teksJenisKelamin);
            System.out.println("Usia    : " + setiapDosen.usia);
            System.out.println("-------------------------------");
        }

        System.out.println("\n===== HASIL ANALISIS DATA =====");
        DataDosen03.dataSemuaDosen(arrayOfDosen03);
        DataDosen03.jumlahDosenPerGender(arrayOfDosen03);
        DataDosen03.rerataUsiaPerGender(arrayOfDosen03);
        DataDosen03.infoDosenPalingTuaDanMuda(arrayOfDosen03);
    }
}
