package action;

import hibernate.HibernateUtil;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.Pessoa;

import org.hibernate.Session;

import dao.Dao;
import dao.DaoFactory;

@ManagedBean
@SessionScoped
public class PessoaBean {
	
	Session session = HibernateUtil.getSession();
	DaoFactory fac = new DaoFactory(session);
	
	Dao<Pessoa> dao = fac.getPessoaDao();
	
	private String nome;
	private String email;
	private String usuario;
	private String senha;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void salvar() {

		Pessoa pessoa = new Pessoa(nome, email, usuario, senha);
		
		fac.beginTransaction();
		
		dao.salvar(pessoa);
		
		fac.commit();

	}
	
	public List<Pessoa> getPessoas() {

		
		return dao.listarTudo();
	}

}
