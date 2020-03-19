package br.usjt.PrevisaoTempo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.model.PrevisaoTemperatura;

public interface PrevisaoTempoRepository extends JpaRepository<PrevisaoTemperatura, Long>{

}
