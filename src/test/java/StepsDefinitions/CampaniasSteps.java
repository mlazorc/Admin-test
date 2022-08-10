package StepsDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.CampaniaPage;
import pages.LoginPage;

public class CampaniasSteps {
    CampaniaPage campaniaPage;
    WebDriver driver;
    LoginPage loginPage;
    @Before
    public void before(){
        campaniaPage = new CampaniaPage(driver);
        driver = campaniaPage.conexionNavegador();

    }
    @Given("^Quiero visitar sitio del cliente$")
    public void visitarSitio() throws InterruptedException {
        campaniaPage.visitarSitio("http://certificacion-masgestion.fcv-chile.oneapp.cl/admin");
        Thread.sleep(2000);
    }

    @When("^Me encuentre en el sitio hacer login de acceso$")
    public void login() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.ingresoCredenciales("admin", "andain5546");
        Thread.sleep(3000);
    }

    @When("al estar dentro de la aplicacion ir a modulo de campanias$")
    public void accesoCrearCampania() throws InterruptedException {
        campaniaPage.accesoVista();
    }
    @When("^Crear campania asociada a una licuacion$")
    public void crearCampania() throws InterruptedException{
        campaniaPage.completarFormulario("nombvre_camapania",
                "ruta_header",
                "descripcion_campania",
                "ruta_logo_campania",
                "ruta_archivo_instructivo",
                "fecha_publicacion_campania",
                "fecha_implementacion_campania",
                "fecha_lanzamiento_campania",
                "fecha_termino_campania");
    }

    @Then("^esta se encontrara disponible para vincular a carga masiva$")
    public void esta_se_encontrara_disponible_para_vincular_a_carga_masiva() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @After
    public void after(){
        driver.quit();
    }

}
