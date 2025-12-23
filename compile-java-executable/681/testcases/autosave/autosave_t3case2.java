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
		tg.wait("ele_searchforp640", ComparisonType.IS_VISIBLE);
		tg.click("ele_searchforp640", 1);
		tg.wait("ele_searchforp640", ComparisonType.IS_VISIBLE);
		tg.type("ele_searchforp640", "winter jackets for men");
		tg.wait("ele_winterjack526", ComparisonType.IS_VISIBLE);
		tg.click("ele_winterjack526", 1);
		tg.wait("ele_imgtgwebco589", ComparisonType.IS_VISIBLE);
		tg.click("ele_imgtgwebco589", 1);
		tg.switchToTab(1);
		tg.wait("ele_httprukmin914", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_httprukmin914", 1);
		tg.wait("ele_httpsrukmi562", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_httpsrukmi562", 1);
		tg.wait("ele_enterdeliv701", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_enterdeliv701", 1);
		tg.wait("ele_enterdeliv701", ComparisonType.IS_VISIBLE, 1);
		tg.type("ele_enterdeliv701", "395010");
		tg.wait("ele_check601", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_check601", 1);
		tg.wait("ele_buynow446", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_buynow446", 1);
		tg.close();
	}
}