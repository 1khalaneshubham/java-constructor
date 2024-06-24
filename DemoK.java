public class DemoK {
    int x = 10;
    static int y = 20;

    void fun(){
        System.out.println("In fun method");
    }

    static void Gun(){
        System.out.println("In Gun Method");
    }

    public static void main(String[] args) {
        
        DemoK obj1 = new DemoK();

        System.out.println(obj1.x);
        System.out.println(y);

        obj1.fun();
        Gun();

    }
}
