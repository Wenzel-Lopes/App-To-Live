package br.com.healthtrack;

import java.util.Locale;
import java.util.Scanner;

import br.com.healthtrack.associate.Associate;
import br.com.healthtrack.client.Client;
import br.com.healthtrack.company.Company;
import br.com.healthtrack.evolution.Evolution;
import br.com.healthtrack.plan.Payment;
import br.com.healthtrack.plan.Plan;
import br.com.healthtrack.user.User;

/**
 * Classe executavel
 * @author Emerson Barros da Silva
 * @version 1.0
 */

public class Executable {
	
	/**
	 * Executável
	 * @param args argumentos
	 */	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		User user = new User(null, null, 0, null, 0, 0);
		Company company = new Company(null, 0, null, 0, null);
		Associate associate = new Associate(null, null, 0, null, 0, 0, 0);
		Plan plan = new Plan(null, null, null);
		Evolution evolution = new Evolution(0, 0, null);
		Client client = new Client(null, 0, null);
		Payment payment = new Payment(0);
		
		System.out.println("\n-#-#-#-#-#-#-#-#- TO LIVE -#-#-#-#-#-#-#-#-");
		System.out.println("\n             Seja bem vindo(a)\n\n");
		System.out.println("TO LIVE é um aplicativo para exercícios que respeita o fator humano, \n"
				+ "por isso é mais indicado para iniciantes, direcionado principalmente \n"
				+ "para aquelas pessoas que não gostam de academia, não gostam de seguir \n"
				+ "dietas restritivas e possuem dificuldade em manter uma rotina de exercícios.\n"
				+ "\n-#- Change Starts Now! -#-\n");
		
		client.enter();
		System.out.print("1 - Cadastrar Usuário | 2 - Cadastrar Empresa | 3 - Associado |  4 - Sair: ");

		int option = scanner.nextInt();
		System.out.println();

		while (option != 1 || option != 2 || option != 3 || option != 4 || option != 5) {

			if (option == 1) {
				user.profile();
				user.viewProfile();
				System.out.println("\n-----------------------------------------------------------------------------------------------\n");
				evolution.enter();
				evolution.menu();
				System.out.println();
				break;
			} else if (option == 2) {

				company.profile();
				System.out.println();
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				company.viewProfile();
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				System.out.println("\n-#- EMPRESA CADASTRADA! -#-\n\n"
						+ "Os colaboradores da empresa " + company.getName() + " tem acesso ao # TO LIVE # através do menu Associado.\n");
				client.enter();
				payment.paymentCompany();
				client.enter();
				System.out.println("\n\n-#-#-#-#-#-#-#-#- TO LIVE -#-#-#-#-#-#-#-#-");
				System.out.println("\n             Change Starts Now!\n");
				System.out.print("1 - Cadastrar Usuário | 2 - Cadastrar Empresa | 3 - Associado |  4 - Sair: ");
				option = scanner.nextInt();
				System.out.println();
			} else if (option == 3) {

				associate.profile();
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				associate.viewProfile();
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				evolution.enter();
				System.out.println();
				plan.companyPlan();
			
				break;
			} else if (option == 4) {
				System.out.println("Até a próxima!");
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				break;
			} else {
				System.out.println("Valor inválido tente novamente.\n");
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				System.out.print("1 - Cadastrar Usuário | 2 - Cadastrar Empresa | 3 - Associado | 4 - Sair: ");
				option = scanner.nextInt();
				System.out.println();
			}
		}

		scanner.close();
	}
}
