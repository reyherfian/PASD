public class MainMahasiswa {
    public static void main(String[] args) {
        // Inisialisasi Data Mahasiswa berdasarkan tabel
        Mahasiswa[] daftarMhs = {
                new Mahasiswa("Ahmad", 78, 82),
                new Mahasiswa("Budi", 85, 88),
                new Mahasiswa("Cindy", 90, 87),
                new Mahasiswa("Dian", 76, 79),
                new Mahasiswa("Eko", 92, 95),
                new Mahasiswa("Fajar", 88, 85),
                new Mahasiswa("Gina", 80, 83),
                new Mahasiswa("Hadi", 82, 84)
        };

        // a) Nilai UTS Tertinggi (Divide and Conquer)
        int maxUTS = cariMax(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Tertinggi: " + maxUTS);

        // b) Nilai UTS Terendah (Divide and Conquer) 
        int minUTS = cariMin(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Terendah: " + minUTS);

        // c) Rata-rata Nilai UAS (Brute Force) 
        double rataUAS = rataRataUAS(daftarMhs);
        System.out.println("Rata-rata Nilai UAS: " + rataUAS);
    }

    // --- Implementasi Fungsi ---

    public static int cariMax(Mahasiswa[] arr, int l, int r) {
        if (l == r)
            return arr[l].nilaiUTS;
        int mid = (l + r) / 2;
        int maxL = cariMax(arr, l, mid);
        int maxR = cariMax(arr, mid + 1, r);
        return (maxL > maxR) ? maxL : maxR;
    }

    public static int cariMin(Mahasiswa[] arr, int l, int r) {
        if (l == r)
            return arr[l].nilaiUTS;
        int mid = (l + r) / 2;
        int minL = cariMin(arr, l, mid);
        int minR = cariMin(arr, mid + 1, r);
        return (minL < minR) ? minL : minR;
    }

    public static double rataRataUAS(Mahasiswa[] arr) {
        double total = 0;
        for (Mahasiswa mhs : arr) {
            total += mhs.nilaiUAS;
        }
        return total / arr.length;
    }
}