package SolverDesignSearch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FindLink {

   private Scroll scroll;
    private ChromeDriver chromeDriver;
    private WebDriverWait wait;
    WebElement link;
    private int index;
    private boolean answer;

    public FindLink(ChromeDriver chromeDriver) {

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);
    }

    //Creating next button element and its click method
    @FindBy(xpath = "//*[@id=\"pnnext\"]/span[2]")
    private WebElement nextPageButton;

    public void nextPageButtonClick() {
        nextPageButton.click();
    }

    public boolean solverDesign() throws InterruptedException {

        List<WebElement> webElements = chromeDriver.findElementsByClassName("r");
        webElements.size();

        for (int i = 0; i < webElements.size(); i++) {
            System.out.println(webElements.get(i).getText());
            System.out.println("_________");
        }

        for (int i = 0; i < webElements.size(); i++) {
            if (webElements.get(i).getText().equals("Solver – 3d animation, VFX, design in motion")) {
                index = i;
                link = webElements.get(i);
                answer = true;
            }
        }

        if (answer != true){
            answer = false;
        }

        return answer;

    }

    public void neededLinkClick(){

        link.click();

    }

    public void goToNextPage() throws InterruptedException {

        scroll = new Scroll(chromeDriver);

        scroll.down();
        scroll.down();
        scroll.down();

        nextPageButtonClick();
    }

}
