package utilty;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hook {

    public static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\IdeaProjects\\owner\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();



    }

    @After
    public void afterscenario(Scenario scenario)

    {

    driver.close();

    }



    }



