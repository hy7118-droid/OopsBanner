public class OOPSBannerUC7 {

    // Static Inner Class
    static class CharacterPattern {
        char character;
        String[] pattern;

        // Constructor
        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create objects for each character
        CharacterPattern O = new CharacterPattern('O', new String[]{
            " *** ",
            "*     *",
            "*     *",
            "*     *",
            " *** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "** ",
            "*     *",
            "** ",
            "*      ",
            "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " *** ",
            "*      ",
            " *** ",
            "      *",
            " *** "
        });

        // Store in array (OOPS)
        CharacterPattern[] word = {O, O, P, S};

        // Print banner row by row
        for (int i = 0; i < O.getPattern().length; i++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}
