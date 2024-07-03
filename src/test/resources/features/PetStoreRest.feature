Feature: Servicios Rest con Serenity

  Scenario: Servicios Rest REQRES
    Given que me encuentro con la uri de REQRES
    When realice el crud de los servicios
    Then validare que el codigo de estado del servicio final sea 200
