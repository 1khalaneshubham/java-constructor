public class Demol {

    int x = 10;
    static int y = 20;

    void fun(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        
        Demol obj = new Demol();
        obj.fun();
        
        System.out.println(obj.x);
        System.out.println(y);
    }
}
