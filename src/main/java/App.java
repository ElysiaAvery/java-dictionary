import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.List;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/words.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/word-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("words/:id/definitions/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Word userWord = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", userWord);
      model.put("template", "templates/word-definition.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/words", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String userWord = request.queryParams("word");
      Word newWord = new Word(userWord);
      model.put("template", "templates/word-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/definitions", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("definitions", Definition.all());
      model.put("template", "templates/definition.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/definitions", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Word word = Word.find(Integer.parseInt(request.queryParams("wordId")));
      String userInput = request.queryParams("userInput");
      Definition newDefinition = new Definition(userInput);
      word.addDefinition(newDefinition);
      model.put("word", word);
      model.put("template", "templates/word-definitions-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // get("/definitions/:id", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   Definition definition = Definition.find(Integer.parseInt(request.params(":id")));
    //   model.put("definition", definition);
    //   model.put("template", "templates/definition.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());


    get("/words/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Word userWord = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", userWord);
      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

}
