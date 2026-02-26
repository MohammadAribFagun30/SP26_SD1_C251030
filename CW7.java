import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CW7 {
    
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

        System.out.println("->Counting Even and Odd number of an Array ");
        int count_even = 0;
        int count_odd = 0;

        for(int x:arr)
        {
            if(x%2==0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
        }
        System.out.println("Even numbers are : "+count_even);
        System.out.println("Odd numbers are : "+count_odd);

    }
    
}
