package es.uniovi.asw.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import es.uniovi.asw.SeleniumUtils;

@IntegrationTest
@WebAppConfiguration
public class DespliegeSteps {
	protected WebDriver driver;
	protected String baseUrl;
	protected boolean acceptNextAlert = true;
	protected StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080";
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

	@Autowired
	protected WebApplicationContext context;

	@Value("${local.server.port}")
	protected int port;

	@Cuando("^el cliente entra en la web$")
	public void el_cliente_entra_en_la_web() throws Throwable {
		driver.get(baseUrl);
	}

	@Entonces("^el cliente visualiza un mensaje de bienvenida$")
	public void el_cliente_visualiza_un_mensaje_de_bienvenida() throws Throwable {
		SeleniumUtils.esperaCargaPagina(driver, "text", "Elecciones - Sistema de resultados", 10);
	}

}
