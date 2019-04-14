import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenEbayTest {
    WebDriver wd;


    @Test
    public void openSite() {
        wd = new ChromeDriver();
        wd.navigate().to("http://www.ebay.com/");


    }


}

