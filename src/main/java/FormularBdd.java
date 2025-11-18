import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormularBdd {
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






    @Given("Uzivatel je na strance s formularem")
    public void uzivatelJeNaStranceSFormularem() {

    }

    @When("Uzivatel napise do input jmeno {string}")
    public void uzivatelNapiseDoInputJmeno(String jmeno) {

    }

    @And("Uzivatel napise do input email {string}")
    public void uzivatelNapiseDoInputEmail(String email) {

    }

    @And("Uzivatel klikne na radiobutton male")
    public void uzivatelKlikneNaRadiobuttonMale() {

    }

    @And("Uzivatel klikne na radiobutton female")
    public void uzivatelKlikneNaRadiobuttonFemale() {

    }

    @Then("Uzivatel vidi zaskrtnuty radiobutton female")
    public void uzivatelVidiZaskrtnutyRadiobuttonFemale() {

    }

    @And("Uzivatel vidi odskrtnuty radiobutton male")
    public void uzivatelVidiOdskrtnutyRadiobuttonMale() {

    }
}
