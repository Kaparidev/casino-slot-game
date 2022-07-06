package casino.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import casino.entity.Casino;
import casino.repository.CasinoRepository;
import casino.service.CasinoService;

@Service
public class CasinoServiceImpl implements CasinoService{

	private CasinoRepository casinoRepository;
	
	public CasinoServiceImpl(CasinoRepository casinoRepository) {
		super();
		this.casinoRepository = casinoRepository;
	}

	@Override
	public List<Casino> getAllTransactions() {
		return casinoRepository.findAll();
	}

	@Override
	public Casino saveCasino(Casino casino) {
		return casinoRepository.save(casino);
	}

	@Override
	public Casino getCasinoById(Long id) {
		return casinoRepository.findById(id).get();
	}

	@Override
	public Casino updateCasino(Casino casino) {
		return casinoRepository.save(casino);
	}

	@Override
	public Casino getbalance(Long id) {
		
		return casinoRepository.findById(id).get();
	}

	@Override
	public Casino getusername(Long id) {
		
		return casinoRepository.findById(id).get();
	}

	
}
