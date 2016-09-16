import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
  }

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("dog");
    assertTrue(testWord instanceof Word);
  }

  @Test
  public void getUserWord_wordInstantiatesWithUserWord_Dog() {
    Word testWord = new Word("dog");
    assertEquals("dog", testWord.getUserWord());
  }
}
