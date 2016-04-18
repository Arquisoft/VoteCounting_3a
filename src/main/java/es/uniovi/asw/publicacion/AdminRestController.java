package es.uniovi.asw.publicacion;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.uniovi.asw.model.types.UserPassInitStop;
import es.uniovi.asw.recuento.CountSystem;
import es.uniovi.asw.recuento.CountSystemFactory;
import es.uniovi.asw.recuento.CountingExecutor;



@Controller
public class AdminRestController {

  //private static final Logger LOG = LoggerFactory.getLogger(AdminRestController.class);

  /*@RequestMapping("/")
  public ModelAndView landing(Model model) {
    LOG.info("Landing page access");
    return new ModelAndView("landing");
  }*/
    
  @RequestMapping(
			value = "/iniciarRecuento",
			method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
  public ResponseEntity<String> IniciarRecuento(@RequestBody @Valid final UserPassInitStop uPS) throws Exception {
		
		if (uPS == null) {
			// throw new ResourceNotFoundException();
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		CountSystem countSystem = CountSystemFactory.newStdCountSystem(uPS.getId());
		
		CountingExecutor.register(countSystem);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
  
  @RequestMapping(
			value = "/terminarRecuento",
			method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	
public ResponseEntity<String> terminarRecuento(@RequestBody @Valid final UserPassInitStop uPS) throws Exception {
		
	  if (uPS == null) {
			// throw new ResourceNotFoundException();
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		CountSystem countSystem = CountSystemFactory.newStdCountSystem(uPS.getId());
		
		CountingExecutor.unregister(countSystem);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}

  
}