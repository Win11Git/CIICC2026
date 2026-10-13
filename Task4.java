import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Enter a word or number if palindrome");
        Scanner p = new Scanner(System.in);
        String pal = p.nextLine();
        String space = pal.replace(" ", "");
        String palindrome = new StringBuilder(space).reverse().toString();
        
        if (space.equalsIgnoreCase(palindrome))
            System.out.println("The input string is a palindrome.");
        else
            System.out.println("The input string is not a palindrome.");

    }
    
}
