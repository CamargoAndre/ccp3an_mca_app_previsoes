package br.usjt.PrevisaoTempo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoTempo.Repository.PrevTempoRepository;
import br.usjt.PrevisaoTempo.model.PrevTempo;

@Controller
public class PrevTempoController {
	
	//a injeção de dependência ocorre aqui
	@Autowired
	private PrevTempoRepository prevTempoRepo;
	
	@GetMapping("/prevtempo")
	public ModelAndView listarPrevisaoTempo() {
		
		//passe o nome da pagina ao contrutor
		ModelAndView mv = new ModelAndView("listar_previsao_tempo");
		
		//Busque a coleção com o repositório
		List<PrevTempo> prevsTemp = prevTempoRepo.findAll();
		
		//Adicione a coleção ao objeto ModelAndView
		mv.addObject("prevsTemps", prevsTemp);
		
		//devolva o ModelAndView
		return mv;
		
	}
	

}
