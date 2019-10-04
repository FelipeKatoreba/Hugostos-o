
public class ControleComercialimpl implements ControleComercial {

	@Override
	public Servico RealizarServico(String nome, int valor, Long id) throws NomeInvalidoException {
		DAO<Servico> dao = new DAO<Servico>();
		Servico s = new Servico();
		s.setValor(valor);
		s.setId(id);

		dao.save(s);
		return s;
	}

	@Override
	public Funcion�rio adicionarFuncion�rio(String nome, int salario, String email, int Telefone, Long id)
			throws NomeInvalidoException, DepositoNaoFeitoException, EmailInvalidoException, TelefoneInvalidoException {
		DAO<Funcion�rio> dao = new DAO<Funcion�rio>();
		Funcion�rio f = new Funcion�rio();
		f.setId(id);
		f.setEmail(email);
		f.setTelefone(Telefone);
		f.setNome(nome);
		dao.save(f);
		return f;
	}

	@Override
	public Cliente adicionarCliente(String nome, int Telefone, Long id, Long CPF, String Endereco)
			throws NomeInvalidoException, TelefoneInvalidoException, CPFInvalidoException, EnderecoInvalidoException {
		DAO<Cliente> dao = new DAO<Cliente>();
		Cliente c = new Cliente();
		c.setTelefone(Telefone);
		c.setNome(nome);
		c.setCPF(CPF);
		c.setEndereco(Endereco);
		c.setId(id);
		dao.save(c);
		return c;
	}

	@Override
	public Agendamento marcarAgendamento(Long id) throws AgendamentoInvalidoException {
		new DAO<Agendamento>();
		Agendamento a = new Agendamento();
		a.setId(id);
		return a;
	}

	@Override
	public Comida adicionarComida(int tipo, Long id) throws TipoInvalidoException {
		new DAO<Comida>();
		Comida co = new Comida();
		co.setId(id);
		co.setTipo(tipo);
		return co;
	}

}
