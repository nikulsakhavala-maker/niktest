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
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class t1case1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void t1case1() {
		tg.openBrowser();
		tg.wait("ele_firstname453", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_firstname453", 1);
		tg.wait("ele_firstname453", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_firstname453", "hdhfghfgh");
		tg.wait("ele_lastname998", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_lastname998", 1);
		tg.wait("ele_lastname381", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_lastname381", 1);
		tg.wait("ele_lastname381", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_lastname381", "tyjytjytj");
		tg.wait("ele_textareatgwebcomma875", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_textareatgwebcomma875", 1);
		tg.wait("ele_textareatgwebcomma903", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_textareatgwebcomma903", 1);
		tg.wait("ele_textareatgwebcomma903", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_textareatgwebcomma903", "tyjtyjytjytjytj");
		tg.wait("ele_emailemail442", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_emailemail442", 1);
		tg.wait("ele_emailemail442", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_emailemail442", "tyjtyjytjtyjyt");
		tg.close();
	}
}