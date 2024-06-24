import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

class DemoJ{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String str = obj.nextLine();
        System.out.println(str);


        // BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        
        // String str1 = br1.readLine();
        // System.out.println("String 1: "+str1);
        // System.out.println(str1);

        // br1.close();

        // String str2 = br2.readLine();
        // System.out.println("String 2: "+str2);

        // System.out.print("Enter a Name: ");
        // String Name1 = br.readLine();

        // System.out.print("Enter a Secend Name: ");
        // String Name2 = br.readLine();
        
        // System.out.print("Enter a Age Name: ");
        // int Age = Integer.parseInt(br.readLine());

        // System.out.print("Float value: ");
        // float data = Float.parseFloat(br.readLine());

        // System.out.print("Char value: ");
        // char ch = (char)br.read();
        // System.out.println(ch);

        // Scanner obj = new Scanner(System.in);
        // System.out.print("Enter a Input Company: ");
        // String Company = obj.next();
        // System.out.print("Enter Package: ");
        // int  Package = obj.nextInt();

    //     int N = 1;
    //     char ch = 'A';
    //     for(int i = 1; i <= 3; i++){
    //         for(int j = 1; j <= 4; j++){
    //             if(j%2 == 1){
    //                 System.out.print(ch +" ");
    //             }else{
    //                 System.out.print(N +" ");
    //             }
                
    //         }
    //         System.out.println();
    //     }

    // int ch = 65;
    // switch (ch) {
    //     case "A":
    //     System.out.println("A");
    //         break;
    //     case 65:
    //     System.out.println("Number");
    //     default:
    //         break;
    // }
    }
}