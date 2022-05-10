public class PeachBoxCounter {
    public void counter(int qty) {
        for(int x = 0; x <= (qty / 20); x++) {
            System.out.println("shipped " + (x * 20) + " peaches so far");
        }
    }
}
