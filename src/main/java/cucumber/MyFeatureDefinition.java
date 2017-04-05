package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFeatureDefinition {
	//WebDriver driver = new ChromeDriver();	
	WebDriver driver = new FirefoxDriver();
	
	
	@Given("^Acceso a sitio http://www\\.wikipedia\\.com$")
	public void acceso_a_sitio_http_www_wikipedia_com() throws Throwable {
		System.out.println("Navegando por el buscador");
		driver.navigate().to("http://www.wikipedia.com");
	}

	@When("^Busco el concepto Cucumber en el navegador del sitio$")
	public void busco_el_concepto_Cucumber_en_el_navegador_del_sitio() throws Throwable {
		System.out.println("busco Cucumber en el buscador del sitio");
		driver.findElement(By.id("searchInput")).sendKeys("Cucumber");
        driver.findElement(By.id("search-form")).submit();	
    }

	@Then("^La pagina de resultados se despliega$")
	public void la_pagina_de_resultados_se_despliega() throws Throwable {
		System.out.println("Chequear el titulo de la página");
	    System.out.println(driver.getTitle());
	    driver.quit();
	}
}
