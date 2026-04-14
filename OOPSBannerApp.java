import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Create patterns for characters
    public static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        return map;
    }

    // Print banner dynamically
    public static void printBanner(String text) {

        Map<Character, String[]> patterns = getPatterns();

        int height = 7;

        for (int i = 0; i < height; i++) {

            for (char ch : text.toCharArray()) {
                System.out.print(patterns.get(ch)[i] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}