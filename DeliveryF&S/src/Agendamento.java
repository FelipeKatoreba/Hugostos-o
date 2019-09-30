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
public class Agendamento {
	@Id
	@Column(name = "id_agendamento")
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
	
	
	
	
}
