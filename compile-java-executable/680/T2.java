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
public class T2 {

    public static int var_ROLLNO = 7;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void t2case1() {
        tg.openBrowser();
        tg.wait("ele_registerad912", ComparisonType.IS_VISIBLE);
        tg.click("ele_registerad912", 1);
        tg.wait("ele_firstname745", ComparisonType.IS_VISIBLE);
        tg.click("ele_firstname745", 1);
        tg.wait("ele_firstname745", ComparisonType.IS_VISIBLE);
        tg.type("ele_firstname745", "fghgfnfgn");
        tg.wait("ele_lastname165", ComparisonType.IS_VISIBLE);
        tg.click("ele_lastname165", 1);
        tg.wait("ele_lastname779", ComparisonType.IS_VISIBLE);
        tg.click("ele_lastname779", 1);
        tg.wait("ele_lastname779", ComparisonType.IS_VISIBLE);
        tg.type("ele_lastname779", "fgngnhnghmhgm");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void t2case2() {
        tg.openBrowser();
        tg.wait("ele_firstname728", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_firstname728", 1);
        tg.wait("ele_firstname728", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_firstname728", "nikul");
        tg.wait("ele_lastname224", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_lastname224", 1);
        tg.wait("ele_lastname224", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_lastname224", "sakhavala");
        tg.wait("ele_textareatgwebcomma046", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_textareatgwebcomma046", 1);
        tg.wait("ele_textareatgwebcomma046", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_textareatgwebcomma046", "123, radhe park society");
        tg.wait("ele_emailemail302", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_emailemail302", 1);
        tg.wait("ele_emailemail302", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_emailemail302", "test@gmail.com");
        tg.close();
    }

    public static void function1() {
        tg.wait("ele_searchamaz318", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_searchamaz318", 1);
        tg.wait("ele_searchamaz318", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_searchamaz318", "SMARTPHONE");
        tg.wait("ele_under724", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_under724", 1);
        tg.wait("ele_samsunggal007", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_samsunggal007", 1);
        tg.switchToTab(1);
        tg.wait("ele_inputtgweb414", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_inputtgweb414", 1);
        tg.wait("ele_inputtgweb098", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_inputtgweb098", 1);
        tg.wait("ele_inputtgweb171", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_inputtgweb171", 1);
        tg.wait("ele_buynowbutt618", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_buynowbutt618", 1);
    }

    public static void function2() {
        tg.wait("ele_searchforp943", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_searchforp943", 1);
        tg.wait("ele_searchforp943", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_searchforp943", "shoes");
        tg.wait("ele_shoesforme629", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_shoesforme629", 1);
        tg.wait("ele_imgtgwebco190", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_imgtgwebco190", 1);
        tg.switchToTab(1);
        tg.wait("ele_addtocart790", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_addtocart790", 1);
    }

    public static void functiont1() {
        tg.wait("ele_registerad912", ComparisonType.IS_VISIBLE);
        tg.click("ele_registerad912", 1);
        tg.wait("ele_firstname745", ComparisonType.IS_VISIBLE);
        tg.click("ele_firstname745", 1);
        tg.wait("ele_firstname745", ComparisonType.IS_VISIBLE);
        tg.type("ele_firstname745", "fghgfnfgn");
        tg.wait("ele_lastname165", ComparisonType.IS_VISIBLE);
        tg.click("ele_lastname165", 1);
        tg.wait("ele_lastname779", ComparisonType.IS_VISIBLE);
        tg.click("ele_lastname779", 1);
        tg.wait("ele_lastname779", ComparisonType.IS_VISIBLE);
        tg.type("ele_lastname779", "fgngnhnghmhgm");
    }
}
