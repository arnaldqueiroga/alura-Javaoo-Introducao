package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100.00;		
		contaDoPaulo.deposita(50.00);		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);		
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000.00);
		
		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Faltou grana");
		}
		
		System.out.println(contaDaMarcela.saldo);
		
		System.out.println(contaDoPaulo.saldo);
		
		
		
		
		

	}

}
