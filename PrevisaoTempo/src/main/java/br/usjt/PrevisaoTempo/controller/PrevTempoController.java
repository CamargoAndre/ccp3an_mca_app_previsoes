package br.usjt.PrevisaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoTempo.model.PrevTempo;
import br.usjt.PrevisaoTempo.service.PrevTempoService;

@Controller
public class PrevTempoController {
	
	//a injeção de dependência ocorre aqui
	//@Autowired
	//private PrevTempoRepository prevTempoRepo;
	@Autowired
	private PrevTempoService prevTempoService;
	
	@GetMapping("/tempo")
	public ModelAndView listarPrevisaoTempo() {
		
		//passe o nome da pagina ao contrutor
		ModelAndView mv = new ModelAndView("listar_previsao_tempo");
		
		//Busque a coleção com o repositório
		List<PrevTempo> prevsTemp = prevTempoService.listarTodos();
		
		//Adicione a coleção ao objeto ModelAndView
		mv.addObject("temp", prevsTemp);
		
		//mv.addObject(new PrevTempo());
		
		//devolva o ModelAndView
		return mv;
		
	}
	

}
