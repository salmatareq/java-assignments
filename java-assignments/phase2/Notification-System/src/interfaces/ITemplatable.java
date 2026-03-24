package interfaces;

import java.util.Map;

public interface ITemplatable {

    public void renderTemplate(String templateName, Map<String, String> vars);
}
