public class DemoC {
    public static void main(String[] args) {
        
        // int arr1[][] = new int[2][2];
        // int arr2[] = new int[2];

        // System.out.println(arr1.length);
        // System.out.println(arr2.length);
        // System.out.println();

        int arr[][] = new int[2][2];
        
        arr[0][0] = 10;
        arr[0][1] = 10;
        arr[1][0] = 10;
        arr[1][1] = 10;

        System.out.println(arr[1][1]);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr);
    }
}
