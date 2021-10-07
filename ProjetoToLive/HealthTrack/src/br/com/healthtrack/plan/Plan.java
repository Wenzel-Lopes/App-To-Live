package br.com.healthtrack.plan;

import java.util.Scanner;

import br.com.healthtrack.company.Company;
import br.com.healthtrack.evolution.Evolution;
import br.com.healthtrack.training.Training;

/**
 * Classe de seleção de plano
 * @author Catherina Victoria Gazzoni
 * @version 1.0
 */
public class Plan {
	Scanner scanner = new Scanner(System.in);
	Evolution evolution = new Evolution(0, 0, null);
	Payment payment = new Payment(0);
	Training training = new Training();
	
	/**
	 * atributos da classe
	 * free
	 * gold
	 * premium
	 */

	private String free;
	private String gold;
	private String premium;
	
	/**
	 * Construtor da classe Plan
	 * @param free coleta dadosd o plano free
	 * @param gold coleta dadosd o plano gold
	 * @param premium coleta dadosd o plano premium
	 */
	public Plan(String free, String gold, String premium) {
		super();
		this.free = free;
		this.gold = gold;
		this.premium = premium;
	}

	/**
	 * Acessa o atributo free
	 * @return o plano Free
	 */
	public String getFree() {
		return free;
	}

	/**
	 * Altera o atributo free
	 * @param free plano
	 */
	public void setFree(String free) {
		this.free = free;
	}

	/**
	 * Acessa o atributo gold
	 * @return o plano Gold
	 */
	public String getGold() {
		return gold;
	}

	/**
	 * Altera o atributo gold
	 * @param gold plano
	 */
	public void setGold(String gold) {
		this.gold = gold;
	}

	/**
	 * Acessa o atributo premium
	 * @return o plano Premium
	 */
	public String getPremium() {
		return premium;
	}

	/**
	 * Altera o atributo premium
	 * @param premium plano
	 */
	public void setPremium(String premium) {
		this.premium = premium;
	}
	

	/**
	 * Seleção do plano e suas especificações
	 */
	public void viewPlan() {
		Company company = new Company(free, 0, free, 0, free);
		System.out.println("\n\n-#-#-#-#-#-#-#-#- Planos -#-#-#-#-#-#-#-#-\n");
		System.out.println("Esolha seu plano.");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.print("1 - Free | 2 - Gold | 3 - Premium | 4 - Sair ");

		int option = scanner.nextInt();	
		while (option != 1 || option != 2 || option != 3 || option != 4 || option != 5) {

			if (option == 1) {
				System.out.println();
				System.out.println("Você escolheu o plano Free!"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n- Acesso ilimitado a todos exercícios.");
				System.out.println("-----------------------------------------------------------------------------------------------\n");
				enter();
				evolution.yesNoEvolution();
				company.enter();
				training.trainingList();
				training.training();
				evolution.menu();
				break;
			} else if (option == 2) {
				System.out.println();
				System.out.println("Você escolheu o plano Gold!"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n- Acesso ilimitado a todos exercícios."
						+ "\n- Escute suas musicas durante o treino no seu app favorito."
						+ "\n- Espelhamento de tela para ter melhor visualização dos exercícios.\n"
						+ "\n-#-#- R$ 21,90 -#-#-");
				System.out.println("-----------------------------------------------------------------------------------------------\n");
				enter();
				payment.payment();
				evolution.yesNoEvolution();
				company.enter();
				training.trainingList();
				training.training();
				evolution.menu();
				break;
			} else if (option == 3) {
				System.out.println();
				System.out.println("Você escolheu o plano Premium!"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n- Acesso ilimitado a todos exercícios."
						+ "\n- Escute suas musicas durante o treino no seu app favorito."
						+ "\n- Espelhamento de tela para ter melhor visualização dos exercícios."
						+ "\n- Compartilhe os treinos e suas redes sociais."
						+ "\n- Personalize seus treinos.\n"
						+ "\n-#-#- R$ 32,90 -#-#-");
				System.out.println("-----------------------------------------------------------------------------------------------\n");				
				enter();
				payment.payment();
				evolution.yesNoEvolution();
				company.enter();
				training.trainingList();
				training.training();
				evolution.menu();
				break;
			} else if (option == 4) {
				System.out.println("\n### Até a próxima! ###");
				break;
			} else {
				System.out.println("## Valor inválido tente novamente. ##\n");
				System.out.println("-----------------------------------------------------------------------------------------------\n\n");				

				System.out.print("1 - Free | 2 - Gold | 3 - Premium | 4 - Voltar |  4 - Sair ");
				option = scanner.nextInt();
				System.out.println();
			}
		}
	}
	
	/**
	 * Descrição do plano "Empresa"
	 * @see viewPlan
	 */
	public void companyPlan() {
		System.out.println("\n-#-#-#-#-#-#-#-#- Planos -#-#-#-#-#-#-#-#-\n");
		System.out.println("Plano Empresa!"
				+ "\n-----------------------------------------------------------------------------------------------"
				+ "\n- Acesso ilimitado a todos exercícios."
				+ "\n- Escute suas musicas durante o treino no seu app favorito."
				+ "\n- Espelhamento de tela para ter melhor visualização dos exercícios."
				+ "\n- Compartilhe os treinos e suas redes sociais."
				+ "\n- Personalize seus treinos.\n"
				+ "\n-#-#- R$ 9,90 -#-#-");
		System.out.println("-----------------------------------------------------------------------------------------------\n\n");
		Payment payment = new Payment(0);
		payment.payment();
		evolution.yesNoEvolution();
		training.trainingList();
		training.training();
		evolution.menu();
	}
	
	/**
	 * Botão "Enter" para confirmar/prosseguir
	 */
	public void enter() {
		System.out.println("\nAperte ENTER para continuar...");
		scanner.nextLine();
		String option = scanner.nextLine();
		if (option == "") {
		}
	}
}