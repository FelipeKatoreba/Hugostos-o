
public interface ControleComercial {

	public Servico RealizarServico(
			String nome,
			int valor,
			Long id)
	throws NomeInvalidoException;
	
	public Funcionário adicionarFuncionário(
			String nome,
			int salario,
			String email,
			int Telefone,
			Long id)
	throws NomeInvalidoException, DepositoNaoFeitoException, EmailInvalidoException, TelefoneInvalidoException;
	
	public Cliente adicionarCliente(
			String nome,
			int Telefone,
			Long id,
			Long CPF,
			String Endereco)
	throws NomeInvalidoException, TelefoneInvalidoException, CPFInvalidoException, EnderecoInvalidoException;
	
	public Agendamento marcarAgendamento(
			Long id)
	throws AgendamentoInvalidoException;
	
	public Comida adicionarComida(
			int tipo,
			Long id)
	throws TipoInvalidoException;
			
			
			
			
	
	
			
			
			
			
			
	
}
