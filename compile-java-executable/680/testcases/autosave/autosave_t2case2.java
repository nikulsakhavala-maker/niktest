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
public class t2case2 {

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
}