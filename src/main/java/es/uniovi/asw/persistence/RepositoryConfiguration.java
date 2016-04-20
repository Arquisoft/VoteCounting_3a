package es.uniovi.asw.persistence;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import es.uniovi.asw.model.*;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "es.uniovi.asw.model" })
@EnableJpaRepositories(basePackages = { "es.uniovi.asw.persistence" })
@EnableTransactionManagement
public class RepositoryConfiguration {
	
	/*public static CandidaturaRepository candidaturaRep;
	public static CircunscripcionRepository circunscripcionRep;
	public static ColegioRepository colegioRep;
	public static ComunidadRepository comunidadRep;
	public static EleccionRepository eleccionRep;
	public static VoterRepository voterRep;
	public static VotoRepository votoRep;
	public static VotoConfirmadoRepository votoConfirmadoRep;*/
	
	
	@Autowired
	public void setCandidaturaRep(CandidaturaRepository candidaturaRep){
		List<Eleccion> e = (List<Eleccion>)Repository.eleccionRep.findAll();
		Candidatura can1 = new Candidatura("Coca cola","Coca cola","Refresco carbonatado", e.get(0) );
		Candidatura can2 = new Candidatura("Fanta","Fanta","Refresco carbonatado sabor naranja o limon", e.get(0) );
		Candidatura can3 = new Candidatura("Nestea","Nestea","Bebida refrescante sin burbujas", e.get(0) );
		Repository.candidaturaRep = candidaturaRep;
		if(candidaturaRep.count() == 0){
			candidaturaRep.save(can1);
			candidaturaRep.save(can2);
			candidaturaRep.save(can3);
		}
	}
	
	@Autowired
	public void setCircunscripcionRep(CircunscripcionRepository circunscripcionRep){
		List<ComunidadAutonoma> ca = (List<ComunidadAutonoma>)Repository.comunidadRep.findAll();
		Circunscripcion c1 = new Circunscripcion("Gijon", ca.get(0));
		Circunscripcion c2 = new Circunscripcion("Oviedo", ca.get(0));
		Circunscripcion c3 = new Circunscripcion("Aviles", ca.get(0));
		Circunscripcion c4 = new Circunscripcion("Mieres", ca.get(0));
		Repository.circunscripcionRep = circunscripcionRep;
		
		if (circunscripcionRep.count() == 0) {
			circunscripcionRep.save(c1);
			circunscripcionRep.save(c2);
			circunscripcionRep.save(c3);
			circunscripcionRep.save(c4);
		}
	}
	
	@Autowired
	public void setColegioRep(ColegioRepository colegioRep){
		List<Circunscripcion> c = (List<Circunscripcion>)Repository.circunscripcionRep.findAll();
		ColegioElectoral colegio1 = new ColegioElectoral("Colegio de Gijon", "Poblacion gijonesa", c.get(0));
		ColegioElectoral colegio2 = new ColegioElectoral("Colegio de Oviedo", "Poblacion ovetense", c.get(1));
		Repository.colegioRep = colegioRep;
		if(colegioRep.count()==0){
			colegioRep.save(colegio1);
			colegioRep.save(colegio2);
		}
	}
	
	
	@Autowired
	public void setComunidadRep(ComunidadRepository comunidadRep){
		ComunidadAutonoma ca = new ComunidadAutonoma("Asturias");
		Repository.comunidadRep = comunidadRep;
		if (comunidadRep.count() == 0) {
			comunidadRep.save(ca);
		}
	}
	
	@Autowired
	public void setEleccionRep(EleccionRepository eleccionRep){
		Eleccion e = new Eleccion("EleccionASW", new Date(), 
				new Date(System.currentTimeMillis()+86400000), new Time(System.currentTimeMillis()), 
				new Time(System.currentTimeMillis()+100000));
		Repository.eleccionRep = eleccionRep;
		if (eleccionRep.count() == 0) {
			eleccionRep.save(e);
		}
	}
	
	@Autowired
	public void setVoterRep(VoterRepository voterRep){
		Voter v1 = new  Voter("Carlos", "email1@uniovi.es", "pass1", "7895176D");
		Voter v2 = new  Voter("Raul", "email2@uniovi.es", "pass2", "98751487D");
		Voter v3 = new  Voter("Amir", "email3@uniovi.es", "pass3", "1234567B");
		Voter v4 = new  Voter("David", "email4@uniovi.es", "pass4", "8747414D");
		Repository.voterRep = voterRep;
		if (voterRep.count() == 0) {
			voterRep.save(v1);
			voterRep.save(v2);
			voterRep.save(v3);
			voterRep.save(v4);
		}
	}
	
	@Autowired
	public void setVotoRep(VotoRepository votoRep){
		List<ColegioElectoral> c = (List<ColegioElectoral>)Repository.colegioRep.findAll();
		Voto voto = new Voto(c.get(0));
		Repository.votoRep = votoRep;
		if(votoRep.count() == 0){
			votoRep.save(voto);
		}
	}
	
	@Autowired
	public void setVotoConfirmadoRep(VotoConfirmadoRepository votoConfirmadoRep){
		List<Voter> v2 = (List<Voter>)Repository.voterRep.findAll();
		List<Eleccion> e = (List<Eleccion>)Repository.eleccionRep.findAll();
		Repository.votoConfirmadoRep = votoConfirmadoRep;
		if(votoConfirmadoRep.count() == 0){
			votoConfirmadoRep.save(new VotoConfirmado(v2.get(0), e.get(0)));
		}
	}

}
