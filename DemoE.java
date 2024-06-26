import java.util.Scanner;

public class DemoE {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][];

        arr[0]= new int[3];
        arr[1]= new int[2];
        arr[2]= new int[1];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
                for(int[] x:arr){
                    for(int[] y:arr){
                        System.out.print(arr[i][j]);
                    }
                }
            }
        }
        System.out.println();
    }
}
