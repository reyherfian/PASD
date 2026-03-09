public class DataDosen03 {
    public static void dataSemuaDosen(Dosen03[] arrayOfDosen03) {
        // a. tampilkan semua data
        System.out.println("\n--- SEMUA DATA DOSEN ---");
        for (Dosen03 setiapDosen03 : arrayOfDosen03) {
            System.out.println("Kode    : " + setiapDosen03.kode);
            System.out.println("Nama    : " + setiapDosen03.nama);
            System.out.println("Jenis Kelamin   : " + (setiapDosen03.jenisKelamin? "Pria" : "Wanita"));
            System.out.println("Usia    : " + setiapDosen03.usia);
        }
    }
    // b. jumlah dosen per gender
    public static void jumlahDosenPerGender(Dosen03[] arrayOfDosen03) {
        int pria = 0, wanita = 0;
        for (Dosen03 setiapDosen03 : arrayOfDosen03) {
            if (setiapDosen03.jenisKelamin) pria++; else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }
    // c. rerata usia dosen per gender
    public static void rerataUsiaPerGender(Dosen03[] arrayOfDosen03) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen03 setiapDosen03 : arrayOfDosen03) {
            if (setiapDosen03.jenisKelamin) {
                totalPria += setiapDosen03.usia;
                countPria++;
            } else {
                totalWanita += setiapDosen03.usia;
                countWanita++;
            }
            System.out.println("\nRerata usia dosen pria: " + (countPria > 0? (double)totalPria/countPria : 0));
            System.out.println("erata Usia Dosen Wanita: " + (countWanita > 0? (double)totalWanita/countWanita : 0));
        }
    }
    // d&e. dosen paling tua & muda
    public static void infoDosenPalingTuaDanMuda(Dosen03[] arrayDosen03) {
        Dosen03 tertua = arrayDosen03[0];
        Dosen03 termuda = arrayDosen03[0];

        for (Dosen03 setiapDosen03 : arrayDosen03) {
            if (setiapDosen03.usia > tertua.usia) tertua = setiapDosen03;
            if (setiapDosen03.usia < termuda.usia) termuda = setiapDosen03;
        }
        System.out.println("\nDosen Paling Tua: " + tertua.nama + "(" + tertua.usia + " tahun)");
        System.out.println("Dosen Paling Muda: " + termuda.nama + "(" + termuda.usia + " tahun)");
    }
}
