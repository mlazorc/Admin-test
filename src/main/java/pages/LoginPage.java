package pages;


import Base.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ClaseBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By usuario = By.id("AdministradorUsuario");
    private By clave = By.id("AdministradorClave");
    private By btnIngresar = By.xpath("//*[@id=\"AdministradorAdminLoginForm\"]/div[4]/div/button");
    private By nombreUsuario = By.xpath("//*[@id=\"userbox\"]/a/div/span[1]/b");

    public void ingresoCredenciales(String user, String password){
        completarCampo(usuario, user);
        completarCampo(clave, password);
        darClic(btnIngresar);
    }

    public boolean verificarNombre(String nombre){
        boolean nombreCorrecto=false;
        if(getText(nombreUsuario).equals(nombre)){
            nombreCorrecto = true;
            System.out.println("Nombre de usuario correcto");
        }else {
            nombreCorrecto = false;
            System.out.println("Nombre incorrecto");
        }

        return  nombreCorrecto;
    }
}
