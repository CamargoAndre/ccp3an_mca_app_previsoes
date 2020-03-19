package br.usjt.PrevisaoTempo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoTempo.Repository.PrevisaoTempoRepository;
import br.usjt.PrevisaoTempo.model.PrevisaoTempo;

@Controller
public class PrevisaoTempoController {
	
	//a injeção de dependência ocorre aqui
	@Autowired
	private PrevisaoTempoRepository prevTempoRepo;
	
	@GetMapping("/previsoestempo")
	public ModelAndView listarPrevisaoTempo() {
		
		//passe o nome da pagina ao contrutor
		ModelAndView mv = new ModelAndView("listar_previsao_tempo");
		
		//Busque a coleção com o repositório
		List<PrevisaoTempo> previsoesTempo = prevTempoRepo.findAll();
		
		//Adicione a coleção ao objeto ModelAndView
		mv.addObject("previsoesTempo", previsoesTempo);
		
		//devolva o ModelAndView
		return mv;
		
	}
	

}
