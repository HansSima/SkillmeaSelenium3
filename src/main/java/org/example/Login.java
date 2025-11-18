package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;


public class Login {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        //Prepsat cestu u sveho projektu na webdriver (Toto plati pouze pro klasicke pridani ChromeDriver
        /*System.setProperty("webdriver.chrome.driver", "D:\\StudijniMaterialy\\Studijni_material\\Studijni_material\\11_Selenium\\Kod\\SkillmeaSelenium3\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();*/

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        driver.findElement(By.id("password")).sendKeys("Heslo12345");
        driver.findElement(By.id("email")).sendKeys("novyemail@novyemail.com");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        assertEquals("Welcome, Login In", driver.findElement(By.xpath("//*[@id=\"signInForm\"]/h1")).getText());
    }
}