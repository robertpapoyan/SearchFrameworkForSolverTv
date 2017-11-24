package SolverDesignSearch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SolverVideos {

    private ChromeDriver chromeDriver;
    private WebDriverWait wait;

    public SolverVideos (ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);

    }

    //Construction services
    @FindBy(xpath = "//*[@id=\"mep_0\"]/div/div[2]/div[4]/div")
    private WebElement video1;

    //Heating system
    @FindBy(xpath = "//*[@id=\"mep_1\"]/div/div[2]/div[4]/div")
    private WebElement video2;

    //Heating system service
    @FindBy(xpath = "//*[@id=\"mep_2\"]/div/div[2]/div[4]/div")
    private WebElement video3;

    //TV ADD BREAK
    @FindBy(xpath = "//*[@id=\"mep_3\"]/div/div[2]/div[4]/div")
    private WebElement video4;

    //TV ADD BREAK(Pencil)
    @FindBy(xpath = "//*[@id=\"mep_4\"]/div/div[2]/div[4]/div")
    private WebElement video5;

    //TV ADD BREAK(Arrow)
    @FindBy(xpath = "//*[@id=\"mep_5\"]/div/div[2]/div[4]/div")
    private WebElement video6;

    //WOMEN’ Time
    @FindBy(xpath = "//*[@id=\"mep_6\"]/div/div[2]/div[4]/div")
    private WebElement video7;

    //Patent
    @FindBy(xpath = "//*[@id=\"mep_7\"]/div/div[2]/div[4]/div")
    private WebElement video8;

    //TV program ID
    @FindBy(xpath = "//*[@id=\"mep_8\"]/div/div[2]/div[4]/div")
    private WebElement video9;

    //Big Games Show
    @FindBy(xpath = "//*[@id=\"mep_9\"]/div/div[2]/div[4]/div")
    private WebElement video10;

    //Christmas
    @FindBy(xpath = "//*[@id=\"mep_10\"]/div/div[2]/div[4]/div")
    private WebElement video11;

    //Water Meter
    @FindBy(xpath = "//*[@id=\"mep_11\"]/div/div[2]/div[4]/div")
    private WebElement video12;

    //Fruit tablets
    @FindBy(xpath = "//*[@id=\"mep_12\"]/div/div[2]/div[4]/div")
    private WebElement video13;

    //Water
    @FindBy(xpath = "//*[@id=\"mep_13\"]/div/div[2]/div[4]/div")
    private WebElement video14;

    //Beauty Salon
    @FindBy(xpath = "//*[@id=\"mep_14\"]/div/div[2]/div[4]/div")
    private WebElement video15;

    /**Videos click methods**/

    public void video1ConstructionServicesClick () {
        video1.click();
    }

    public void video2HeatingSystemClick () {
        video2.click();
    }

    public void video3HeatingSystemServiceClick () {
        video3.click();
    }

    public void video4TvAddBreakClick () {
        video4.click();
    }

    public void video5TvAddBreakPencilClick () {
        video5.click();
    }

    public void video6TvAddBreakArrowClick () {
        video6.click();
    }

    public void video7WomenTimeClick () {
        video7.click();
    }

    public void  video8PatentClick () {
        video8.click();
    }

    public void video9TvProgramIdClick () {
        video9.click();
    }

    public void video10BigGamesShowClick () {
        video10.click();
    }

    public void video11ChristmasClick () {
        video11.click();
    }

    public void video12WaterMeterClick () {
        video12.click();
    }

    public void video13FruitTabletsClick () {
        video13.click();
    }

    public void video14WaterClick () {
        video14.click();
    }

    public void video15BeautySalon () {
        video15.click();
    }

}
