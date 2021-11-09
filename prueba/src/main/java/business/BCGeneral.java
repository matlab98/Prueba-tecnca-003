package business;

import dto.PropertiesDTO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BCGeneral {

    public WebDriver driver;
    private PropertiesDTO propertiesDTO;

    public BCGeneral(PropertiesDTO propertiesDTO) {
        this.propertiesDTO = propertiesDTO;
    }

    public void iniciarAplicacion(String baseUrl) {
        try {
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();

            driver.get(baseUrl);
        } catch (Exception e) {
System.out.println(e);

        }
    }
}
