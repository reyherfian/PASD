public class DosenMain {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.idDosen = "D001";
        d1.nama = "Dr. Ahmad";
        d1.statusAktif = true;
        d1.tahunBergabung = 2019;
        d1.bidangKeahlian = "Jaringan Komputer";

        d1.tampilInformasi();
        d1.setStatusAktif(false);
        d1.hitungMasaKerja(2026);
        d1.ubahKeahlian("Keamanan Siber");

        Dosen d2 = new Dosen("D002", "Prof. Aminah", true, 2020, "Basis Data");

        d2.tampilInformasi();
        d2.setStatusAktif(false);
        d2.hitungMasaKerja(2026);
        d2.ubahKeahlian("Kecerdasan Buatan");
        d2.tampilInformasi();
    }
}
