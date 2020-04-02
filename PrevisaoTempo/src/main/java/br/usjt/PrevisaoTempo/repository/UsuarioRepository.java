package br.usjt.PrevisaoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findOneByLoginAndSenha(String login, String senha);
	
}
