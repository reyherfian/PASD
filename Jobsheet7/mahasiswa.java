//Nama: Aqila Herfian F.S
//Kelas: TI-1H
//NIM: 254107020041
//Absen: 03

public class mahasiswa {
    String nim;
    String nama;
    String prodi;

    mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampil () {
        System.out.println(nim + "\t| " + nama + "\t| " + prodi);
    }
}
