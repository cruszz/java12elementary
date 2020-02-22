package lesson1;
import java.util.Scanner;
public class scannerexercise {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String simbol = scanner.nextLine();
        int sum = scanner.nextInt();
        int sum2 = scanner.nextInt();
        String input = scanner.next();
        int res = 0;
      //  boolean stop = false;
        if (input.equals("+")) {
           // stop = true;
            res = sum + sum2;
        }
        if (input.equals("-")) {
            res = sum - sum2;
        }
        while (true) {
            sum = Integer.parseInt(input);
            sum2 = Integer.parseInt(input);
            //sum += Integer.parseInt(input);
            input = scanner.next();
            if (input.equals("stop")) {
               // stop = true;
                System.out.println(res);
                break;
            }

        }

        System.out.println();

    }
}
