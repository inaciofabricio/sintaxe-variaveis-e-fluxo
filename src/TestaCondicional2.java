
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais:");

		int idade = 17;
		int quantidadePessoas = 3;
		
//		boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("Valor de Acompanhado: " + acompanhado);
		
//		if (idade >= 18 || quantidadePessoas >= 2) {
//			System.out.println("Seja bem vindo!");
//		} else {
//			System.out.println("Infelizmente você não pode entrar!");
//		}

//		if (idade >= 18 && quantidadePessoas >= 2) {
//			System.out.println("Seja bem vindo!");
//		} else {
//			System.out.println("Infelizmente você não pode entrar!");
//		}
		
//		if (idade >= 18 && acompanhado) {
//			System.out.println("Seja bem vindo!");
//		} else {
//			System.out.println("Infelizmente você não pode entrar!");
//		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
		
	}

}
