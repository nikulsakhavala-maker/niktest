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

@Listeners(TestListener.class)
public class BackupTest1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void testingbackupcase() {
        tg.openBrowser();
        tg.wait("ele_emailorpho448", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailorpho448", 1);
        tg.wait("ele_emailorpho448", ComparisonType.IS_VISIBLE);
        tg.type("ele_emailorpho448", "Mukund");
        tg.wait("ele_password718", ComparisonType.IS_VISIBLE);
        tg.click("ele_password718", 1);
        tg.wait("ele_password718", ComparisonType.IS_VISIBLE);
        tg.typeEncrypted("ele_password718", "3drhIPuS/gb9ZOl5v6Bp0Q==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.close();
    }
}
