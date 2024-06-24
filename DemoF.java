public class DemoF {
    public static void main(String[] args) {
        int N = 15;
        int count = 0;

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                // System.out.println("Not");
                count++;
            }
        }
        if(count == 2){
            System.out.println("Yes Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
