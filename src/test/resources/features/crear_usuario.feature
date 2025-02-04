Feature: Crear usuario PetStore

  @test1
  Scenario: Crear usuario

    When creo el usuario con username "vbernaola", firstname "Valeria", lastname "Bernaola"
    Then el código de respuesta es 200
    And el type es "unknown"