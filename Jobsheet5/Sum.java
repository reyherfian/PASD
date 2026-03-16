public class Sum {
    public int elemen;
    public double keuntungan[];

    public Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }

    double totalBF() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) { // Base case: hanya satu elemen
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum; // Combine
        }
    }
}