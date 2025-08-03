import java.util.Scanner;
public class C6_swap {
    Scanner scanner=new Scanner(System.in);
    public void swapNumbers() {
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();
        
        // Swapping logic
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        scanner.close();
    }
    public static void main(String[] args) {
        C6_swap obj = new C6_swap();
        obj.swapNumbers();
    }
}
