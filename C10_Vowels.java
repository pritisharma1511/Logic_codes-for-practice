import java.util.Scanner;
public class C10_Vowels {
    public void vowel()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter any character");
        char ch = scanner.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("charcter is vowel");
        }
        else{
            System.out.println("charcter is  not vowel");
        }
        scanner.close();

    }
    public static void main(String[] args)
    {
        C10_Vowels v1 =new C10_Vowels();
        v1.vowel();

    }
}
