package business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InternalAction {
    private WebDriver driver;

    public void waitElementVisible(WebElement element, int milisegundos) {
        WebDriverWait wait = new WebDriverWait(this.driver, (long) milisegundos / 1000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementClickable(WebElement element, int milisegundos) {
        WebDriverWait wait = new WebDriverWait(this.driver, (long) milisegundos / 1000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void sendText(WebElement element, String text) {
        element.sendKeys(text);
    }
}
