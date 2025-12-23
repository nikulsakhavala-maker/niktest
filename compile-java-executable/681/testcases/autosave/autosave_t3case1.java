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
		tg.wait("ele_searchforp475", ComparisonType.IS_VISIBLE);
		tg.click("ele_searchforp475", 1);
		tg.wait("ele_searchforp475", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_searchforp475", "smartwatch");
		tg.wait("ele_smartwatch021", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_smartwatch021", 1);
		tg.wait("ele_imgtgwebco336", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_imgtgwebco336", 1);
		tg.switchToTab(1);
		tg.wait("ele_off745", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_off745", 1);
		tg.wait("ele_enterdeliv090", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_enterdeliv090", 1);
		tg.wait("ele_enterdeliv090", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_enterdeliv090", "395010");
		tg.wait("ele_check037", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_check037", 1);
		tg.wait("ele_addtocart990", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_addtocart990", 1);
		tg.close();
	}
}