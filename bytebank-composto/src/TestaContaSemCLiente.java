
public class TestaContaSemCLiente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		
		System.out.println(contaDaMarcela.titular.nome);

	}

}
