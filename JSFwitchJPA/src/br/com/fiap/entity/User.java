package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_USER")
@SequenceGenerator(name="sqUser", sequenceName="SQ_T_USER", allocationSize=1)
public class User {

	@Id
	@GeneratedValue(generator="sqUser", strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int cod;
	
	@Column(name="nm_user", nullable=false, length=50)
	private String nomeLogin;
	
	@Column(name="ds_emailUser", nullable=false)
	private String email;
	
	@Column(name="ds_password", nullable=false)
	private String senhaLogin;
	
	@Column(name="nr_age", nullable=false)
	private int idade;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_register")
	private Calendar dataCadastro;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNomeLogin() {
		return nomeLogin;
	}

	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenhaLogin() {
		return senhaLogin;
	}

	public void setSenhaLogin(String senhaLogin) {
		this.senhaLogin = senhaLogin;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
