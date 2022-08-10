package pages;

import Base.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CampaniaPage extends ClaseBase {
    public CampaniaPage(WebDriver driver) {
        super(driver);
    }


    //region Elementos acceso
    private By btnHamburguesa = By.xpath("//div[@class='sidebar-header']");
    private By btnImplementarEjecutar = By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");
    private By btnCampanas = By.xpath("//*[@id=\"menu\"]/ul/li[2]/ul/li[2]/a");
    private By btnAgregarCampana = By.xpath("//a[@href='/admin/admin/visual/visuales/add']");

    private By labelTitulo = By.xpath("//h2[@class='panel-title text-primary']");
//endregion


    //region Elementos formulario agregar camania
    private By txtNombre = By.id("VisualNombre");
    private By inputHeader = By.id("VisualHeader");
    private By btnSelectorCampania = By.xpath("//div[@class='col-md-9']/div[@id='s2id_VisualParentId']");
    private By cmbCampaniaReferencia = By.id("VisualParentId");
    private By btnSelectorComunicado = By.xpath("//div[@class='col-md-9']/div[@id='s2id_VisualComunicadoId']");
    private By cmbComunicado = By.id("VisualComunicadoId");
    private By txtDescripcion = By.xpath("//div[@class='note-editable']");
    private By inputInstructivo = By.id("VisualInstructivo");
    private By chkInstructivo = By.id("VisualInstructivoObligatorio");
    private By inputLogo = By.id("VisualBanner");
    private By chkImportante = By.id("VisualImportante");
    private By chkTarea = By.id("VisualTarea");
    private By chkPublicarCampania = By.id("Visualpublicar");
    private By datePublicacion = By.id("VisualFechaPublicadoDate");
    private By horaPublicacion = By.id("VisualFechaPublicadoHour");
    private By minPublicacion = By.id("VisualFechaPublicadoMin");
    private By rbtnReportablesConFoto = By.id("VisualReportable1"); //Reportable con foto
    private By rbtnReportableSinFoto = By.id("VisualReportable2");// Reportable sin foto
    private By chkNoImplementacion = By.id("VisualNoImplementar");
    private By chkLicuacion = By.id("VisualLicuacion");
    private By dateImplementacion = By.id("VisualFechaImplementacion");
    private By dateLanzamiento = By.id("VisualFechaLanzamiento");
    private By dateTermino = By.id("VisualFechaTermino");
    private By inputArchivoMasivo = By.id("VisualMasivo");
    private By chkNotificarImplementacion = By.id("VisualNotificarImplementacion");
    private By chkPorcentajeImplementacion =By.id("VisualPreguntarImplementacion");
    private By chkRecordatorios = By.id("NotificacionRecordatorioActivarRecordatorio");
    private By cmbAsignacionFront = By.id("VisualOcultarClusterId");
    private By tabFotos = By.xpath("//a[@href='#visualFotosTab']");
    private By tabArchivos = By.xpath("//a[@href='#visualArchivosTab']");
    private By dropFtotos = By.xpath("//*[@id='VisualDropZoneFotos']");
    private By dropArchivos = By.xpath("//*[@id='VisualDropZoneArchivos']");
    private By cmbCargos = By.id("CargosVisualCargoId");
    private By chkPais =  By.id("Pais");
    private By inputSucursales =  By.xpath("//*[@id='autocomplete-filtro-busqueda']");
    private By btnGuardarCampania = By.id("guardar_visual");

//endregion

    //region Elementos para agregar cuestionario a la campania
    private By btnAgregarCuestionario = By.xpath("//a[@href='#CuestionarioModal']");
    private By modalCuestionario =  By.id("CuestionarioModal");
    private By inputPregunta = By.id("Preguntanombre");
    private By rdbtnaCorrecta = By.id("PreguntaCorrecta"); //Se repite por cada aterntiva
    private By txtAlternativa = By.name("Alternativanombre"); // Este elemento se repite 5 veces
    private By btnAgregarPregunta = By.xpath("//button[@rel='PreguntaAgregar']");
    private By btnLimpiar = By.xpath("//button[@rel='PreguntaLimpiar']");
    private By btnEliminarPregunta = By.xpath("//*[@id=\"CuestionarioPreguntas\"]/div[2]/div[1]/div/div/span/button");
    private By btnTerminar = By.xpath("//button[@rel='terminarCuestionario']");


    //endregion


    /**
     *  Metodo de acceso a la vista
     * @throws InterruptedException
     */
    public void accesoVista() throws InterruptedException {
        Thread.sleep(1000);
        darClic(btnHamburguesa);
        Thread.sleep(1000);
        darClic(btnImplementarEjecutar);
        Thread.sleep(1000);
        darClic(btnCampanas);
        Thread.sleep(1000);
        darClic(btnAgregarCampana);
    }


    public void completarFormulario(String nombreVisual, String rutaArchivo, String descripcion,
                                    String logo, String instructivo, String fechaPublicacion, String fechaImplementacion,
                                    String fechaLanzamiento, String fechaTermino) throws InterruptedException {
        try{
            Thread.sleep(1000);
            completarCampo(txtNombre, nombreVisual);
            Thread.sleep(1000);
            completarCampo(inputHeader, rutaArchivo);
            Thread.sleep(1000);
            completarCampo(txtDescripcion, descripcion);
            Thread.sleep(1000);
            subirArchivo(inputInstructivo, instructivo);
            Thread.sleep(1000);
            completarCampo(inputLogo, logo);
            Thread.sleep(1000);
            completarCampo(datePublicacion, fechaPublicacion);
            Thread.sleep(1000);
            darClic(chkLicuacion);
            Thread.sleep(1000);
            completarCampo(dateImplementacion, fechaImplementacion);
            Thread.sleep(1000);
            completarCampo(dateLanzamiento, fechaLanzamiento);
            Thread.sleep(1000);
            completarCampo(dateTermino, fechaTermino);
            Thread.sleep(1000);
            System.out.println("Campania creada con exito");
        }catch(Error error){
            System.out.println(error);
        }


    }


}
