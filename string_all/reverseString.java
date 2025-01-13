package string_all;

public class reverseString {
    public static String reverseWords(String s) {
        // Step 1: Trim the input string to remove leading and trailing spaces
        s = s.trim();

        // Step 2: Split the string into words based on one or more spaces
        String[] words = s.split("\\s+");

        // Step 3: Initialize an empty string to construct the reversed string
        String reversed = "";

        // Step 4: Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i]; // Concatenate the current word
            if (i > 0) {
                reversed += " "; // Add a space between words, but not at the end
            }
        }

        // Step 5: Return the reversed string
        return reversed;
    }

    public static void main(String[] args) {
        String input = "  i like   this program very much  ";
        String output = reverseWords(input);
        System.out.println(output);  // Output: "much very program this like i"
    }
}
