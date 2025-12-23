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
public class t5case1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void t5case1() {
		tg.openBrowser();
		tg.wait("ele_search137", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_search137", "new song 2025");
		tg.wait("ele_background995", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_background995", 1);
		tg.wait("ele_skip046", ComparisonType.IS_VISIBLE);
		tg.click("ele_skip046", 1);
		tg.wait("ele_element292", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_element292", 1);
		tg.wait("ele_element196", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_element196", 1);
		tg.wait("ele_divtgwebco220", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_divtgwebco220", 1);
		tg.wait("ele_divtgwebco118", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_divtgwebco118", 1);
		tg.wait("ele_identifier800", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_identifier800", 1);
		tg.wait("ele_identifier800", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_identifier800", "user@gmail.com");
		tg.close();
	}
}