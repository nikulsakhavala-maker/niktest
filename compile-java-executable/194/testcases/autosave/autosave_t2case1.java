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
public class t2case1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void t2case1() {
		tg.openBrowser();
		tg.wait("ele_firstname799", ComparisonType.IS_VISIBLE);
		tg.type("ele_firstname799", "rthrthtrhtrhtrh");
		tg.wait("ele_lastname385", ComparisonType.IS_VISIBLE);
		tg.click("ele_lastname385", 1);
		tg.wait("ele_lastname385", ComparisonType.IS_VISIBLE);
		tg.type("ele_lastname385", "rthrthtrh");
		tg.wait("ele_textarea413", ComparisonType.IS_VISIBLE);
		tg.click("ele_textarea413", 1);
		tg.wait("ele_textarea413", ComparisonType.IS_VISIBLE);
		tg.type("ele_textarea413", "rthrthtrhtrhtrh");
		tg.close();
	}
}