import java.util.Scanner;

public class CW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in LowerCase: ");
        String str1 = sc.nextLine();

        System.out.println("Converting to UpperCase");
        str1 = str1.toUpperCase();
        System.out.println(str1);

         System.out.print("Enter a string in UpperrCase: ");
        String str2 = sc.nextLine();

        System.out.println("Converting to LowerCase :");
        str2 = str2.toLowerCase();
        System.out.println(str2);



    }


    
}
