package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;


public class Login {
    private WebDriver driver;

    @BeforeAll
    public void setUp() {
        //Prepsat cestu u sveho projektu na webdriver
        System.setProperty("webdriver.chrome.driver", "D:\\StudijniMaterialy\\Studijni_material\\Studijni_material\\11_Selenium\\Kod\\SkillmeaSelenium3\\src\\main\\resources\\chromedriver.exe");
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