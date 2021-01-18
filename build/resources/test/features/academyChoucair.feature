# Autor: Christian Uribe
@stories
Feature: Academy choucair
  como usuario, quiero aprender como automatizar en screamplay en la Academy choucair con el curso de automatizacion
  @scenario1
  #Scenario: Buscar un curso de automatizacion
    #Given Christian quiere aprender automatizacion en la Academy choucair
    #When el busca un curso Automatizacion en la plaaforma choucair academy
    #Then el encuentra el curso llamado recursos Patrones de Automatización
  Scenario: buscar un curso de automatizacion
    Given Christian quiere aprender automatizacion en la plataforma ChoucairAcademy
    | strUser   | strPassword           |
    | 223629081962CDua@   | curibea     |
    When el busque el curso en la plataforma choucair Choucair Academy
    | strCourse               |
    | Metodología Bancolombia |
    Then el encuentra el curso llamado
    | strCourse               |
    | Metodología Bancolombia |