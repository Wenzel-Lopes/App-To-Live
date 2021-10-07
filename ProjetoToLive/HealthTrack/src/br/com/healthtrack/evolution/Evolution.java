package br.com.healthtrack.evolution;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import br.com.healthtrack.client.Client;
import br.com.healthtrack.plan.Plan;
import br.com.healthtrack.training.Training;

/**
 * Classe que mostra a evolução do user
 * @author Henrique Bitancourt
 * @version 1.0
 */

public class Evolution {

	Scanner scanner = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar calendar = Calendar.getInstance();
	

	/*
	 * Atributos da classe
	 * imc
	 * height
	 * date
	 * yesNoEvolution
	 */
	private double imc;
	private double height;
	private double weight;
	private Date date;
	private int yesNoEvolution;

	/**
	 * Construtor da classe Evolution
	 * @param height coleta a altura
	 * @param weight coleta o peso
	 * @param date coleta a data
	 */
	public Evolution(double height, double weight, Date date) {
		this.height = height;
		this.weight = weight;
		this.date = date;
	}
	
	/**
	 * Acessa o atributo height
	 * @return a altura
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Altera o atributo height
	 * @param height do user
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Acessa o atributo weight
	 * @return o Peso
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Altera o atributo weight
	 * @param weight do user
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Acessa o atributo date
	 * @return a data
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Altera o atributo date
	 * @param date da alteração
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Acessa o atributo imc
	 * @param imc do user
	 */
	public void setimc(double imc) {
		this.imc = imc;
	}

	/**
	 * Método IMC
	 * @return o IMC
	 */
	public double imc() {
		return imc;
	}

	/**
	 * Altera o atributo yesNoEvolution
	 * @param yesNoEvolution a resposta da tela Evolução
	 */
	public void setYesNoEvolution(int yesNoEvolution) {
		this.yesNoEvolution = yesNoEvolution;
	}

	/**
	 * Acessa o atributo yesNoEvolution
	 * @return a resposta da tela Evolução
	 */
	public int getYesNoEvolution() {
		return yesNoEvolution;
	}

	/**
	 * exibir dados 
	 * @see status
	 */
	public void status() {
		System.out.printf("  " + sdf.format(getDate()) + " |" + " Peso: " + String.format("%.1f", getWeight()) + "kg"
				+ " |" + " Sua altura é: " + String.format("%.2f", getHeight()) + "m" + " |");

	}

	/**
	 * Cálculo do IMC
	 * @see status
	 */
	public void calculoImc() {
		this.imc = getWeight() / (getHeight() * getHeight());
		System.out.printf("%nSeu IMC é:  " + String.format("%.2f", this.imc));
		if (this.imc < 16.00) {
			System.out.println(" - Baixo peso Grau III");
		} else if (this.imc <= 16.99) {
			System.out.println(" - Baixo peso Grau II");
		} else if (this.imc <= 18.49) {
			System.out.println(" - Baixo peso Grau I");
		} else if (this.imc <= 24.99) {
			System.out.println(" - Peso Ideal");
		} else if (this.imc <= 29.99) {
			System.out.println(" - SobrePeso");
		} else if (this.imc <= 34.99) {
			System.out.println(" - Obesidade Grau I");
		} else if (this.imc <= 39.99) {
			System.out.println(" - Obesidade Grau II");
		} else if (this.imc >= 40.00) {
			System.out.println(" - Obesidade Grau III");
		}

	}

	/**
	 * Recebe os dados do user
	 * @see calculoImc
	 */
	public void yesNoEvolution() {
			System.out.println("\n\n-#-#-#-#-#-#-#-#- Evolução -#-#-#-#-#-#-#-#-\n");
			System.out.println("Informe seus dados para evolução.");
			System.out.println("-----------------------------------------------------------------------------------------------");

			System.out.print("Altura: ");
			double height = scanner.nextDouble();

			System.out.print("Peso: ");
			double weight = scanner.nextDouble();

			System.out.print("Data: ");
			Date date = calendar.getTime();

			Evolution newEvolution = new Evolution(height, weight, date);

			newEvolution.status();
			newEvolution.calculoImc();
			System.out.println();
	}
	
	/**
	 * Menu universal para navegação dentro do app
	 */
	public void menu() {
		Training training = new Training();
		Plan plan = new Plan(null, null, null);
		Client client = new Client(null, yesNoEvolution, null);
		
		System.out.print("1 - Treino | 2 - Evolução | 3 - Planos | 4 - Sair ");
		int option = scanner.nextInt();
		while (option != 1 || option != 2 || option != 3 || option != 4) {
			if (option == 1) {
				training.trainingList();
				training.training();
			
				System.out.print("1 - Treino | 2 - Evolução | 3 - Planos | 4 - Sair ");
				option = scanner.nextInt();
				System.out.println();
				enter();
			}else if (option == 2) {
				yesNoEvolution();
				client.enter();
				System.out.print("1 - Treino | 2 - Evolução | 3 - Planos | 4 - Sair ");
				option = scanner.nextInt();
				System.out.println();
				
			}else if (option == 3) {
				plan.viewPlan();
				break;
			}else if (option == 4) {
				System.out.println("\n### Até a próxima! ###");
				break;
			}else {
				System.out.println("## Valor inválido tente novamente. ##\n");
				System.out.println("-----------------------------------------------------------------------------------------------\n\n");
				System.out.print("1 - Treino | 2 - Evolução | 3 - Planos | 4 - Sair ");
				option = scanner.nextInt();
				System.out.println();
			}
		}
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
