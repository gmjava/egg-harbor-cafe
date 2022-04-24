/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author m_gab
 */
public class OrderTest {

    private WebDriver driver;
    private String baseUrl;

    public OrderTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testOrder() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(7000);
        baseUrl = "https://www.google.com/";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://eggharborcafe.com/");
        //  JavascriptExecutor js = (JavascriptExecutor) driver;
        //   js.executeScript("window.scrollTo(0, 500)");
        driver.findElement(By.xpath("//*[@id=\"call-to-action\"]/h2/a/button")).click();
      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000)");
        //  driver.findElement (By.name("ILLINOIS")).click();
        // driver.findElement(By.linkText("ORDER ONLINE")).click();
        //driver.findElement(By.xpath("//div[@id='confirmLocation']/p[2]/a[2]/button")).click();
        driver.get("https://www.toasttab.com/egg-harbor-cafe-arlington-heights/v3");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Buy a Gift Card'])[1]/preceding::*[name()='svg'][3]")).click();
        driver.findElement(By.xpath("//div[@id='drawer-root']/div/div")).click();
        driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div[3]/div/ul/li[3]/a/div/div/div/h2")).click();
        driver.findElement(By.xpath("//div[@id='modal-root']/div/form/div/div/div[2]/div/div/fieldset/div/div/div[2]/label")).click();
        driver.findElement(By.xpath("//div[@id='modal-root']/div/form/div/div/div[2]/div/div/fieldset/div/div/div[3]/label")).click();
        driver.findElement(By.xpath("//div[@id='modal-root']/div/form/div/div/div[3]/button")).click();
        driver.findElement(By.xpath("//div[@id='modal-root']/div/form/div/div/div[2]/div/div/fieldset[2]/div/div/div[4]/div/div/label")).click();
        driver.findElement(By.xpath("//div[@id='modal-root']/div/form/div/div/div[2]/div/div/fieldset[2]/div/div/div[23]/div/div/label")).click();
        driver.findElement(By.xpath("//div[@id='modal-root']/div/form/div/div/div[2]/div/div/fieldset[2]/div/div/div[24]/div/div/label")).click();
        driver.findElement(By.xpath("//div[@id='modal-root']/div/form/div/div/div[3]/div/div[2]/button/span/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='root']/div[2]/div[2]/div/div[2]/a/span/span[2]")).click();
        driver.findElement(By.id("customer_first_name")).clear();
        driver.findElement(By.id("customer_first_name")).sendKeys("Joseph");
        driver.findElement(By.id("customer_last_name")).click();
        driver.findElement(By.id("customer_last_name")).clear();
        driver.findElement(By.id("customer_last_name")).sendKeys("Burns");
        driver.findElement(By.xpath("//div[@id='root']/div[2]/form/fieldset[2]/div/div/label")).click();
        driver.findElement(By.id("transportDescription")).click();
        driver.findElement(By.id("transportDescription")).clear();
        driver.findElement(By.id("transportDescription")).sendKeys("bmw/X5");
        driver.findElement(By.id("transportColor")).click();
        driver.findElement(By.id("transportColor")).clear();
        driver.findElement(By.id("transportColor")).sendKeys("blue");
        driver.findElement(By.xpath("//div[@id='root']/div[2]/form/fieldset[3]/div/div/div/label")).click();
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
        driver.findElement(By.id("credit_card_exp")).click();
        driver.findElement(By.id("credit_card_exp")).clear();
        driver.findElement(By.id("credit_card_exp")).sendKeys("02/03");
        driver.findElement(By.id("credit_card_cvv")).click();
        driver.findElement(By.id("credit_card_cvv")).clear();
        driver.findElement(By.id("credit_card_cvv")).sendKeys("123");
        driver.findElement(By.id("credit_card_zip")).click();
        driver.findElement(By.id("credit_card_zip")).clear();
        driver.findElement(By.id("credit_card_zip")).sendKeys("6013");
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.findElement(By.xpath("//div[@id='root']/div[2]/form/fieldset[6]/div/div/div/label/span")).click();
    }
}
