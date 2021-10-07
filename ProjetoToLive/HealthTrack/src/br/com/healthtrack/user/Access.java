package br.com.healthtrack.user;

import java.util.Scanner;

/**
 * Classe que possui os dados do cliente e faz a validação do pagamento 
 * @author Emerson Barros da Silva 
 * @version 1.0
 * @see User
 */
public class Access extends User {
	Scanner scanner = new Scanner(System.in);

	/**
	 * Resposta sim / não
	 */
	private int yesNo;

	/**
	 * Construtor da classe Access
	 * @param name coleta nome
	 * @param email coleta email
	 * @param phone coleta telefone
	 * @param password coleta senha
	 * @param cpf coleta CPF
	 * @param age coleta idade
	 */
	public Access(String name, String email, long phone, String password, long cpf, int age) {
		super(name, email, phone, password, cpf, age);
	}

	/**
	 * Aceitar logar
	 * @return login
	 */
	public int getYesNo() {
		return yesNo;
	}

	/**
	 * Válidação da resposta
	 * @param yesNo resposta
	 */
	public void setYesNo(int yesNo) {
		this.yesNo = yesNo;
	}

	/**
	 * Solicita o login do user
	 * @see User
	 */
	public void yesNo() {
		System.out.print("\nDigite seu email e senha para efetuar o pagamento.\n");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.print("Email: ");
		super.email = scanner.nextLine();
		System.out.print("Senha: ");
		super.password = scanner.nextLine();
	}

}
