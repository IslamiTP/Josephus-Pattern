import java.util.Scanner;

public class Josephus {
    // Recursive function to find the survivor's position
    public static int josephus(int n) {
        // Display the current value of n on each function call
        System.out.println("Function call with n = " + n);
        
        // Base case: If there's only one person, they're the survivor
        if (n == 1) {
            return 1;
        }
        // Recursive case: Return the survivor's position for a smaller group, adjusted for the current circle
        return (josephus(n - 1) + 1) % n + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the value of n
        System.out.print("Enter the number of people (n): ");
        int n = scanner.nextInt();
        
        // Find and display the survivor's position
        int survivor = josephus(n);
        System.out.println("The position of the survivor is: " + survivor);
        
        scanner.close();
    }
}
