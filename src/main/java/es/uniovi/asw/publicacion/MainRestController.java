package es.uniovi.asw.publicacion;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.Repository;

@RestController
public class MainRestController {

	@RequestMapping(value = "/elecciones",
			method = RequestMethod.GET,
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Eleccion>> GetListOfElecciones() throws Exception {
		System.out.println("/elecciones");
		List<Eleccion> elecciones = (List<Eleccion>) Repository.eleccionRep.findAll();
		return  new ResponseEntity<List<Eleccion>>(elecciones, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/eleccion/{id}",
			method = RequestMethod.GET,
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<String> GetResultsOf(@PathVariable("id") String id) throws Exception {

		

		return  new ResponseEntity<String>("{}", HttpStatus.OK);
	}
}
