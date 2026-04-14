class CharacterPattern{
  char character;
  String[] pattern;
  CharacterPattern(char character, String[] pattern){
    this.character = character;
    this.pattern = pattern;
  }
  public void printPattern(){
    for(String line : pattern){
      System.out.println(line);
    }
  }
}
public class OOPSBannerApp {
    public static void main(String[] args) {
      String[] pattern = {
        " ***** ",
        "*     *",
        "*     *",
        "*     *",
        "*     *",
        "*     *",
        " ***** "
      };
      CharacterPattern c = new CharacterPattern('O', pattern);
      c.printPattern();
    }
}
