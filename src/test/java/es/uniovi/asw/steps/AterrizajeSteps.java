package es.uniovi.asw.steps;

//import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

public class AterrizajeSteps {

  @Cuando("^el cliente llama usa el verbo \"([^\"]*)\" para llamar a \"([^\"]*)\"$")
  public void el_cliente_llama_usa_el_verbo_para_llamar_a(String arg1, String arg2) throws Throwable {
    System.out.println("El cliente invoca el verbo " + arg1 + " llamando a " + arg2);
  }
  @Entonces("^el cliente recibe (\\d+)$")
  public void el_cliente_recibe(int arg1) throws Throwable {
    System.out.println("Recibiendo el status " + arg1);
  }

  @Entonces("^el resultado contiene la cadena \"([^\"]*)\"$")
  public void el_resultado_contiene_la_cadena(String arg1) throws Throwable {
    System.out.println("Chequeando que la cadena es " + arg1);
  }
  
}
