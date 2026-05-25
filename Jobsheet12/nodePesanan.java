public class nodePesanan {
    pesanan data;
    nodePesanan prev;
    nodePesanan next;

    public nodePesanan(pesanan data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}