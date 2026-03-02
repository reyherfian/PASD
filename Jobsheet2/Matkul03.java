public class Matkul03 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public Matkul03() {}

    public Matkul03(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi(){
        System.out.println("Kode MK\t: " + kodeMK);
        System.out.println("Nama MK\t: " + nama);
        System.out.println("SKS\t: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("------------------------");
        System.out.println();
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }

    public void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam + " jam");
    }

    public void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan. jumlah jam terlalu sedikit.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam + " jam");
        }
        System.out.println();
    }
}