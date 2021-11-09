package Runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features",
        tags = {"@Creacion"},
        glue = "C:\\Users\\hilde\\Desktop\\Sync\\prueba\\src\\test\\java\\stepdefinition\\StepsDefinitionCreate.java"

)

public class RegisterRunner {

}
