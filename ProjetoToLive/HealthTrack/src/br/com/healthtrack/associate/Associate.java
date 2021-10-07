package br.com.healthtrack.associate;

import java.util.Scanner;

import br.com.healthtrack.user.User;

/**
 * Coleta os dados do user
 * @author Emerson Barros da Silva
 * @version 1.0
 */

public class Associate extends User {
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * CNPJ do user empresa
	 */
	
	private long cnpj;

	/**
	 * Construtor da classe Associate
	 * @param name coleta nome
	 * @param email coleta o email
	 * @param phone coleta o telefone
	 * @param password coleta a senha
	 * @param cpf coleta o cpf
	 * @param age coleta a idade
	 * @param cnpj coleta o cnpj
	 */
	
	public Associate(String name, String email, long phone, String password, long cpf, int age, long cnpj) {
		super(name, email, phone, password, cpf, age);
		this.cnpj = cnpj;
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
	 * Coleta o CNPJ
	 */
	// métodos herdados e sobrescritos
		@Override
		public void profile() {
			super.profile();
			System.out.print("CNPJ da empresa (apenas números): ");
			cnpj = scanner.nextLong();
		}
		
		/**
		 * Mostra os dados cadastrados
		 */
		
		@Override
		public void viewProfile() {
			super.viewProfile();
			System.out.println(
					" | CNPJ da empresa: " + this.getCnpj());
		}
}
