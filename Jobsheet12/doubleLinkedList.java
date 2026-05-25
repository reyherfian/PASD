public class doubleLinkedList {
    private nodeAntrian headAntrian = null;
    private nodeAntrian tailAntrian = null;
    private nodePesanan headPesanan = null;
    private nodePesanan tailPesanan = null;
    
    private int counterAntrian = 1; // Generate nomor antrean otomatis

    // FITUR 1: Tambah Antrian \
    public void tambahAntrian(String nama, String noHp) {
        pembeli pembeliBaru = new pembeli(nama, noHp);
        nodeAntrian nodeBaru = new nodeAntrian(counterAntrian, pembeliBaru);
        
        if (headAntrian == null) {
            headAntrian = tailAntrian = nodeBaru;
        } else {
            tailAntrian.next = nodeBaru;
            nodeBaru.prev = tailAntrian;
            tailAntrian = nodeBaru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
        counterAntrian++;
    }

    // FITUR 2: Cetak Seluruh Antrian yang Ada
    public void cetakAntrian() {
        if (headAntrian == null) {
            System.out.println("Antrian Kosong!");
            System.out.println("------------------------------------");
            return;
        }
        System.out.println("====================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("====================================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        
        nodeAntrian current = headAntrian;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }

    // FITUR 3: Hapus Antrian Terdepan & Simpan Pesanan
    public void hapusAntrianDanPesan(int kode, String namaMenu, int harga) {
        if (headAntrian == null) {
            System.out.println("------------------------------------");
            System.out.println("Tidak ada antrean untuk diproses!");
            System.out.println("------------------------------------");
            return;
        }

        // 1. Ambil data antrean paling depan (head) untuk diproses
        nodeAntrian diproses = headAntrian;
        
        // 2. Simpan data makanannya ke struktur data Pesanan (Double Linked List)
        pesanan pesananBaru = new pesanan(kode, namaMenu, harga);
        nodePesanan nodePesananBaru = new nodePesanan(pesananBaru);
        
        if (headPesanan == null) {
            headPesanan = tailPesanan = nodePesananBaru;
        } else {
            tailPesanan.next = nodePesananBaru;
            nodePesananBaru.prev = tailPesanan;
            tailPesanan = nodePesananBaru;
        }

        System.out.println(diproses.data.namaPembeli + " telah memesan " + namaMenu);

        // 3. Hapus node antrean terdepan (removeFirst)
        if (headAntrian == tailAntrian) {
            headAntrian = tailAntrian = null;
        } else {
            headAntrian = headAntrian.next;
            headAntrian.prev = null;
        }
    }

    // FITUR 4: Laporan Pesanan Terurut + Total Pendapatan
    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("------------------------------------");
            System.out.println("Belum ada laporan pesanan masuk!");
            System.out.println("------------------------------------");
            return;
        }

        // Lakukan sorting manual sebelum data ditampilkan
        urutkanPesananSesuaiNama();

        System.out.println("====================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("====================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        nodePesanan current = headPesanan;
        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("------------------------------------");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan);
        System.out.println("------------------------------------");
    }

    private void urutkanPesananSesuaiNama() {
        if (headPesanan == null || headPesanan.next == null) return;

        nodePesanan current = headPesanan.next;
        while (current != null) {
            nodePesanan nextNode = current.next;
            pesanan key = current.data;
            nodePesanan searchNode = current.prev;

            // Membandingkan string nama secara alfabetis (A-Z) secara case-insensitive
            while (searchNode != null && searchNode.data.namaPesanan.compareToIgnoreCase(key.namaPesanan) > 0) {
                searchNode.next.data = searchNode.data;
                searchNode = searchNode.prev;
            }

            if (searchNode == null) {
                headPesanan.data = key;
            } else {
                searchNode.next.data = key;
            }
            current = nextNode;
        }
    }
}