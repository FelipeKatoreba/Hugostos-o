import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Comida implements Identificavel {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	int tipo;
	@Id
	@Column( name =  "id_comida")
	private Long id;
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
