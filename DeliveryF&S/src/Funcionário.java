import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Funcionário {
	private int telefone;
	private String email;
	@Id
	@Column(name = "id_funcionario")
	private Long id;
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

}
