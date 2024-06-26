public class codeL {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Shubham");
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
        str1.append("Khalane");
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
    }
}
