package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formular {
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
    public void formTest(){
        //Prikaz pro prepnuti na stranku
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        //Prikaz pro nalezeni prvku a vepisovani do nej
        driver.findElement(By.id("name")).sendKeys("Jan Sima");
        driver.findElement(By.id("email")).sendKeys("email@email.com");
        //Prikaz pro nalezeni prvku a klik na nej
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).click();


    }



}
