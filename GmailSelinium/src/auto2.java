import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class auto2 {
     public void method1(){

            System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Desktop/Textbook/3rd yr/2nd semester/SE 2/lab/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://accounts.google.com");

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
            email.sendKeys("mamekimo@gmail.com");
            driver.findElement(By.id("identifierNext")).click();

            WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(password));
            password.sendKeys("kimiya@mohd");
            driver.findElement(By.id("passwordNext")).click();
            driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
            driver.findElement(By.xpath("//*[@id=\":2o\"]")).click();
            String primary= driver.findElement(By.className("nU")).getText();
            System.out.println("You have"+primary);

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }


        }

    }



