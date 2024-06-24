public class DemoA{
    public static void main(String[] args) {
    int x = 8;
    int y = 5;
    int ans1 = ++y + x++;
    int ans2 = --y + y--;
    System.out.println(x);
    System.out.println(y);
    System.out.println(ans1);
    System.out.println(ans2);
    }
}