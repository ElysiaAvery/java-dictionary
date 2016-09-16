import java.util.List;
import java.util.ArrayList;

public class Definition {
  private String mUserDefinition;
  private static List<Definition> definitions = new ArrayList<Definition>();
  private int mId;

  public Definition(String userDefinition) {
    mUserDefinition = userDefinition;
    definitions.add(this);
    mId = definitions.size();
  }

  public String getUserDefinition() {
    return mUserDefinition;
  }

  public static List<Definition> all() {
    return definitions;
  }

  public static void clear() {
    definitions.clear();
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    return definitions.get(id - 1);
  }

}
