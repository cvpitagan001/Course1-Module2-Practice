import java.util.Scanner;

public class StockExchangeCalculator {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the number of peaches picked: ");
        int qty = get.nextInt();

        PeachBoxCounter count = new PeachBoxCounter();
        count.counter(qty);
    }
}