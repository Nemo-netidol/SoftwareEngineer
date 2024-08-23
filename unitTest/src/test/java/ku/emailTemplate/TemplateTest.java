package ku.emailTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateTest {

    @Test
    void testTemplateOneVariable() {
        Template template = new Template("Hello, ${name}");
        template.setVariable("name", "Reader");
        String result = template.evaluate();

        assertEquals("Hello, Reader", result);
    }


    @Test
    void testTemplatedifferentVariable() {
        Template template = new Template("${greeting}, ${name}");
        template.setVariable("greeting", "Hi");
        template.setVariable("name", "John");
        String result = template.evaluate();

        assertEquals("Hi, John", result);
    }

}
