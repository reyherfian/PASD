public class MahasiswaMain03 {
    public static void main(String[] args) {

        Mahasiswa03 mhs1 = new Mahasiswa03 ();
        mhs1.nama = "Muhammad ALi Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilInformasi ();
        mhs1.ubahKelas ("S1 2K");
        mhs1.updateIPK (3.60);
        mhs1.tampilInformasi();

        Mahasiswa03 mhs2 = new Mahasiswa03("Annisa Nabila", "2141720169", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilInformasi();

        Mahasiswa03 mhsn = new Mahasiswa03("Rizky Maulana", "244107032", 3.45, "TI 1N");
        mhsn.tampilInformasi();
    }
}