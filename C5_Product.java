import java.util.Scanner;
public class C5_Product {
    public void calculateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + (num1 / num2));
        System.out.println("The remainder is: " + (num1 % num2));
        scanner.close();
    }

    public static void main(String[] args) {
        C5_Product obj = new C5_Product();
        obj.calculateProduct();
    }
}