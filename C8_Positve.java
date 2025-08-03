import java.util.Scanner;
public class C8_Positve {
    public void checkPositive(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if(num > 0){
            System.out.println(num + " is a positive number.");
        } else {
            System.out.println(num + " is not a positive number.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        C8_Positve obj = new C8_Positve();
        obj.checkPositive();
    }
}
