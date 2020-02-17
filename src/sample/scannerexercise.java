package sample;
import java.util.Scanner;
public class scannerexercise {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int sum = 0;
        boolean stop = false;
        if (input.equals("stop")) {
            stop = true;
        }
        while (true) {
            sum += Integer.parseInt(input);
            input = scanner.next();
            if (input.equals("stop")) {
                stop = true;
                System.out.println(sum);
                break;
            }

        }

        System.out.println();

    }
}
