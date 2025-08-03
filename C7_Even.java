import java.util.Scanner;
public class C7_Even {
    public void checkEven(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        C7_Even obj = new C7_Even();
        obj.checkEven();
    }

}
