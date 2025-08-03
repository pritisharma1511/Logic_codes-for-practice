import java.util.Scanner;
public class C3_Sum 
{ 
    public void calculateSum()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=scanner.nextInt();
        System.out.print("enter second number:");
        int num2=scanner.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
    public static void main(String[] args)
    {
        C3_Sum obj=new C3_Sum();
        obj.calculateSum();
        
    }

     

    
}
