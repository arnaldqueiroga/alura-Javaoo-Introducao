package bytebank;

public class Criaconta {

	public static void main(String[] args) {
		Conta primeiroConta = new Conta();
		primeiroConta.saldo = 200;
		System.out.println(primeiroConta.saldo);
		
		primeiroConta.saldo +=100;
		
		System.out.println(primeiroConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.00;
		
		System.out.println("Primeira conta tem: " + primeiroConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiroConta.titular);
		

	}

}
