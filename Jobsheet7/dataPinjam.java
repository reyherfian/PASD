//Nama: Aqila Herfian F.S
//Kelas: TI-1H
//NIM: 254107020041
//Absen: 03

public class dataPinjam {
    peminjaman[] data = new peminjaman [10];
    int idx = 0;

    void tambah(peminjaman p) {
        data[idx] = p;
        idx++;
    }

    void tampil () {
        for (int i = 0; i < idx; i++) {
            data[i].tampil();
        }
    }

    // mengurutkan denda
    void sortDendaDesc() {
        for (int i = 1; i < idx; i++) {
            peminjaman temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].denda < temp.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    // cari based on nim
    void cariNim(String nim) {
        boolean ketemu = false;
        for (int i = 0; i < idx; i++) {
            if (data[i].mhs.nim.equals(nim)) {
                data[i].tampil();
                ketemu = true;
            }
        }
        // data gak ketemu
        if (!ketemu) {
            System.out.println("Data tidak ditemukan");
        }
    }
}