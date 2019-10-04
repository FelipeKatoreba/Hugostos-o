import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Servico implements Identificavel{

	private Integer valor;
	private int forma_de_pagamento;
	@Id
	@Column(name = "id_servicos")
	private Long id;
	
	
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public int getForma_de_pagamento() {
		return forma_de_pagamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setForma_de_pagamento(int forma_de_pagamento) {
		this.forma_de_pagamento = forma_de_pagamento;
	}
	@ManyToOne
	@JoinColumn(name = "id agendamento")
	private Agendamento agendamento;
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionário funcionario;
	public Long getId(Long id) {
		return this.id = id;
	}

}
