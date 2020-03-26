package br.usjt.PrevisaoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.model.PrevTempo;

public interface PrevTempoRepository extends JpaRepository<PrevTempo, Long>{

}
