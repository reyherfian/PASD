public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;
    final int MAKS_DPA = 30; // Batas maksimal mahasiswa per DPA sesuai soal

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void mengosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Silakan tunggu beberapa saat.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke daftar antrian KRS.");
    }

    public void panggilAntrianKRS() {
        if (size < 2) {
            System.out.println("Pemanggilan gagal! Minimal harus ada 2 mahasiswa di dalam antrian.");
            return;
        }
        System.out.println("\n--- MEMANGGIL 2 MAHASISWA UNTUK PROSES KRS ---");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            System.out.print("Diproses -> ");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n--- DAFTAR ANTRIAN KRS SAAT INI ---");
        System.out.println("No. | NIM \t\t| NAMA \t\t| PRODI | KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ".  ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Data antrian kurang dari 2 anak untuk ditampilkan.");
            return;
        }
        System.out.println("\n--- 2 ANTRIAN TERDEPAN ---");
        System.out.println("NIM \t\t| NAMA \t\t| PRODI | KELAS");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n--- ANTRIAN PALING AKHIR ---");
        System.out.println("NIM \t\t| NAMA \t\t| PRODI | KELAS");
        data[rear].tampilkanData();
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian aktif: " + size);
    }

    public void cetakJumlahSelesaiKRS() {
        System.out.println("Jumlah mahasiswa yang SUDAH selesai proses KRS: " + totalDilayani);
    }

    public void cetakBelumKRS() {
        int sisaBelumKrs = MAKS_DPA - totalDilayani;
        System.out.println("Sisa kuota mahasiswa yang BELUM proses KRS pada DPA ini: " + sisaBelumKrs + " mahasiswa");
    }
}

