import java.util.Random;
public class RandomPasswordGenerator {
    public static void main(String[] args) {
        // Create a new Random object
        Random random = new Random();
        // Generate a random password
        String password = "";
        for (int i = 0; i < 8; i++) {
            // Generate a random character
            char character = (char) (random.nextInt(26) + 'a');
            // Add the character to the password
            password += character;
        }
        // Print the password to the console
        System.out.println(password);
    }
}