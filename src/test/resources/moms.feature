Feature:
  Scenario: sdsdsdsdsdsad
  Given el usuario se encuentra en la pagina principal
  When Hace click en el botón de Convocatorias
  Then La pagina mostrará todas las convocatorias activas


  Scenario: dsadsadsa
  Given el usuario se encuentra en la página principal
  When Hace click en el botón de Convocatorias
  And Selecciona la ciudad y categoría deseada
  Then La pagina mostrará las convocatorias disponibles filtradas por ciudad y categoría previamente definidas



    Scenario:
    Given el usuario se encuentra en la sección de Convocatorias
    When Hace click en el botón de Solicitar en la convocatoria de su interés
    Then El sistema la redirigirá a una nueva pestaña donde se podrá visualizar más información sobre la convocatoria seleccionada


