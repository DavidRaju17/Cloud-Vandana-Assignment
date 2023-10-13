import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();
        
        Set<Character> letterSet = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterSet.add(c);
            }
        }
        return letterSet.size() == 26;
    }
}
