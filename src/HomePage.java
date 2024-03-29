import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\vinay.pohankar\\Desktop\\New folder\\Projects\\seleniumproject\\newdriver\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.manage().window().maximize();
        Thread.sleep(1000);

            WebElement headlineElement = driver.findElement(By.tagName("h1"));
            String headlineText = headlineElement.getText();

            WebElement titleElement = driver.findElement(By.tagName("h3"));
            String titleText = titleElement.getText();

        String expectedHeadlineText = "CURA Healthcare Service";
        String expectedtitleText = "We Care About Your Health";

            if (headlineText.equals(expectedHeadlineText)&&titleText.equals(expectedtitleText))
            {
                System.out.println("Scenario 1- Verification of Headline and Tiltle text is passed");
            }
            else
            {
                System.out.println("Scenario 1- Verification of Headline and Tiltle text is failed");
            }

            WebElement makeappointment = driver.findElement(By.id("btn-make-appointment"));

            if (makeappointment != null) {
                // If the button is found, it means it exists on the page
                System.out.println("Scenario 2 Test 1 - Verify that Make Appointment button is visible is passed");
            } else {
                // If the button is not found, it means it does not exist on the page
                System.out.println("Scenario 2 Test 1- Verify that Make Appointment button is visible is failed");
            }

            WebElement makeapp_but_element = driver.findElement(By.id("btn-make-appointment"));
            String makeapp_but_text = makeapp_but_element.getText();

            String expected_makeapp_but_text = "Make Appointment";

            if (expected_makeapp_but_text.equals(makeapp_but_text))
            {
                System.out.println("Scenario 2 Test 2 - Verify text Make Appointment is present on button is present is passed");
            }
            else
            {
                System.out.println("Scenario 2 Test 2 - Verify text Make Appointment is present on button is present is failed");

            }

        WebElement bottom_heading = driver.findElement(By.tagName("h4"));
        String bottom_heading_text = bottom_heading.getText();

        String expected_bottom_heading_text = "CURA Healthcare Service";

        if (expected_bottom_heading_text.equals(bottom_heading_text))
        {
            System.out.println("Scenario 3 Test 1 - Checking wheather CURA Healthcare Service heading is present in the bottom of the home page is passed");
        }
        else
        {
            System.out.println("Scenario 3 Test 1 - Checking wheather CURA Healthcare Service heading is present in the bottom of the home page is failed");

        }

        WebElement address = driver.findElement(By.tagName("p"));
        String address_text = address.getText();

        String expected_address_text = "Atlanta 550 Pharr Road NE Suite 525\n" +
                "Atlanta, GA 30305";

        if (expected_address_text.equals(address_text))
        {
            System.out.println("Scenario 3 Test 2 - Checking wheather address is present in the bottom of the home page is passed");
        }
        else
        {
            System.out.println("Scenario 3 Test 2 - Checking wheather address is present in the bottom of the home page is failed");

        }



        driver.close();


        }

    }

