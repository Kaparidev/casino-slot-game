package casino.service;

import java.util.List;

import casino.entity.Casino;

public interface CasinoService {
	List<Casino> getAllTransactions();
	
	Casino saveCasino(Casino casino);
	
	Casino getCasinoById(Long id);
	
	Casino updateCasino(Casino casino);
	
	Casino getbalance(Long id);
	
	Casino getusername(Long id);
	

	
}
