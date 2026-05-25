public class nodeAntrian {
    int noAntrian;
    pembeli data;
    nodeAntrian prev;
    nodeAntrian next;

    public nodeAntrian(int noAntrian, pembeli data) {
        this.noAntrian = noAntrian;
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}