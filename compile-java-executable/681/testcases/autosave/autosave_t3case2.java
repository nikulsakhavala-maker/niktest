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
public class t3case2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void t3case2() {
		tg.openBrowser();
		tg.wait("ele_searchamaz582", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_searchamaz582", 1);
		tg.wait("ele_searchamaz582", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_searchamaz582", "winter jackets for men");
		tg.switchToTab(1);
		tg.wait("ele_quantity443", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_quantity443", 1);
		tg.wait("ele_atgwebcomm297", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_atgwebcomm297", 1);
		tg.wait("ele_addtocartb546", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_addtocartb546", 1);
		tg.wait("ele_proceedtor308", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_proceedtor308", 1);
		tg.wait("ele_apemaillog861", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_apemaillog861", 1);
		tg.wait("ele_apemaillog861", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_apemaillog861", "test@gmail.com");
		tg.wait("ele_submitcont036", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_submitcont036", 1);
		tg.wait("ele_pleaseenab473", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_pleaseenab473", 1);
		tg.wait("ele_password192", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_password192", 1);
		tg.wait("ele_signinsubm097", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_signinsubm097", 1);
		tg.close();
	}
}