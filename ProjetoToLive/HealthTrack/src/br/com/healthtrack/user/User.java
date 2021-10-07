package br.com.healthtrack.user;

import java.util.Scanner;

import br.com.healthtrack.client.Client;

/**
 * Classe que coleta os dados e confirma o login do user
 * @author Emerson Barros da Silva
 * @version 1.0
 * @see Access
 */
public class User extends Client {
	Scanner scanner = new Scanner(System.in);

	/**
	 * atributos da classe
	 * password
	 * cpf
	 * age
	 */
	protected String password;
	private long cpf;
	private int age;

	/**
	 * Construtor da classe Access
	 * @param name coleta nome
	 * @param email coleta email
	 * @param phone coleta telefone
	 * @param password coleta senha
	 * @param cpf coleta CPF
	 * @param age coleta idade
	 * @see Access
	 */
	public User(String name, String email, long phone, String password, long cpf, int age) {
		super(name, phone, email);
		this.password = password;
		this.cpf = cpf;
		this.age = age;
	}

	/**
	 * Acessa o atributo password
	 * @return a senha
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Altera a senha
	 * @param password senha do user
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Acessa o atributo cpf
	 * @return cpf do user
	 */
	public long getCpf() {
		return cpf;
	}

	/**
	 * Altera o atributo cpf
	 * @param cpf do user
	 */
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	/**
	 * Acessa o atributo age
	 * @return age do user
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Altera o atributo age
	 * @param age do user
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Coleta os dados do user
	 * @see Access
	 */
	@Override
	public void profile() {
		super.profile();
		System.out.print("Senha: ");
		password = scanner.nextLine();
		System.out.print("CPF (apenas números): ");
		cpf = scanner.nextLong();
		System.out.print("Idade: ");
		age = scanner.nextInt();
	}
	
	/**
	 * Mostra os dados que o user preencheu
	 * @see profile
	 */
	@Override
	public void viewProfile() {
		super.viewProfile();
		System.out.printf(" | CPF: " + this.getCpf() + " | Idade: " + this.getAge() + " anos");
	}

	/**
	 * Faz o login do user
	 * @see viewProfile
	 */
	public void login() {
		Access access = new Access(password, password, cpf, password, cpf, age);

		if (super.email.equals(access.email) && access.password.equals(password)) {
			System.out.println("\n\\o/ Pagamento realizado! \\o/ \nUhu!!! Seja bem vindo(a).");

		} else if (super.email != (access.email) || access.password != password) {
			while (super.email != (access.email) || access.password != password) {
				System.out.println();
				System.out.println("# Login negado! #\nTente novamente!");
				System.out.println("-----------------------------------------------------------------------------------------------\n\n");
				System.out.print("Digite seu email: ");
				super.email = scanner.nextLine();
				System.out.print("Digite sua senha: ");
				password = scanner.nextLine();

				if (this.email.equals(access.getEmail()) && password.equals(password)) {
					System.out.println("\n\\o/ Pagamento realizado! \\o/ \nUhu!!! Seja bem vindo(a).");
					System.out.println("-----------------------------------------------------------------------------------------------\n\n");
					break;
				} else {
					System.out.println();
					System.out.println("## Bloqueado! ##\nExecute novamente.\n");
					System.out.println("¯\\_(-,-)_/¯");
					break;
				}

			}

		} else {
			System.out.println("## inválido execute novamente ##");
		}
	}
}
