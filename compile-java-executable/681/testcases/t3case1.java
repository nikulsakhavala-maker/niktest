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
		tg.wait("ele_emailorpho567", ComparisonType.IS_VISIBLE);
		tg.type("ele_emailorpho567", "user@gmail.com");
		tg.wait("ele_password312", ComparisonType.IS_VISIBLE);
		tg.click("ele_password312", 1);
		tg.wait("ele_password312", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_password312", "eeNxDl6//RzOJBxUyt8Q4Q==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.wait("ele_login252", ComparisonType.IS_VISIBLE);
		tg.click("ele_login252", 1);
		tg.close();
	}
}