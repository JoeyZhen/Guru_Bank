import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This program allow the browser run automatically and find out the information about the
 * person I want to find out
 * <p>
 * Name: Joey Zhen
 **/
public class invalidusername {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        /** Create a new driver for Chrome**/
        webDriver.get("http://www.demo.guru99.com/V4/");

        try {
            WebElement username;
            username = webDriver.findElement(By.name("uid"));
            username.clear();
            username.sendKeys("mngr30648");
            Thread.sleep(3000);

            WebElement password;
            password = webDriver.findElement(By.name("password"));
            password.clear();
            password.sendKeys("aqYvyhy");
            Thread.sleep(3000);

            WebElement click;
            click = webDriver.findElement(By.name("btnLogin"));
            click.click();


            String invalid = webDriver.switchTo().alert().getText();
            String Expected = "User or Password is not valid";

            if (invalid.equals(Expected)) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed");
            }
        } catch (Exception e) {
            System.out.printf("Something wrong");
        }
        Thread.sleep(3000);
    }
}
