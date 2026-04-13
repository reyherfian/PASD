public class Dosen {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen(){}

    public Dosen(String idDosen, String nama, boolean statusAktif, int TahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi(){
        System.out.println();
        System.out.println("ID Dosen\t: " + idDosen);
        System.out.println("Nama Dosen\t: " + nama);
        System.out.println("Status Aktif\t: " + (statusAktif? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Keahlian bidang\t: " + bidangKeahlian);
        System.out.println("-----------------------");
        System.out.println();
    }

    public int hitungMasaKerja(int thnSkrg){
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun");
        return masaKerja;
    }

    public void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        statusAktif = status;
    }
}
