import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Agendamento implements Identificavel {

	public Long getId1() {
		return id1;
	}

	public void setId1(Long id1) {
		this.id1 = id1;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "id_agendamento")
	@Id
	private Long id1;

	public Long getId() {
		return id;
	}

	public void setId_agendamento(Long id_agendamento) {
		this.id1 = id_agendamento;
	}

	Long id;

	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionário funcionario;

	@OneToMany(mappedBy = "agendamento")
	private Set<Servico> servicos;

	public void setId11(Long id2) {
		// TODO Auto-generated method stub
		
	}

}
