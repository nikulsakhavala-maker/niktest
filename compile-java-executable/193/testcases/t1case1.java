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
		tg.wait("ele_firstname817", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_firstname817", 1);
		tg.wait("ele_firstname817", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_firstname817", "nikul");
		tg.wait("ele_lastname973", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_lastname973", 1);
		tg.wait("ele_lastname973", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_lastname973", "sakhavala");
		tg.wait("ele_textarea412", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_textarea412", 1);
		tg.wait("ele_textarea412", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_textarea412", "123, radhe park society");
		tg.wait("ele_emailemail126", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_emailemail126", 1);
		tg.wait("ele_emailemail126", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_emailemail126", "test@gmail.com");
		tg.wait("ele_checkbox887", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_checkbox887", 1);
		tg.wait("ele_checkbox045", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_checkbox045", 1);
		tg.close();
	}
}