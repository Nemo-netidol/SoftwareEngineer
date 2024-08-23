package ku.emailTemplate;

public class Template {

    private String variableValue;
    private String templateText;
    
    public Template(String templateText) {
        this.templateText = templateText;
    }

    public void setVariable(String variable, String value) {
        this.variableValue = value;

    }

    public String evaluate() {
        return templateText.replaceAll("\\$\\{name\\}", variableValue);
    }
}
