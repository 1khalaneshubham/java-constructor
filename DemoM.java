import java.util.Scanner;

public class DemoM {
    static int Add(int a,int b){
        int ans = a+b;
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        Add(a, b);
        // System.out.println(Add(a, b));
    }
}
