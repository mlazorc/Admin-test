package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class ClaseBase {

    private WebDriver driver;
    public ClaseBase(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver conexionNavegador(){
        System.setProperty("web-driver.chrome.driver", "src/test/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void visitarSitio(String url){
        driver.get(url);
    }

    public WebElement localizarElemento(By localizador){
        return driver.findElement(localizador);
    }

    public void completarCampo(By elemento, String texto){
        driver.findElement(elemento).sendKeys(texto);
    }

    public void darClic(By elemento){
        driver.findElement(elemento).click();
    }

    public String getText(By localizador){
        return driver.findElement(localizador).getText();
    }

    public void seleccionarSucursalBy(By element, String opcion){
        WebElement lista = element.findElement(driver);
        List<WebElement> opciones = lista.findElements(By.tagName("li"));
        opciones.forEach(option->{
            if (option.getAttribute("innerText").equals(opcion)){
                Actions acciones = new Actions(driver);
                acciones.moveToElement(option).click().perform();
            }
        });
    }

    public void seleccionarOpcion(By element, String texto){
        WebElement selectElement = element.findElement(driver);
        Select seleccion = new Select(selectElement);
        seleccion.selectByVisibleText(texto);
    }

    public void subirArchivo(By element, String file){

        File archivo = new File(file);
        completarCampo(element, String.valueOf(archivo));
    }

}
