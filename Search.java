package SolverDesignSearch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Search {

    private ChromeDriver chromeDriver;
    private WebDriverWait wait;

    public Search(ChromeDriver chromeDriver) {

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);
    }

    //Google page's elements
    @FindBy(xpath = "//*[@id=\"lst-ib\"]")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")
    private WebElement searchButton;


    public void getTextfield() {
        searchField.click();
    }

    public void fillTheSearchText(String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void searchButtonClick() {
        searchButton.click();
    }
}
