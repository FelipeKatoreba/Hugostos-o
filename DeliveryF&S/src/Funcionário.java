import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Funcion�rio implements Identificavel {
	private int telefone;
	private String email;
	@Column(name = "id_funcionario")
	@Id

	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String nome;

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToMany(mappedBy = "funcionario")
	private Set<Agendamento> agendamentos;

	@OneToMany(mappedBy = "funcionario")
	private Set<Servico> servicos;
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}

	public void setId1(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public void setId11(Long id) {
		// TODO Auto-generated method stub
		
	}

}
