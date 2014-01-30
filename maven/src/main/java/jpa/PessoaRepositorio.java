package jpa;

import java.util.List;

import model.Pessoa;

public interface PessoaRepositorio extends Repositorio<Pessoa, Long>{
	
	public List<Pessoa> consultaEspecifica();

}
