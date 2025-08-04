import java.util.Scanner;

public class C11_Average {
    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");
        String input = scanner.nextLine();

        String[] parts = input.trim().split("\\s+"); // split by spaces
        int sum = 0;

        for (String part : parts) {
            int num = Integer.parseInt(part); // convert each part to int
            sum += num;
        }

        int n = parts.length;
        double average = (n > 0) ? (double) sum / n : 0;

        System.out.println("Average: " + average);
        scanner.close();
    }

    public static void main(String[] args) {
        C11_Average obj = new C11_Average();
        obj.calculate();
    }
}
