package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class Formular {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void uklid(){
        //Pro zavreni okna prohlizece
        driver.close();
        //Pro zruseni objektu driver
        driver.quit();
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
        //Validace, zda jsou radiobuttony zaskrtnuty
        assertTrue(driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).isSelected());
        assertFalse(driver.findElement(By.id("gender")).isSelected(), "Radiobutton je zaskrtnut :(");
    }



}
