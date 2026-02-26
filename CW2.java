import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CW2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter Size Of Array : ");
        int s = sc.nextInt();

        System.out.println("Take the element of Array :");
        for (int i = 0; i < s; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Array List is : ");
        System.out.println(arr);

        int largest = Collections.max(arr);
        System.out.print("Largest Number Of Array is : " + largest);

    }
}
