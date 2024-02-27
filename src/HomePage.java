import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\vinay.pohankar\\Desktop\\New folder\\Projects\\seleniumproject\\newdriver\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.get("https://peoplefirst.ril.com/webapp/#/login");

        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
            username.sendKeys("Vinay.Pohankar");
             Thread.sleep(1000);

             WebElement password = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
            password.sendKeys("biogass@12345");
            Thread.sleep(1000);

            WebElement submit = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
            submit.click();
            Thread.sleep(3000);

        ((ChromeDriver) driver).executeScript("window.open();");

        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        driver.get("https://outlook.office.com/mail/");





        WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/login-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/mat-radio-group[1]/mat-radio-button[2]/label[1]/div[2]"));
        email.click();
        Thread.sleep(1000);


        WebElement otp = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
            otp.click();
            Thread.sleep(1000);








        }

    }

