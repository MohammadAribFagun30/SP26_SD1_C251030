import java.util.ArrayList;
import java.util.Scanner;

public class CW5 {

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
        System.out.println("Search this element : ");
        int element = sc.nextInt();

        if (arr.contains(element)) {
            System.out.println("Foun it !!");
        } else {
            System.out.println("Did not found it and try again !!");
        }

    }
}
