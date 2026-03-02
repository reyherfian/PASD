public class MatkulMain03 {
    public static void main(String[] args) {
        Matkul03 mk1 = new Matkul03();
        mk1.kodeMK = "TI101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        Matkul03 mk2 = new Matkul03("TI102", "Basis Data", 3, 4);

        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(1);
        mk2.kurangiJam(7);
        mk2.tampilInformasi();
    }
}
