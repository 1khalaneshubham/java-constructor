public class DemoK {
    public static void main(String[] args) {
        String str1 = "Shubham";
        String str2 = new String("Shubham");
        String str3 = "Khalane";
        String str4 = new String("Khalane");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        
        System.out.println("++++");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        
        System.out.println("++++");
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println("++++");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
