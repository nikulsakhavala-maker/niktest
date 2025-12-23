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
		tg.wait("ele_searchamaz698", ComparisonType.IS_VISIBLE);
		tg.click("ele_searchamaz698", 1);
		tg.wait("ele_searchamaz698", ComparisonType.IS_VISIBLE);
		tg.type("ele_searchamaz698", "iphone 17 pro max 1TB");
		tg.wait("ele_input0radi424", ComparisonType.IS_VISIBLE);
		tg.click("ele_input0radi424", 1);
		tg.wait("ele_input1radi242", ComparisonType.IS_VISIBLE);
		tg.click("ele_input1radi242", 1);
		tg.wait("ele_boldfitful643", ComparisonType.IS_VISIBLE);
		tg.click("ele_boldfitful643", 1);
		tg.close();
	}
}