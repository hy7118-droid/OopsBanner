import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        // Create map to store patterns
        Map<Character, String[]> patterns = new HashMap<>();

        // Add patterns to map
        patterns.put('O', new String[]{
            " *** ",
            "*     *",
            "*     *",
            "*     *",
            " *** "
        });

        patterns.put('P', new String[]{
            "** ",
            "*     *",
            "** ",
            "*      ",
            "*      "
        });

        patterns.put('S', new String[]{
            " *** ",
            "*      ",
            " *** ",
            "      *",
            " *** "
        });

        // Word to display
        String word = "OOPS";

        // Call function to print banner
        printBanner(word, patterns);
    }

    // Function to render banner
    public static void printBanner(String word, Map<Character, String[]> patterns) {

        int height = patterns.get(word.charAt(0)).length;

        // Loop row by row
        for (int i = 0; i < height; i++) {

            // Loop through each character in word
            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }
}
