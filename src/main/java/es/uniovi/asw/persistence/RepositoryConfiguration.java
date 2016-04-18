package es.uniovi.asw.persistence;

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
		Repository.candidaturaRep = candidaturaRep;
	}
	
	@Autowired
	public void setCircunscripcionRep(CircunscripcionRepository circunscripcionRep){
		Repository.circunscripcionRep = circunscripcionRep;
		
		if (circunscripcionRep.count() == 0) {
			// TODO Añadir datos de ejemplo.
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
	}
	
	@Autowired
	public void setVoterRep(VoterRepository voterRep){
		Repository.voterRep = voterRep;
		if (voterRep.count() == 0) {
			// TODO Añadir datos de ejemplo.
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
