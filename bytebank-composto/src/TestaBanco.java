
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "12345678";
		paulo.profissao = "desenvolvedor";		
		
		Conta contaPaulo = new Conta();
		
		contaPaulo.deposita(100.00);
		
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular.nome);

	}

}
