import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int first = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int third = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);
        Collections.sort(numbers);
        Object[] num = numbers.toArray(); 

        if (num[0].equals(num[1]) && num[1].equals(num[2])){
            System.out.println("All numbers are equal");
        }
        // else if (num[0].equals(num[1]) || num[1].equals(num[2])){     // optional   
        //     System.out.println("Two numbers are equal");
        // }
        else{
            System.out.println("The Largest number is: " + (num[num.length - 1]));
        }
        

    }

}