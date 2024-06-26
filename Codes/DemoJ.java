public class DemoJ {
    public static void main(String[] args) {
        String str1 = "Mau";
        String str2 = new String("Mau");

        if(str1.toString() == str2.toString()){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

    }
}
