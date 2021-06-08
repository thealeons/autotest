import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;


public class LeoTest {

    @Test
    public void userCanLoginByUsername(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "90.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("baseUrl", "https://jiratst.rt.ru");
        //Configuration.browserCapabilities = capabilities;
        Configuration.remote = "http://134.0.118.234:4444/wd/hub/";
        Configuration.baseUrl="https://jiratst.rt.ru";
        open("https://jiratst.rt.ru");
        //sleep(10000);
        Selenide.$(By.id("login-form-username")).val("jiraautotest");
        Selenide.$(By.id("login-form-password")).val("Test1234");
        Selenide.$(By.id("login")).click();
    }
}
