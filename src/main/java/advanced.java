import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * This program allow the browser run automatically and find out the information about the
 * person I want to find out
 * <p>
 * Name: Joey Zhen
 **/
public class advanced {

        //1
        public WebDriver webDriver;
        @BeforeTest
        public void setup()
        {
            webDriver = new ChromeDriver();
            webDriver.get("https://www.flipkart.com/");
        }



        @Test(priority=1)
        public void check() {
            //2
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            WebElement cross = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")));
            cross.click();
        }

        @Test(priority=2)
        public void electronics() {
            //3
            WebElement electronics_menuname = webDriver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(electronics_menuname).build().perform();
            WebElement mobile_menu_button = webDriver.findElement(By.xpath("//*[contains(text(),'MobileAccessory')]"));
            new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(mobile_menu_button)).click();
        }

        @Test(priority=3)
        public void mi() {
            WebElement electronics_name = webDriver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
            Actions m = new Actions(webDriver);
            m.moveToElement(electronics_name).build().perform();
            WebElement m_menu = webDriver.findElement(By.xpath("//a[@title='Mi']"));
            new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(m_menu)).click();
        }


        //4
        @Test(priority=4)
        public void mitext() {
             WebElement mi = webDriver.findElement(By.linkText("Latest from MI : "));
             String find = mi.getText();
             String t = "Latest from MI : ";
             Assert.assertEquals(find , t);
        }
        @Test(priority=5)
        public void down() {

        }

        @Test(priority=6)
        public void sendkey() {

            WebElement sent = webDriver.findElement(By.name("q"));
            sent.clear();
            sent.sendKeys("redmi go (black, 8 gb)");

            List<WebElement> first = (List<WebElement>) webDriver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']"));
            int num = first.size();
            if(num >= 0)
            {

            }

            first.get(0).click();

    }




    }


