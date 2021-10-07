package br.com.healthtrack.client;

import java.util.Scanner;

/**
 * Coleta os dados do user
 * @author Emerson Barros da Silva
 * @version 1.0
 */

public class Client {
	Scanner scanner = new Scanner(System.in);

	/**
	 * Atributos da classe
	 * nome usuário
	 * phone usuário
	 * email usuário
	 */
	private String name;
	private long phone;
	protected String email;

	/**
	 * Construtor da classe Client
	 * @param name coleta nome
	 * @param phone coleta telefone
	 * @param email coleta email
	 */
	
	public Client(String name, long phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;

	}

	/**
	 * Acessa o atributo name
	 * @return o nome
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Altera o atributo nome
	 * @param name coletado
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Acessa o atributo phone
	 * @return o telefone
	 */
	public long getPhone() {
		return phone;
	}
	
	/**
	 * Altera o atributo phone
	 * @param phone do user
	 */
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	/**
	 * Acessa o atributo email
	 * @return o email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Altera o atributo email
	 * @param email do user
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Cadastrar dados do user
	 */
	public void profile() {
		System.out.println("Informe seus dados");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.print("Nome: ");
		name = scanner.nextLine();
		System.out.print("Telefone: ");
		phone = scanner.nextLong();
		System.out.print("Email: ");
		scanner.nextLine();
		email = scanner.nextLine();

	}
	
	/**
	 * Mostra os dados cadastrados
	 * @see profile
	 */
	public void viewProfile() {
		System.out.println();
		System.out.println();
		System.out.println("Dados cadastrados");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.printf("Nome: " + this.getName() + " | Telefone: " + this.getPhone() + " | Email: " + this.getEmail());
	}
	
	/**
	 * Botão Enter para prosseguir
	 */
	public void enter() {
		System.out.println("\nAperte ENTER para continuar...");
		String option = scanner.nextLine();
		if (option == "") {
		}
	}
}
