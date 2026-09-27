import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine();  // consume the pending newline

        String fullName = scanner.nextLine();

        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);

        scanner.close();
    }
}