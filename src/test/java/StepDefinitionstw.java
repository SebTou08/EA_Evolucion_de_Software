import com.example.momsjobs.SeleniumWebDriverConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class StepDefinitionstw {

    SeleniumWebDriverConfig myDriver;
    public static String API_URL = "https://www.momlancers.com";

    public StepDefinitionstw() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("el usuario se encuentra en la página principal")
    public void elUsuarioSeEncuentraEnLaPáginaPrincipal() {
        myDriver.driver.get(API_URL);
        myDriver.driver.manage().window().fullscreen();
    }

    @And("Selecciona la ciudad y categoría deseada")
    public void seleccionaLaCiudadYCategoríaDeseada() {
        myDriver.driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div[1]/span")).sendKeys("San Antonio");
        myDriver.driver.findElement(By.xpath("//*[@id=\"react-select-3--value\"]/div[1]/span")).sendKeys("Administracion");

    }

    @Then("La pagina mostrará las convocatorias disponibles filtradas por ciudad y categoría previamente definidas")
    public void laPaginaMostraráLasConvocatoriasDisponiblesFiltradasPorCiudadYCategoríaPreviamenteDefinidas() {
        myDriver.closeWindow();
    }
}
