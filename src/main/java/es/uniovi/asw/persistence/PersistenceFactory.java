package es.uniovi.asw.persistence;

import es.uniovi.asw.persistence.impl.GetCandidacySImpl;
import es.uniovi.asw.persistence.impl.GetPollingStationsPImpl;
import es.uniovi.asw.persistence.impl.GetVotingsImpl;

public class PersistenceFactory {

	public static GetCandidacyS getCandidacys(){
		return new GetCandidacySImpl();
	}
	
	public static GetPollingStationsP getPollingStations(){
		return new GetPollingStationsPImpl();
	}
	
	public static GetVotings getVotings(){
		return new GetVotingsImpl();
	}
	
}
