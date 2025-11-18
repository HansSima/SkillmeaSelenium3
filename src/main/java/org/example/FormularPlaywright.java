package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormularPlaywright {
    private Playwright playwright;
    private Browser prohlizec;
    private Page stranka;

    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();
        prohlizec = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        stranka = prohlizec.newPage();
    }

    @AfterEach
    public void uklid(){
        //Pro zavreni okna prohlizece
        prohlizec.close();
        //Pro zruseni objektu driver
        playwright.close();
    }

    @Test
    public void formTest(){
        //Prikaz pro prepnuti na stranku
        stranka.navigate("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        //Prikaz pro nalezeni prvku a vepisovani do nej
        stranka.fill("#name", "Jan Sima");
        stranka.fill("#email", "email@email.com");

        //Prikaz pro nalezeni prvku a klik na nej
        stranka.click("#gender");
        stranka.click("xpath=//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input");

        //Validace, zda jsou radiobuttony zaskrtnuty
        assertTrue(stranka.isChecked("xpath=//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input"));
        //assertFalse(stranka.isChecked("#gender"), "Radiobutton je zaskrtnut :(");
    }



}
