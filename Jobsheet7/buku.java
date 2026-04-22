//Nama: Aqila Herfian F.S
//Kelas: TI-1H
//NIM: 254107020041
//Absen: 03

public class buku {
    String kode;
    String judul;
    int tahun;

    buku(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampil () {
        System.out.println(kode + "\t| " + judul + "\t| " + tahun);
    }
}
