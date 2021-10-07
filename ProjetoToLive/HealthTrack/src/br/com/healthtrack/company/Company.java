package br.com.healthtrack.company;

import java.util.Scanner;
import br.com.healthtrack.client.Client;

/**
 * Coleta os dados da empresa
 * @author Emerson Barros da Silva
 * @version 1.0
 */

public class Company extends Client {
	Scanner scanner = new Scanner(System.in);

	/**
	 * Atributos da classe
	 * CNPJ da empresa
	 * Senha
	 */
	private long cnpj;
	private String password;

	/**
	 * Construtor da classe Company
	 * @param name coleta o nome
	 * @param phone coleta o telefone
	 * @param email coleta o email
	 * @param cnpj coleta o cnpj
	 * @param password coleta a senha
	 */
	
	public Company(String name, long phone, String email, long cnpj, String password) {
		super(name, phone, email);
		this.cnpj = cnpj;
		this.password = password;
	}

	/**
	 * Acessa o atributo cnpj
	 * @return o CNPJ
	 */
	
	public long getCnpj() {
		return cnpj;
	}

	/**
	 * Altera o atributo cnpj
	 * @param cnpj da empresa
	 */
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * Acessa o atributo password
	 * @return a senha
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Altera o atributo password
	 * @param password do user
	 */
	public void setPassword(String password) {
		this.password = password;
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

	/**
	 * Coleta os dados da empresa
	 */
	@Override
	public void profile() {
		super.profile();
		setPassword(this.getPassword());
		System.out.print("Senha: ");
		password = scanner.nextLine();
		System.out.print("CNPJ (apenas números): ");
		cnpj = scanner.nextLong();
	}
	
	/**
	 * Mostra os dados cadastrados pela empresa
	 * @see profile
	 */
	@Override
	public void viewProfile() {
		super.viewProfile();
		System.out.println(
			" | CNPJ: " + this.getCnpj());
	}

}
