Feature: Agregar campaña
  Como usuario administrador puedo crear campaña y vincularla a mas gestion

  Scenario: Crear campania
    Given Quiero visitar sitio del cliente
    When Me encuentre en el sitio hacer login de acceso
    When al estar dentro de la aplicacion ir a modulo de campanias
    And Crear campania asociada a una licuacion
    Then esta se encontrara disponible para vincular a carga masiva

