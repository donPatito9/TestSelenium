package com.iplacex.TestSelenium;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;
  @Test
  public void f() {
	  WebElement cuadroBusqueda = driver.findElement(By.name("q"));
	  
	  cuadroBusqueda.sendKeys("http://localhost:8080/ReservaHora/index.jsp");
	  cuadroBusqueda.click();
	  
	  cuadroBusqueda.submit();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  assertEquals("http://localhost:8080/ReservaHora/index.jsp - Buscar con Google", driver.getTitle());
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\donpa\\Downloads\\chromedriver.exe");
  
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
