public class Pangkat {
    public int nilai, pangkat;

    // Konstruktor berparameter
    public Pangkat(int n, int p) {
        this.nilai = n;
        this.pangkat = p;
    }

    // Metode Brute Force: a^n = a * a * ... * a (sebanyak n kali)
    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    // Metode Divide and Conquer: a^n = (a^(n/2))^2
    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) // Jika pangkat ganjil
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            else // Jika pangkat genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
        }
    }
}
