package SolverDesignSearch;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner {

    ChromeDriver chromeDriver;
    Search search;
    FindLink findLink;
    Scroll scroll;
    SolverVideos solverVideos;


    @BeforeClass
    public static void browserSetUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Administrator\\Desktop\\Selenium drivers\\chromedriver.exe");
    }

    @Before
    public void setUp() {
        System.out.println("Google");

        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        search = new Search(chromeDriver);
        findLink = new FindLink(chromeDriver);
        scroll = new Scroll(chromeDriver);
        solverVideos = new SolverVideos(chromeDriver);
    }

    @Test
    public void test1() throws InterruptedException {

       boolean answer;

        search.getTextfield();
        search.fillTheSearchText("Christmas Fruit tablets graphic design and 3d,2d animation");
        search.searchButtonClick();

        //Page 1
        for (int i = 0; i<8; i++) {

            answer = findLink.solverDesign();

            if (answer == true) {
                findLink.neededLinkClick();
            } else findLink.goToNextPage();
        }

        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://www.solver.tv/"));
    }

    @Test
    public void test2 () throws InterruptedException {

        search.getTextfield();
        search.fillTheSearchText("Solver.tv");
        search.searchButtonClick();

        findLink.solverDesign();
        findLink.neededLinkClick();

        scroll.down();
        solverVideos.video2HeatingSystemClick();

        scroll.down();
        scroll.down();

        solverVideos.video7WomenTimeClick();

    }

    @After
    public void closeBrowser() throws InterruptedException {
        if (chromeDriver != null) {
            Thread.sleep(2000);
            chromeDriver.quit();
        }
    }
}
