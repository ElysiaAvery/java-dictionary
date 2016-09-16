import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mUserWord;
  private static List<Word> words = new ArrayList<Word>();

  public Word(String userWord) {
    mUserWord = userWord;
    words.add(this);
  }

  public String getUserWord() {
    return mUserWord;
  }

  public static List<Word> all() {
    return words;
  }

  public static void clear() {
    words.clear();
  }

}
