package es.uniovi.asw.publicacion;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.types.UserPassInitStop;



@Controller
public class AdminRestController {

  private static final Logger LOG = LoggerFactory.getLogger(AdminRestController.class);

  /*@RequestMapping("/")
  public ModelAndView landing(Model model) {
    LOG.info("Landing page access");
    return new ModelAndView("landing");
  }*/
  
  @RequestMapping(
			value = "/iniciarRecuento",
			method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	
  public ResponseEntity<Eleccion> IniciarRecuento(@RequestBody @Valid final UserPassInitStop uPS) throws Exception {
		
		if (uPS == null) {
			// throw new ResourceNotFoundException();
			return new ResponseEntity<Eleccion>(HttpStatus.BAD_REQUEST);
		}
		
		//DBManagement db = new DBManagementVirtualImpl();
			
		Eleccion eleccion = null;// =  db.getEleccion(uPS);
		
		/*
		 * 
		 * 
		 * Codigo necesario para INICIAR el recuendo
		 * 
		 * Posiblemente crear un hilo actualizador de BD ?? o un timer de contexto..  
		 * Otro q lo pare? 
		 * 
		 */
		
		if (eleccion == null) {
			// throw new UserNotFoundException(userPass);
			return new ResponseEntity<Eleccion>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Eleccion>(HttpStatus.OK);
	}
  
  @RequestMapping(
			value = "/terminarRecuento",
			method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	
public ResponseEntity<Eleccion> terminarRecuento(@RequestBody @Valid final UserPassInitStop uPS) throws Exception {
		
		if (uPS == null) {
			// throw new ResourceNotFoundException();
			return new ResponseEntity<Eleccion>(HttpStatus.BAD_REQUEST);
		}
		
		//DBManagement db = new DBManagementVirtualImpl();
			
		Eleccion eleccion = null;// =  db.getEleccion(uPS);
		
		/*
		 * 
		 * 
		 * Codigo necesario para TERMINAR el recuendo
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		if (eleccion == null) {
			// throw new UserNotFoundException(userPass);
			return new ResponseEntity<Eleccion>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Eleccion>(HttpStatus.OK);
	}

  
}