public class DemoH {
    public static void main(String[] args) {
        
        int N = 13;
        int temp1 = N;
        int temp2 = N;
        int Count = 0;
        int Sum = 0;
        // int mult = 1;

        while (N != 0) {
            Count++;
            N = N/10;
        }
        while (N != 0) {
            int rem  = N%10;
            int mult = 1;
        }
        for(int i = 1; i <= Count; i++){
            mult = mult * rem;
        }
        Sum = Sum + mult;
        N = N / 10;
        
        if(N == Sum){
            System.out.println("Yes,Armstrong");
        }else{
            System.out.println("Not,Armstrong");
        }
    }    
}
