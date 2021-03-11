package tests.alerts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Alerts;

public class Test_Alert {
    Alerts alerts = new Alerts();

    @BeforeTest
    public void navigate(){
        alerts.navigate();
    }
    @AfterTest
    public void closeBrowser(){
        alerts.driverClose();
    }
    @Test
    public void goToAlerts(){
        alerts.navigateToAlertPage();
    }
    @Test
    public void header(){
        Assert.assertEquals(alerts.checkHeader(),"ANGULAR GROWL NOTIFICATIONS", "Wrong Page");
    }
}
