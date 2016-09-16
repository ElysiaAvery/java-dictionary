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

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("dog");
    Word secondWord = new Word("cat");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void getId_wordsInstantiateWithAnId_1() {
    Word testWord = new Word("dog");
    assertEquals(1, testWord.getId());
  }

  @Test
  public void find_returnsWordWithSAmeId_SecondWord() {
    Word firstWord = new Word("dog");
    Word secondWord = new Word("cat");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

  @Test
  public void getDefintions_initiallyReturnsEmptyList_ArrayList() {
    Word testWord = new Word("dog");
    assertEquals(0, testWord.getDefintions().size());
  }

  @Test
  public void addDefintion_addsDefinitionsToList_true() {
    Word testWord = new Word("dog");
    Definition testDefinition = new Definition("a mammal...");
    testWord.addDefintion(testDefinition);
    assertTrue(testWord.getDefintions().contains(testDefinition));
  }
}
