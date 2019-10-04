
public class Main {

	
	public static void main(String[] args) {
		ControleComercialimpl c = new ControleComercialimpl();
		try {
			c.adicionarCliente("felipe", 888, 1l, 111l, "awsfrd");
		} catch (NomeInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TelefoneInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EnderecoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
