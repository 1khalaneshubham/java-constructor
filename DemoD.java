public class DemoD {
    public static void main(String[] args) {
        
        int N = 12321;
        int temp = N;
        int rev = 0;

        while (N != 0) {
            int digit = N % 10;
            rev = (rev * 10) + digit;
            N = N/10;
        }
        if(temp == rev){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
