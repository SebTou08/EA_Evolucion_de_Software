import com.example.momsjobs.SeleniumWebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepDsasasasefinitions {
    SeleniumWebDriverConfig myDriver;
    public static String API_URL = "https://www.momlancers.com";

    public StepDsasasasefinitions() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("el usuario se encuentra en la sección de Convocatorias")
    public void elUsuarioSeEncuentraEnLaSecciónDeConvocatorias() {
        myDriver.driver.get(API_URL);
        myDriver.driver.manage().window().fullscreen();
        myDriver.driver.findElement(By.xpath("//*[@id=\"DrpDwnMn0-pl02label\"]")).click();
    }

    @When("Hace click en el botón de Solicitar en la convocatoria de su interés")
    public void haceClickEnElBotónDeSolicitarEnLaConvocatoriaDeSuInterés() {
        myDriver.driver.findElement(By.xpath("//*[@id=\"CustomHeadhunterJobsIndexView-react-component-1939659a-02bf-429b-ba65-5bcd527772aa\"]/div/div[3]/div[1]/a/div/div[3]/span")).click();
    }

    @Then("El sistema la redirigirá a una nueva pestaña donde se podrá visualizar más información sobre la convocatoria seleccionada")
    public void elSistemaLaRedirigiráAUnaNuevaPestañaDondeSePodráVisualizarMásInformaciónSobreLaConvocatoriaSeleccionada() {
        myDriver.closeWindow();
    }
}
