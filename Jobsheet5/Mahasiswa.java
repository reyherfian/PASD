public class Mahasiswa {
    String nama;
    int nilaiUTS, nilaiUAS;

    public Mahasiswa(String nama, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Untuk mencari nilai tertinggi
    int cariMax(Mahasiswa arr[], int l, int r) {
        if (l == r)
            return arr[l].nilaiUTS; // Base case

        int mid = (l + r) / 2;
        int maxL = cariMax(arr, l, mid);
        int maxR = cariMax(arr, mid + 1, r);

        return (maxL > maxR) ? maxL : maxR; // Combine
    }

    double rataRataUAS(Mahasiswa arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}