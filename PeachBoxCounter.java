public class PeachBoxCounter {
    public void counter(int qty) {
        int x = 0;
        while(x <= (qty / 20)) {
            System.out.println("shipped " + (x * 20) + " peaches so far");
            x++;
        }
    }
}
