@ProbarFeatureStore
Feature: Store

  @CrearOrden
  Scenario Outline: Crear de una orden en la PetStore
    When deseo crear una nueva orden
    And envio una solicitud POST a "/store/order" con los siguientes datos:
      | id   | petId   | quantity   |  status
      | <id> | <petId> | <quantity>  | <status>
    Then El codigo de respuesta es 200
    Examples:
      | id   | petId | quantity |  status   |
      | 0     | 60   | 1        | approved  |



  @Obtenerconsulta
  Scenario Outline: Consultar  una orden existente
    When consulto la tienda de mascota con IdOrden {int}
    And  realizo una solicitud GET a "/store/order/<id>"
    Then valido el codigo de respuesta es 200
    Examples:
      | id   |
      | 9223372036854760817|
