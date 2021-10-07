package br.com.healthtrack.training;

import java.util.Scanner;

import br.com.healthtrack.client.Client;
import br.com.healthtrack.evolution.Evolution;
import br.com.healthtrack.plan.Plan;

/**
 * Classe que realiza os treinos
 * @author Wenzel Vale Lopes
 * @version 1.0
 */
public class Training {
	Scanner scanner = new Scanner(System.in);
	
	/**
	 *  Lista de exerc�cios 
	 */
	public void trainingList() {
		System.out.println("\n-#-#-#-#-#-#-#-#- Treinos -#-#-#-#-#-#-#-#-\n");
		String[] trainingList = new String[10];

		trainingList[0] = "Burpee";
		trainingList[1] = "Bicicleta no ar";
		trainingList[2] = "Escalador cruzado";
		trainingList[3] = "Prancha";
		trainingList[4] = "Abdominal solo";
		trainingList[5] = "Abdominal com os p�s elevados";
		trainingList[6] = "Flex�o plantar";
		trainingList[7] = "Agachamento";
		trainingList[8] = "Agachamento isom�trico";
		trainingList[9] = "Eleva��o de perna";

		for (int i = 0; i < trainingList.length; i++) {
			System.out.println((i + 1) + " - " + trainingList[i]);
		}
	}

	/**
	 * Sele��o e execu��o dos treinos
	 * @see trainingList
	 */
	public void training() {
		Client client = new Client(null, 0, null);
		System.out.print("\nQual dos treinos acima voc� quer iniciar? ");
		int option = scanner.nextInt();
		while (option != 1 || option != 2 || option != 3 || option != 4 || option != 5 || option != 6 || option != 7
				|| option != 8 || option != 9 || option != 10) {

			if (option == 1) {
				System.out.println("\n- Burpee"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O burpee � um exerc�cio simples que trabalha o corpo todo e n�o exige uso de material e, por isso, \n"
						+ "pode ser feito em qualquer lugar. Duranteo burpee, exercita-se as costas, peito, pernas, bra�os e  \n"
						+ "bumbum, ajudando a perder gordura e peso, pois exige um enorme gasto de energia.\n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Ficar em p� e manter os p�s alinhados com os ombros. Descer o corpo para o ch�o, jogando os p�s para \n"
						+ "tr�s e levando o corpo em dire��o o ch�o, apoiando as m�os. Ficar em posi��o de prancha tocando com o \n"
						+ "peito e coxas no ch�o. Subir o tronco, empurrando com os bra�os e levantar-se, dando um pequeno salto \n"
						+ "e esticando os bra�os.\n"
						+ "\n"
						+ "Deve-se fazer 3 s�ries de 8 a 12 burpees. � importante procurar manter o ritmo durante a execu��o \n"
						+ "dos burpees para que os resultados sejam mais rapidamente atingidos. Ap�s cada s�rie, � indicado \n"
						+ "descansar por 1 minuto."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 2) {
				System.out.println("\n- Bicicleta no ar"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "A bicicleta no ar � uma varia��o de exerc�cio abdominal que combina uma flex�o de tronco e quadril  \n"
						+ "com uma rota��o de tronco, para fortalecer os m�sculos abdominais.\n\n"
						+ "Como fazer:\n"
						+ "Deitar com as costas apoiadas no ch�o. Levantar as pernas com as costas do ch�o. Simular pedalar em uma \n"
						+ "bicicleta com os p�s para cima. Alcan�ar o joelho direito quando ele estiver mais perto do abd�men, com \n"
						+ "as m�os atr�s da cabe�a, e repita o procedimento quando o esquerdo estiver mais pr�ximo.\n\n"
						+ "O ideal � fazer 4 s�ries desse exerc�cio at� completar 30 repeti��es em cada, respeitando um intervalo \n"
						+ "de 1 minuto entre elas, e tomando sempre cuidado em manter a coluna reta para evitar dor nas costas."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 3) {
				System.out.println("\n- Escalador cruzado"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O escalador cruzado ajuda a elevar a frequ�ncia card�aca porque � de alta intensidade, e dessa forma \n"
						+ "ajuda a queimar gordura, al�m de fortalecer os m�sculos do abd�men e aumentar a defini��o da barriga. \n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Apoiar as 2 m�os no ch�o. Permanecer na ponta dos p�s, mantendo o corpo parado, esticado nesta posi��o. \n"
						+ "Esticar uma perna e jog�-la para frente e para o lado, como mostra a imagem acima, alternando as duas \n"
						+ "pernas durante todo o exerc�cio.\n"
						+ "\n"
						+ "� recomendado fazer esse exerc�cio em 4 s�ries e durante 1 minuto, sem parar. Quando terminar o\n"
						+ "minuto, deve-se descansar por 30 segundos at� retomar a pr�xima s�rie."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 4) {
				System.out.println("\n- Prancha"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O exerc�cio de prancha isom�trica � muito eficiente para perder barriga e tonificar os m�sculos \n"
						+ "do abd�men, pois � feito o trabalho muscular para se manter na mesma posi��o durante alguns segundos.\n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Colocar as duas m�os paralelas no ch�o. Colocar os p�s paralelos ao ch�o e levemente separados, \n"
						+ "dividindo o peso do corpo nestes quatro apoios. Manter o alinhamento da coluna, sem elevar \n"
						+ "o quadril.\n"
						+ "\n"
						+ "� indicado sustentar o corpo por 30 segundos ou at� o tempo m�ximo que conseguir."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 5) {
				System.out.println("\n- Abdominal solo"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O abdominal solo � usado quando o objetivo � afinar a cintura, pois ajuda a definir os m�sculos \n"
						+ "da parte de cima da barriga.\n"
						+ "\n"
						+ "Como fazer:\r\n"
						+ "Deitar no ch�o, sobre um tapete ou colchonete. Dobrar os joelhos e deixar os p�s paralelos com \n"
						+ "a sola tocando o ch�o. Colocar as m�os atr�s da cabe�a e levantar o tronco, tentando fazer com \n"
						+ "que a cabe�a toque no joelho.\n"
						+ "\n"
						+ "� importante ter cuidado para n�o tirar a lombar do solo durante o exerc�cio, para evitar que \n"
						+ "apare�am dores nas costas depois. O indicado � fazer 4 s�ries de 30 repeti��es ou o m�ximo que \n"
						+ "conseguir."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 6) {
				System.out.println("\n- Abdominal com os p�s elevados"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "A abdominal com os p�s elevados pode ser feita sem apoio nas pernas ou com apoio, com uma bola de \n"
						+ "pilates ou uma cadeira.\n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Suspender os p�s. Manter os joelhos flexionados. Colocar as m�os atr�s da cabe�a. Elevar o tronco, \n"
						+ "como no abdominal solo.\n"
						+ "\n"
						+ "Quando estiver iniciando um programa de exerc�cios,  o abdominal com as pernas apoiadas em uma bola \n"
						+ "ou cadeira pode ser mais recomendado, para depois passar para um est�gio mais avan�ado, como o das \n"
						+ "pernas sem o apoio.\n"
						+ "O indicado � fazer 4 s�ries de 30 repeti��es ou o m�ximo que \n"
						+ "conseguir."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 7) {
				System.out.println("\n- Flex�o plantar"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "Esse exerc�cio ajuda a fortalecer os m�sculos da panturrilha, al�m de melhorar o equil�brio do corpo \n"
						+ "e prevenir les�es em treinos de corrida ou caminhada, por exemplo.\n"
						+ "\n"
						+ "Como fazer: \n"
						+ "apoiar-se em uma parede ou no encosto de uma cadeira. Com a coluna reta e o abd�men contra�do,\n"
						+ "ficar de ponta de p� e retornar � posi��o inicial. \n"
						+ "\n"
						+ "Esse treino pode ser feito em 3 s�ries de 12 a 20 movimentos e com 20 a 30 segundos\n"
						+ "de descanso entre cada s�rie. "
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 8) {
				System.out.println("\n- Agachamento"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O agachamento � um exerc�cio completo para as pernas pois trabalha gl�teo, coxas, panturrilha,\n"
						+ "parte posterior das pernas e abd�men.\n\n"
						+ "Como fazer: \n"
						+ "Em p�, afastar os p�s, alinhados � largura dos ombros. As costas devem sempre ficar retas e \n"
						+ "abd�men contra�do. Descer lentamente flexionando os joelhos, inclinando o tronco ligeiramente \n"
						+ "para frente e empurrando o bumbum bem para tr�s, como se fosse sentar numa cadeira invis�vel. \n"
						+ "Descer at� que os joelhos fiquem num �ngulo de 90 graus e n�o ultrapassem a ponta dos p�s. \n"
						+ "Voltar � posi��o inicial. \n\n"
						+ "Fazer 3 s�ries de 20 repeti��es com 1 minuto de descanso entre as s�ries."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 9) {
				System.out.println("\n- Agachamento isom�trico"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O agachamento isom�trico � outra forma de agachamento que trabalha os m�sculos do gl�teo, \n"
						+ "coxa, posteriores da coxa e lombar. Este agachamento tem a vantagem de ajudar a prevenir \n"
						+ "les�es, aumenta a pot�ncia, resist�ncia e defini��o muscular, al�m de fortalecer os m�sculos.\n\n"
						+ "Como fazer: \n"
						+ "Apoiar as costas em uma parede, separar as pernas a uma dist�ncia correspondente � largura \n"
						+ "dos ombros. Dobrar os joelhos e descer em dire��o ao ch�o, como se fosse sentar em uma cadeira, \n"
						+ "formando um �ngulo de 90 graus. Ficar nessa posi��o por 45 a 60 segundos e voltar � posi��o \n"
						+ "inicial. \n\n"
						+ "Repetir essa s�rie 3 vezes, com descanso de 1 minuto entre cada. Uma outra op��o de fazer o \n"
						+ "agachamento isom�trico � usar uma bola de gin�stica entre as costas e a parede."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 10) {
				System.out.println("\n- Eleva��o de perna"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "A eleva��o de perna � um exerc�cio que melhora a mobilidade, flexibilidade e for�a muscular dos \n"
						+ "gl�teos e da parte posterior da coxa, al�m dos m�sculos do quadril, podendo ajudar no equil�brio \n"
						+ "corporal. \n"
						+ "\r\n"
						+ "Como fazer: \n"
						+ "pegar uma cadeira e apoiar uma m�o na parte do encosto. Com a coluna reta e abd�men contra�do, \n"
						+ "elevar uma perna para frente e depois levar a perna para tr�s, fazendo movimentos como se a perna \n"
						+ "fosse um p�ndulo. \n"
						+ "\n"
						+ "Repetir o exerc�cio com a outra perna e voltar � posi��o inicial. Esse treino pode ser feito \n"
						+ "em 2 a 3 s�ries de 10 a 15 repeti��es."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else {
				System.out.println("\n\n## Escolha um treino v�lido. ##");
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				scanner.nextLine();
				trainingList();
				System.out.print("\nQual dos treinos acima voc� quer iniciar? ");
				option = scanner.nextInt();
				System.out.println(
						"-----------------------------------------------------------------------------------------------");
			}
		}
	}

	/**
	 * Menu de op��es ap�s finalizar o treino
	 * @see training
	 */
	public void trainingFinish() {
		Plan plan = new Plan(null, null, null);
		Evolution evolution = new Evolution(0, 0, null);
		System.out.print("1 - Treino | 2 - Evolu��o | 3 - Planos | 4 - Sair ");
		int option = scanner.nextInt();
		while (option != 1 || option != 2 || option != 3 || option != 4) {
			if (option == 1) {
				trainingList();
				training();
				break;
			}else if (option == 2) {
				evolution.yesNoEvolution();
				break;
			}else if (option == 3) {
				plan.viewPlan();
				break;
			}else if (option == 4) {
				System.out.println("\n### At� a pr�xima! ###");
				break;
			}else {
				System.out.println("## Valor inv�lido tente novamente. ##\n");
				System.out.println("-----------------------------------------------------------------------------------------------\n\n");
				System.out.print("1 - Treino | 2 - Evolu��o | 3 - Planos | 4 - Sair ");
				option = scanner.nextInt();
				System.out.println();
			}
		}
	}
	
	/**
	 * Mensagem de dicas de treino para o user
	 * @see trainingFinish
	 */
	public void enter() {
		System.out.println("\nAperte ENTER para continuar...");
		scanner.nextLine();
		String option = scanner.nextLine();
		if (option == "") {
			System.out.println("Recomenda��es para os exerc�cios\n"
					+ "-----------------------------------------------------------------------------------------------\n"
					+ "� muito IMPORTANTE beber �gua entre os exerc�cios, usar roupas adequadas de gin�stica e preparar \n"
					+ "o ambiente para a atividade, pois alguns movimentos podem precisar de um espa�o maior para serem \n"
					+ "realizados. Se surgir algum desconforto, como dor na coluna ou joelho, � importante evitar fazer \n"
					+ "o exerc�cio at� a avalia��o de um m�dico, para que a sa�de n�o seja prejudicada."
					+ "\n-----------------------------------------------------------------------------------------------\n");
		}

	}
}
