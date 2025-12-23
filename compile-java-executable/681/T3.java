import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class T3 {

    public static int var_ROLLNO = 7;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void t3case1() {
        tg.openBrowser();
        tg.wait("ele_searchamaz727", ComparisonType.IS_VISIBLE);
        tg.click("ele_searchamaz727", 1);
        tg.wait("ele_searchamaz727", ComparisonType.IS_VISIBLE);
        tg.type("ele_searchamaz727", "iphone 17 pro max 1 TB");
        tg.switchToTab(1);
        tg.wait("ele_iphone17pr813", ComparisonType.IS_VISIBLE);
        tg.click("ele_iphone17pr813", 1);
        tg.click("ele_addtocart414", 1);
        tg.wait("ele_increasequ641", ComparisonType.IS_VISIBLE);
        tg.click("ele_increasequ641", 1);
        tg.wait("ele_apopovercl964", ComparisonType.IS_VISIBLE);
        tg.click("ele_apopovercl964", 1);
        tg.close();
    }
}
