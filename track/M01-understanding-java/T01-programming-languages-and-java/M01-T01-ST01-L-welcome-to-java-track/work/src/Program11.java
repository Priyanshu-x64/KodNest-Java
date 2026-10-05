import java.util.Scanner;



public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        Result result = new Result();
        result.show(mark);

        scanner.close();
    }
}