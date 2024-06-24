public class DemoG {
    public static void main(String[] args) {
        int N = 12;
        int fact = 0;
        // int temp = N;
        for(int i = 1; i < N; i++){
            if(N % i == 0){
                fact = fact + i;
            }
        }
        if(N == fact){
            System.out.println("Yes");
        }else{
            System.out.println("Not");
        }
    }
}
