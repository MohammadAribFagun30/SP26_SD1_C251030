import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CW6 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter Size Of Array : ");
        int s = sc.nextInt();

        System.out.println("Take the element of Array :");
        for (int i = 0; i < s; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Array List is : ");
        System.out.println(arr);

        System.out.println("Sorting the Array in Ascending order : ");
        Collections.sort(arr);
        System.out.println(arr);

    }
    
}
