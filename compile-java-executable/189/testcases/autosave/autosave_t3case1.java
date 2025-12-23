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
public class t3case1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void t3case1() {
		tg.openBrowser();
		tg.wait("ele_firstname738", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_firstname738", 1);
		tg.wait("ele_firstname738", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_firstname738", "wefewfef");
		tg.wait("ele_lastname507", ComparisonType.IS_VISIBLE);
		tg.click("ele_lastname507", 1);
		tg.wait("ele_textarea807", ComparisonType.IS_VISIBLE);
		tg.click("ele_textarea807", 1);
		tg.wait("ele_textarea807", ComparisonType.IS_VISIBLE);
		tg.type("ele_textarea807", "ergergregregergre");
		tg.wait("ele_male627", ComparisonType.IS_VISIBLE);
		tg.click("ele_male627", 1);
		tg.close();
	}
}