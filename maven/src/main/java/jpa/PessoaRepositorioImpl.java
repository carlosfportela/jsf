package jpa;

import java.util.List;

import model.Pessoa;

public class PessoaRepositorioImpl extends RepositorioImpl<Pessoa, Long> implements PessoaRepositorio{

	public PessoaRepositorioImpl(Class<Pessoa> clas) {
		super(clas);
		// TODO Auto-generated constructor stub
	}

	public List<Pessoa> consultaEspecifica() {
		// TODO Auto-generated method stub
		return null;
	}

}
