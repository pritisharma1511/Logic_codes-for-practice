import java.util.Scanner;
public class C9_Largest {
    public void largeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int num1 = scanner.nextInt();
        System.out.println("enter second number:");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is a greater number.");
        } else {
            System.out.println(num2+ " is a smaller number.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        C9_Largest obj = new C9_Largest();
        obj.largeNumber();
    }
}
