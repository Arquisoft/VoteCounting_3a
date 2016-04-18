package es.uniovi.asw.persistence;

import java.sql.Time;
import java.util.Date;

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
	ComunidadAutonoma ca = new ComunidadAutonoma("Asturias");
	Circunscripcion c1 = new Circunscripcion("Gijon", ca);
	Circunscripcion c2 = new Circunscripcion("Oviedo", ca);
	Circunscripcion c3 = new Circunscripcion("Aviles", ca);
	Circunscripcion c4 = new Circunscripcion("Mieres", ca);
	Eleccion e = new Eleccion("EleccionASW", new Date(), 
			new Date(System.currentTimeMillis()+86400000), new Time(System.currentTimeMillis()), 
			new Time(System.currentTimeMillis()+100000));
	Candidatura can1 = new Candidatura("PP","Partido Popular","ti tiri tiririririi", e );
	Candidatura can2 = new Candidatura("PSOE","Partido Socialista","zz", e );
	Candidatura can3 = new Candidatura("Podemos","Partido de Podemos","Presidente con coleta", e );
	ColegioElectoral colegio1 = new ColegioElectoral("Colegio de Gijon", "Poblacion gijonesa", c1);
	ColegioElectoral colegio2 = new ColegioElectoral("Colegio de Oviedo", "Poblacion ovetense", c2);
	Voter v1 = new  Voter("Carlos", "email1@uniovi.es", "pass1", "7895176D");
	Voter v2 = new  Voter("Raul", "email2@uniovi.es", "pass2", "98751487D");
	Voter v3 = new  Voter("Amir", "email3@uniovi.es", "pass3", "1234567B");
	Voter v4 = new  Voter("David", "email4@uniovi.es", "pass4", "8747414D");
	Voto voto = new Voto(colegio1);
	
	
	@Autowired
	public void setCandidaturaRep(CandidaturaRepository candidaturaRep){
		Repository.candidaturaRep = candidaturaRep;
		if(candidaturaRep.count() == 0){
			candidaturaRep.save(can1);
			candidaturaRep.save(can2);
			candidaturaRep.save(can3);
		}
	}
	
	@Autowired
	public void setCircunscripcionRep(CircunscripcionRepository circunscripcionRep){
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
		Repository.colegioRep = colegioRep;
		if(colegioRep.count()==0){
			colegioRep.save(colegio1);
			colegioRep.save(colegio2);
		}
	}
	
	@Autowired
	public void setComunidadRep(ComunidadRepository comunidadRep){
		Repository.comunidadRep = comunidadRep;
		if (comunidadRep.count() == 0) {
			comunidadRep.save(ca);
		}
	}
	
	@Autowired
	public void setEleccionRep(EleccionRepository eleccionRep){
		Repository.eleccionRep = eleccionRep;
		if (eleccionRep.count() == 0) {
			eleccionRep.save(e);
		}
	}
	
	@Autowired
	public void setVoterRep(VoterRepository voterRep){
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
		Repository.votoRep = votoRep;
		if(votoRep.count() == 0){
			votoRep.save(voto);
		}
	}
	
	@Autowired
	public void setVotoConfirmadoRep(VotoConfirmadoRepository votoConfirmadoRep){
		Repository.votoConfirmadoRep = votoConfirmadoRep;
		if(votoConfirmadoRep.count() == 0){
			votoConfirmadoRep.save(new VotoConfirmado(v2, e));
		}
	}

}
