Feature: Buscar el concepto Cucumber en wikipedia

  Scenario: Verificar resultado del navegador
    Given Acceso a sitio http://www.wikipedia.com
    When Busco el concepto Cucumber en el navegador del sitio
    Then La pagina de resultados se despliega

