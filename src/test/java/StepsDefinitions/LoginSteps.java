package StepsDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    @Before
    public void before(){
        loginPage = new LoginPage(driver);
        driver = loginPage.conexionNavegador();
    }
    @Given("quiero acceder al sitio")
    public void quiero_acceder_al_sitio() {
        loginPage.visitarSitio("url_cliente");
    }


    @When("Ingreso mis credenciales y doy clic en ingresar")
    public void ingreso_mis_credenciales_y_doy_clic_en_ingresar() {
        loginPage.ingresoCredenciales("user", "pass");
    }

    @Then("permite el acceso a la aplicacion")
    public void permite_el_acceso_a_la_aplicacion() {
        if (loginPage.verificarNombre("nombre_usuario_acceso")){
            System.out.println("Prueba correcta");
        }else{
            System.out.println("Prueba fallida");
        }
    }

    @After
    public void after(){
        driver.quit();
    }

}
