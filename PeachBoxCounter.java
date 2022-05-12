import java.util.InputMismatchException;
import java.util.Scanner;

public class PeachBoxCounter {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        try {
            System.out.print("Enter the number of peaches picked: ");
            int qty = get.nextInt();

            for(int x = 0; x <= (qty / 20); x++) {
                System.out.println("shipped " + (x * 20) + " peaches so far");
            }
        } catch(InputMismatchException e) {
            System.out.println(e);
        }
    
    }
}