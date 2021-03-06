package br.usjt.PrevisaoTempo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		
		//pegar a sessão
		HttpSession session = request.getSession();
		
		//se ainda não logou, manda para a pagina de login
		if(session.getAttribute("usuarioLogado") == null) {
			
			response.sendRedirect("login");
		}
		
		//se já logou, deixa a requesição passar e chegar no controller
		return true;
		
		
	}

}
