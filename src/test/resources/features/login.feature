Feature: Login
  Yo como usuario Administrador
  quiero acceder a mi perfil
  en ambiente Admin

  Scenario: Acceder a la aplicacion
    Given quiero acceder al sitio
    When Ingreso mis credenciales y doy clic en ingresar
    Then permite el acceso a la aplicacion