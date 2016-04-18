package es.uniovi.asw.persistence;

import java.sql.Time;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "es.uniovi.asw.model" })
@EnableJpaRepositories(basePackages = { "es.uniovi.asw.persistence" })
@EnableTransactionManagement
public class RepositoryConfiguration {
	
	public static CandidaturaRepository candidaturaRep;
	public static CircunscripcionRepository circunscripcionRep;
	public static ColegioRepository colegioRep;
	public static ComunidadRepository comunidadRep;
	public static EleccionRepository eleccionRep;
	public static VoterRepository voterRep;
	public static VotoRepository votoRep;
	public static VotoConfirmadoRepository votoConfirmadoRep;
	
	@Autowired
	public void setCandidaturaRep(CandidaturaRepository candidaturaRep){
		Repository.candidaturaRep = candidaturaRep;
	}
	
	@Autowired
	public void setCircunscripcionRep(CircunscripcionRepository circunscripcionRep){
		Repository.circunscripcionRep = circunscripcionRep;
		
		if (circunscripcionRep.count() == 0) {
			circunscripcionRep.save(new Circunscripcion("Gijon", new ComunidadAutonoma("Asturias")));
			circunscripcionRep.save(new Circunscripcion("Oviedo", new ComunidadAutonoma("Asturias")));
			circunscripcionRep.save(new Circunscripcion("Gijon", new ComunidadAutonoma("Asturias")));
			circunscripcionRep.save(new Circunscripcion("Gijon", new ComunidadAutonoma("Asturias")));
		}
	}
	
	@Autowired
	public void setColegioRep(ColegioRepository colegioRep){
		Repository.colegioRep = colegioRep;
	}
	
	@Autowired
	public void setComunidadRep(ComunidadRepository comunidadRep){
		Repository.comunidadRep = comunidadRep;
	}
	
	@Autowired
	public void setEleccionRep(EleccionRepository eleccionRep){
		Repository.eleccionRep = eleccionRep;
		if (eleccionRep.count() == 0) {
			EleccionRepository.save(new Eleccion("EleccionASW", new Date(), 
					new Date("01/01/2017"), new Time(System.currentTimeMillis()), 
					new Time(System.currentTimeMillis()+100000)));
		}
	}
	
	@Autowired
	public void setVoterRep(VoterRepository voterRep){
		Repository.voterRep = voterRep;
		if (voterRep.count() == 0) {
			VoterRepository.save(new  Voter("Carlos", "email1@uniovi.es", "pass1", "7895176D"));
			VoterRepository.save(new  Voter("Raul", "email2@uniovi.es", "pass2", "98751487D"));
			VoterRepository.save(new  Voter("Amir", "email3@uniovi.es", "pass3", "1234567B"));
			VoterRepository.save(new  Voter("David", "email4@uniovi.es", "pass4", "8747414D"));
		}
	}
	
	@Autowired
	public void setVotoRep(VotoRepository votoRep){
		Repository.votoRep = votoRep;
	}
	
	@Autowired
	public void setVotoConfirmadoRep(VotoConfirmadoRepository votoConfirmadoRep){
		Repository.votoConfirmadoRep = votoConfirmadoRep;
	}

}
