package br.com.healthtrack.plan;

import java.util.Scanner;

import br.com.healthtrack.client.Client;
import br.com.healthtrack.user.Access;

/**
 * Classe de verificação / confirmação de pagamento do plano
 * @author Catherina Victoria Gazzoni
 * @version 1.0
 * @see Plan
 */

public class Payment {
	Scanner scanner = new Scanner(System.in);
	

	/**
	 * atributo da classe
	 * pay
	 */
	private int pay;


	/**
	 * Construtor da classe Payment
	 * @param pay resposta do pagamento
	 */
	public Payment(int pay) {
		super();
		this.pay = pay;
	}

	/**
	 * Acessa o atributo pay
	 * @return a respota pagamento
	 */
	public int getPay() {
		return pay;
	}

	/**
	 * Altera o atributo pay
	 * @param pay a resposta do pagamento
	 */
	public void setPay(int pay) {
		this.pay = pay;
	}

	/**
	 * Verifica se o pagamento foi efetuado
	 * @see Plan
	 */
	public void payment() {
		Access access = new Access(null, null, pay, null, pay, pay);
		System.out.print("Efetuar o pagamento (1-Sim / 2-Não)? ");
		int option = scanner.nextInt();
		while (option != 1 || option != 2) {
			if (option == 1) {
				access.yesNo();
				access.login();
				break;
			} else if (option == 2) {
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("## Ok! ##\n"
						+ "*Foi enviado o boleto para o email cadastrado."
						+ "\n*Enquanto isso aproveite o plano free!");
				break;
			}else {
				System.out.println("Valor inválido tente novamente.\n");
				System.out.print("Efetuou o pagamento (1-Sim / 2-Não)? ");
				option = scanner.nextInt();
				System.out.println("-----------------------------------------------------------------------------------------------");
			}
		}
	}
	
	/**
	 * Verifica se o pagamento do plano "Empresa" foi efetuado
	 * @see Plan
	 */
	public void paymentCompany() {
		Access access = new Access(null, null, pay, null, pay, pay);
		Client client = new Client(null, pay, null);
		System.out.print("Efetuar o pagamento (1-Sim / 2-Não)? ");
		int option = scanner.nextInt();
		while (option != 1 || option != 2) {
			if (option == 1) {
				System.out.println("\n\n-#-#-#-#-#-#-#-#- Planos -#-#-#-#-#-#-#-#-\n");
				System.out.println("Plano Empresa!"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n- Acesso ilimitado a todos exercícios."
						+ "\n- Escute suas musicas durante o treino no seu app favorito."
						+ "\n- Espelhamento de tela para ter melhor visualização dos exercícios."
						+ "\n- Compartilhe os treinos e suas redes sociais."
						+ "\n- Personalize seus treinos.\n"
						+ "\n-#-#- R$ 129,90 -#-#-");
				System.out.println("-----------------------------------------------------------------------------------------------\n");
				client.enter();
				access.yesNo();
				access.login();
				break;
			} else if (option == 2) {
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("## Ok! ##\n\n"
						+ "*Foi enviado o boleto para o email cadastrado."
						+ "\n*O Associado terá acesso somente após a confirmação do pagamento.");
				break;
			}else {
				System.out.println("Valor inválido tente novamente.\n");
				System.out.print("Efetuou o pagamento (1-Sim / 2-Não)? ");
				option = scanner.nextInt();
				System.out.println("-----------------------------------------------------------------------------------------------");
			}
		}
	}
}
