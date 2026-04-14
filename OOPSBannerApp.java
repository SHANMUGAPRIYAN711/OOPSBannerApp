public class OOPSBannerApp {
  public static void main(String[] args) {
    //direct inline usage
            for (String line : new String[]{
            " *****   *****   *****   ***** ",
            "*     * *     * *     * *     *",
            "*     * *     * *     * *     *",
            "*     * *     * *****   ***** ",
            "*     * *     * *       *     ",
            "*     * *     * *       *     ",
            " *****   *****   *       ***** "
        }) {
            System.out.println(line);
        }
  }
}
