package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Audited
@SequenceGenerator(name="seq_pessoa",sequenceName="seq_pessoa",allocationSize=1)
@Table(name="pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(generator="seq_pessoa",strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="senha")
	private String senha;

	
	public Pessoa(String nome, String email, String usuario, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	
	public Pessoa() {
		super();
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
	

}
