import java.util.Scanner;
public class C4_Difference {
    public void calculateDiff(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=scanner.nextInt();
        System.out.print("enter the second number:");
        int num2=scanner.nextInt();
        int diff=num1-num2;
        System.out.println("The difference is: " + diff);
        scanner.close();
    }
    public static void main(String[] args) {
        C4_Difference obj=new C4_Difference();
        obj.calculateDiff();
    }
}
