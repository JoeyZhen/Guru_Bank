import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * This program allow the browser run automatically and find out the information about the
 * person I want to find out
 * <p>
 * Name: Joey Zhen
 **/
public class customer {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        /** Create a new driver for Chrome**/
        webDriver.get("http://www.demo.guru99.com/V4/");


            WebElement username;
            username = webDriver.findElement(By.name("uid"));
            username.clear();
            username.sendKeys("mngr306485");
            Thread.sleep(3000);

            WebElement password;
            password = webDriver.findElement(By.name("password"));
            password.clear();
            password.sendKeys("aqYvyhy");
            Thread.sleep(3000);

            WebElement click;
            click = webDriver.findElement(By.name("btnLogin"));
            click.click();

            String actualtitle = webDriver.getTitle();
            String Expected = "Guru99 Bank Manager HomePage";

            if (actualtitle.equals(Expected)) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed");
            }
            System.out.printf("The title of the Home page is " + actualtitle);
        }
}
