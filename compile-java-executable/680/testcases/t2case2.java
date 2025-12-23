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
		tg.close();
	}
}