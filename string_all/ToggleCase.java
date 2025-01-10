
package string_all;
public class ToggleCase {

    public static void main(String[] args) {
        // Input string
        String input = "AbCs";

        // Call the function to toggle case and print the result
        String result = toggleCase(input);
        System.out.println(result); // Output: aBcS
    }

    // Function to toggle the case of all characters in a string
    public static String toggleCase(String str) {
        // StringBuilder to construct the output string
        StringBuilder toggledString = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : str.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                // Convert to lowercase and append to the result
                toggledString.append(Character.toLowerCase(ch));
            } 
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                // Convert to uppercase and append to the result
                toggledString.append(Character.toUpperCase(ch));
            } 
            // If it's not a letter (optional handling for non-alphabetic characters)
            else {
                toggledString.append(ch);
            }
        }

        // Return the final toggled string
        return toggledString.toString();
    }
}

