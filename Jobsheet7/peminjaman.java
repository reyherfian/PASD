//Nama: Aqila Herfian F.S
//Kelas: TI-1H
//NIM: 254107020041
//Absen: 03

public class peminjaman {
  mahasiswa mhs;
  buku bk;
  int lamaPinjam;
  int denda;
  
  peminjaman(mahasiswa mhs, buku bk, int lamaPinjam) {
    this.mhs = mhs;
    this.bk = bk;
    this.lamaPinjam = lamaPinjam;
    hitungDenda();
  }

  void hitungDenda() {
    if (lamaPinjam > 5) {
        int telat = lamaPinjam - 5;
        denda = telat * 2000;
    } else {
        denda = 0;
    }
  }

  void tampil () {
    System.out.println(mhs.nim + " | " + mhs.nama + "\t| " + bk.judul + "\t| " + "\thari | denda: " + denda);
  }
}
