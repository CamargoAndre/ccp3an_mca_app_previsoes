package br.usjt.PrevisaoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.PrevisaoTempo.model.PrevTempo;
import br.usjt.PrevisaoTempo.repository.PrevTempoRepository;

@Service
public class PrevTempoService {
	
	@Autowired
	private PrevTempoRepository prevTempoRepo;
	
	public List<PrevTempo> listarTodos(){
		
		return prevTempoRepo.findAll();
		
	}
	
	public void salvar(PrevTempo prevTempo) {
		
		prevTempoRepo.save(prevTempo);
		
	}
	

}
