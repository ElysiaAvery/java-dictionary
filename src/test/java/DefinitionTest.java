import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class DefinitionTest {

  @After
  public void tearDown() {
    Definition.clear();
  }

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("a mammal...");
    assertTrue(testDefinition instanceof Definition);
  }

  @Test
  public void getUserDefinition_definitionInstantiatesWithUserDefinition_Dog() {
    Definition testDefinition = new Definition("a mammal...");
    assertEquals("a mammal...", testDefinition.getUserDefinition());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("a mammal...");
    Definition secondDefinition = new Definition("a domesticated mammal...");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void getId_definitionsInstantiateWithAnId_1() {
    Definition testDefinition = new Definition("a mammal...");
    assertEquals(1, testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSAmeId_SecondDefinition() {
    Definition firstDefinition = new Definition("a mammal...");
    Definition secondDefinition = new Definition("a domesticated mammal...");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }
}
