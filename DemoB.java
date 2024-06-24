import java.util.Scanner;

public class DemoB {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a NO: ");
        int N = obj.nextInt();
        int ans = 0;

        while (N != 0) {
            int digit = N % 10;
            ans = (ans*10) + digit;
            N = N/10;
        }
        System.out.println("OutPut: "+ ans);
    }    
}
