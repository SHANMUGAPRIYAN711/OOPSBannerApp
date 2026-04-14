public class OOPSBannerApp {
    public static void main(String[] args) {
        printBanner();
    }

    // Method to return banner pattern
    public static String[] getBanner() {
        return new String[]{
            " *****   *****   *****   ***** ",
            "*     * *     * *     * *     *",
            "*     * *     * *     * *     *",
            "*     * *     * *****   ***** ",
            "*     * *     * *       *     ",
            "*     * *     * *       *     ",
            " *****   *****   *       ***** "
        };
    }

    // Method to print banner
    public static void printBanner() {
        for (String line : getBanner()) {
            System.out.println(line);
        }
    }
}
