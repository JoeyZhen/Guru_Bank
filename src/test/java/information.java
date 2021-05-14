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

public class information {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        /** Create a new driver for Chrome**/

        webDriver.get("https://www.rit.edu/");
        /** The URL for RIT**/

        WebElement academics;
        academics = webDriver.findElement(By.linkText("Academics"));
        academics.click();
        Thread.sleep(2000);
        /**This function lets the browser find and click the Academics session and stop for 2 seconds after that.**/

        WebElement undergraduate;
        undergraduate = webDriver.findElement(By.linkText("Undergraduate Degrees"));
        undergraduate.click();
        Thread.sleep(2000);
        /**This function runs the browser find and click the Undergraduate Degrees session and stop for 2 seconds after that.**/

        WebElement software;
        software = webDriver.findElement(By.linkText("Software Engineering BS"));
        software.click();
        Thread.sleep(2000);
        /**This function makes the browser find and click the Software Engineering BS session and stop for 2 seconds after that.**/

        WebElement department;
        department = webDriver.findElement(By.linkText("Department of Software Engineering"));
        department.click();
        Thread.sleep(3000);
        /**This function runs the browser find and click the Department of Software Engineering session and stop for 2 seconds after that.**/


        WebElement name;
        name = webDriver.findElement(By.cssSelector("div[class='person-name']"));
        Thread.sleep(3000);
        /**This function copies the contents about the person name and position
         on the browser and stop for 3 seconds after that.**/

        WebElement phone;
        phone = webDriver.findElement(By.xpath("//span[@class='phone-number']"));
        Thread.sleep(3000);
        /**This function copies the contents about the phone-number
         on the browser and stop for 3 seconds after that.**/

        WebElement email;
        email = webDriver.findElement(By.cssSelector("a[href='mailto:bmsvse@rit.edu']"));
        Thread.sleep(3000);
        /**This function copies the contents about the E-mail
         on the browser and stop for 3 seconds after that.**/

        System.out.println("Contact details");
        System.out.println("Contact Person: " + name.getText() + ",");
        System.out.println("Phone: " + phone.getText());
        System.out.println("Email: " + email.getText());
        /**This function prints out the information about the person we want to find**/
    }

}
