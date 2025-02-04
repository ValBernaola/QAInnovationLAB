@ProbarFeatureMascota
Feature: Mascota

  @CrearMascota
  Scenario: Crear Mascota

  @ConsultarMascota
  Scenario: Consultar Mascota
    When consulto la tienda de mascota con IdMascota 566
    Then valido el codigo de respuesta sea 404
    And valido la respuesta sea "Pet not found"