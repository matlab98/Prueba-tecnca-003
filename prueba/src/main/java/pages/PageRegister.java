package pages;

import business.InternalAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageRegister {
    @FindBy(how = How.XPATH, using = "//ul/li/a[@class='unauthenticated-nav-bar__sign-up']")
    private WebElement joinToday;

    @FindBy(how = How.ID, using = "firstName")
    private WebElement txtFirstName;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement txtLastName;

    @FindBy(how = How.ID, using = "email")
    private WebElement txtEmail;

    @FindBy(how = How.ID, using = "birthMonth")
    private WebElement chkMonth;

    @FindBy(how = How.ID, using = "birthDay")
    private WebElement chkDay;

    @FindBy(how = How.ID, using = "birthYear")
    private WebElement chkYear;

    @FindBy(how = How.XPATH, using = "//div/a[@class='btn btn-blue']")
    private WebElement btnNext1;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    private WebElement txtCity;

    @FindBy(how = How.XPATH, using = "//input[@id='zip']")
    private WebElement txtCode;

    @FindBy(how = How.XPATH, using = "//div[@name='countryId']")
    private WebElement txtCountry;

    @FindBy(how = How.XPATH, using = "//div/a[@class='btn btn-blue pull-right']")
    private WebElement btnNext2;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select Brand']")
    private WebElement txtBrand;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select a Model']")
    private WebElement txtModel;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select OS']")
    private WebElement txtOs;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select a Version']")
    private WebElement txtVersion;

    @FindBy(how = How.XPATH, using = "//div/div[@placeholder='Select OS language']")
    private WebElement btnOsLanguage;

    @FindBy(how = How.XPATH, using = "//div/a[@aria-label='Next - final step']")
    private WebElement btnNext3;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='confirmPassword']")
    private WebElement txtConfirmPass;

    @FindBy(how = How.XPATH, using = "//span[@class='checkmark signup-consent__checkbox error']")
    private WebElement checkConsent;

    @FindBy(how = How.XPATH, using = "//div/a[@aria-label='Complete Setup']")
    private WebElement btnNext4;

    public void clicBtnRegister(InternalAction internalAction) {
        internalAction.waitElementClickable(joinToday, 5);
    }

    public void setTxtUser(InternalAction internalAction, String user) {
        internalAction.waitElementClickable(txtFirstName, 5);
        internalAction.sendText(txtFirstName, user);
    }

}
