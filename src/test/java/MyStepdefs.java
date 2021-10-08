import com.example.momsjobs.SeleniumWebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class MyStepdefs {

    SeleniumWebDriverConfig myDriver;
    public static String API_URL = "https://www.momlancers.com";

    public MyStepdefs() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("el usuario se encuentra en la pagina principal")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
        myDriver.driver.get(API_URL);
        myDriver.driver.manage().window().fullscreen();
    }

    @When("Hace click en el botón de Convocatorias")
    public void haceClickEnElBotónDeConvocatorias() throws InterruptedException {
        myDriver.driver.findElement(By.xpath("//*[@id=\"DrpDwnMn0-pl02label\"]")).click();
        sleep(1000);
    }

    @Then("La pagina mostrará todas las convocatorias activas")
    public void laPaginaMostraráTodasLasConvocatoriasActivas() {
        myDriver.closeWindow();
    }
}
