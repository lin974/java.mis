import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Initialize Scanner
        String word = scn.next(); // Read user input
        System.out.println("hello, "+word);
        scn.close(); // Close Scanner to prevent resource leaks
    }

}
