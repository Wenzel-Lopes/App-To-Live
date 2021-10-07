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
	 *  Lista de exercícios 
	 */
	public void trainingList() {
		System.out.println("\n-#-#-#-#-#-#-#-#- Treinos -#-#-#-#-#-#-#-#-\n");
		String[] trainingList = new String[10];

		trainingList[0] = "Burpee";
		trainingList[1] = "Bicicleta no ar";
		trainingList[2] = "Escalador cruzado";
		trainingList[3] = "Prancha";
		trainingList[4] = "Abdominal solo";
		trainingList[5] = "Abdominal com os pés elevados";
		trainingList[6] = "Flexão plantar";
		trainingList[7] = "Agachamento";
		trainingList[8] = "Agachamento isométrico";
		trainingList[9] = "Elevação de perna";

		for (int i = 0; i < trainingList.length; i++) {
			System.out.println((i + 1) + " - " + trainingList[i]);
		}
	}

	/**
	 * Seleção e execução dos treinos
	 * @see trainingList
	 */
	public void training() {
		Client client = new Client(null, 0, null);
		System.out.print("\nQual dos treinos acima você quer iniciar? ");
		int option = scanner.nextInt();
		while (option != 1 || option != 2 || option != 3 || option != 4 || option != 5 || option != 6 || option != 7
				|| option != 8 || option != 9 || option != 10) {

			if (option == 1) {
				System.out.println("\n- Burpee"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O burpee é um exercício simples que trabalha o corpo todo e não exige uso de material e, por isso, \n"
						+ "pode ser feito em qualquer lugar. Duranteo burpee, exercita-se as costas, peito, pernas, braços e  \n"
						+ "bumbum, ajudando a perder gordura e peso, pois exige um enorme gasto de energia.\n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Ficar em pé e manter os pés alinhados com os ombros. Descer o corpo para o chão, jogando os pés para \n"
						+ "trás e levando o corpo em direção o chão, apoiando as mãos. Ficar em posição de prancha tocando com o \n"
						+ "peito e coxas no chão. Subir o tronco, empurrando com os braços e levantar-se, dando um pequeno salto \n"
						+ "e esticando os braços.\n"
						+ "\n"
						+ "Deve-se fazer 3 séries de 8 a 12 burpees. É importante procurar manter o ritmo durante a execução \n"
						+ "dos burpees para que os resultados sejam mais rapidamente atingidos. Após cada série, é indicado \n"
						+ "descansar por 1 minuto."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 2) {
				System.out.println("\n- Bicicleta no ar"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "A bicicleta no ar é uma variação de exercício abdominal que combina uma flexão de tronco e quadril  \n"
						+ "com uma rotação de tronco, para fortalecer os músculos abdominais.\n\n"
						+ "Como fazer:\n"
						+ "Deitar com as costas apoiadas no chão. Levantar as pernas com as costas do chão. Simular pedalar em uma \n"
						+ "bicicleta com os pés para cima. Alcançar o joelho direito quando ele estiver mais perto do abdômen, com \n"
						+ "as mãos atrás da cabeça, e repita o procedimento quando o esquerdo estiver mais próximo.\n\n"
						+ "O ideal é fazer 4 séries desse exercício até completar 30 repetições em cada, respeitando um intervalo \n"
						+ "de 1 minuto entre elas, e tomando sempre cuidado em manter a coluna reta para evitar dor nas costas."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 3) {
				System.out.println("\n- Escalador cruzado"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O escalador cruzado ajuda a elevar a frequência cardíaca porque é de alta intensidade, e dessa forma \n"
						+ "ajuda a queimar gordura, além de fortalecer os músculos do abdômen e aumentar a definição da barriga. \n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Apoiar as 2 mãos no chão. Permanecer na ponta dos pés, mantendo o corpo parado, esticado nesta posição. \n"
						+ "Esticar uma perna e jogá-la para frente e para o lado, como mostra a imagem acima, alternando as duas \n"
						+ "pernas durante todo o exercício.\n"
						+ "\n"
						+ "É recomendado fazer esse exercício em 4 séries e durante 1 minuto, sem parar. Quando terminar o\n"
						+ "minuto, deve-se descansar por 30 segundos até retomar a próxima série."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 4) {
				System.out.println("\n- Prancha"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O exercício de prancha isométrica é muito eficiente para perder barriga e tonificar os músculos \n"
						+ "do abdômen, pois é feito o trabalho muscular para se manter na mesma posição durante alguns segundos.\n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Colocar as duas mãos paralelas no chão. Colocar os pés paralelos ao chão e levemente separados, \n"
						+ "dividindo o peso do corpo nestes quatro apoios. Manter o alinhamento da coluna, sem elevar \n"
						+ "o quadril.\n"
						+ "\n"
						+ "É indicado sustentar o corpo por 30 segundos ou até o tempo máximo que conseguir."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 5) {
				System.out.println("\n- Abdominal solo"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O abdominal solo é usado quando o objetivo é afinar a cintura, pois ajuda a definir os músculos \n"
						+ "da parte de cima da barriga.\n"
						+ "\n"
						+ "Como fazer:\r\n"
						+ "Deitar no chão, sobre um tapete ou colchonete. Dobrar os joelhos e deixar os pés paralelos com \n"
						+ "a sola tocando o chão. Colocar as mãos atrás da cabeça e levantar o tronco, tentando fazer com \n"
						+ "que a cabeça toque no joelho.\n"
						+ "\n"
						+ "É importante ter cuidado para não tirar a lombar do solo durante o exercício, para evitar que \n"
						+ "apareçam dores nas costas depois. O indicado é fazer 4 séries de 30 repetições ou o máximo que \n"
						+ "conseguir."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 6) {
				System.out.println("\n- Abdominal com os pés elevados"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "A abdominal com os pés elevados pode ser feita sem apoio nas pernas ou com apoio, com uma bola de \n"
						+ "pilates ou uma cadeira.\n"
						+ "\n"
						+ "Como fazer:\n"
						+ "Suspender os pés. Manter os joelhos flexionados. Colocar as mãos atrás da cabeça. Elevar o tronco, \n"
						+ "como no abdominal solo.\n"
						+ "\n"
						+ "Quando estiver iniciando um programa de exercícios,  o abdominal com as pernas apoiadas em uma bola \n"
						+ "ou cadeira pode ser mais recomendado, para depois passar para um estágio mais avançado, como o das \n"
						+ "pernas sem o apoio.\n"
						+ "O indicado é fazer 4 séries de 30 repetições ou o máximo que \n"
						+ "conseguir."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 7) {
				System.out.println("\n- Flexão plantar"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "Esse exercício ajuda a fortalecer os músculos da panturrilha, além de melhorar o equilíbrio do corpo \n"
						+ "e prevenir lesões em treinos de corrida ou caminhada, por exemplo.\n"
						+ "\n"
						+ "Como fazer: \n"
						+ "apoiar-se em uma parede ou no encosto de uma cadeira. Com a coluna reta e o abdômen contraído,\n"
						+ "ficar de ponta de pé e retornar à posição inicial. \n"
						+ "\n"
						+ "Esse treino pode ser feito em 3 séries de 12 a 20 movimentos e com 20 a 30 segundos\n"
						+ "de descanso entre cada série. "
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 8) {
				System.out.println("\n- Agachamento"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O agachamento é um exercício completo para as pernas pois trabalha glúteo, coxas, panturrilha,\n"
						+ "parte posterior das pernas e abdômen.\n\n"
						+ "Como fazer: \n"
						+ "Em pé, afastar os pés, alinhados à largura dos ombros. As costas devem sempre ficar retas e \n"
						+ "abdômen contraído. Descer lentamente flexionando os joelhos, inclinando o tronco ligeiramente \n"
						+ "para frente e empurrando o bumbum bem para trás, como se fosse sentar numa cadeira invisível. \n"
						+ "Descer até que os joelhos fiquem num ângulo de 90 graus e não ultrapassem a ponta dos pés. \n"
						+ "Voltar à posição inicial. \n\n"
						+ "Fazer 3 séries de 20 repetições com 1 minuto de descanso entre as séries."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 9) {
				System.out.println("\n- Agachamento isométrico"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "O agachamento isométrico é outra forma de agachamento que trabalha os músculos do glúteo, \n"
						+ "coxa, posteriores da coxa e lombar. Este agachamento tem a vantagem de ajudar a prevenir \n"
						+ "lesões, aumenta a potência, resistência e definição muscular, além de fortalecer os músculos.\n\n"
						+ "Como fazer: \n"
						+ "Apoiar as costas em uma parede, separar as pernas a uma distância correspondente à largura \n"
						+ "dos ombros. Dobrar os joelhos e descer em direção ao chão, como se fosse sentar em uma cadeira, \n"
						+ "formando um ângulo de 90 graus. Ficar nessa posição por 45 a 60 segundos e voltar à posição \n"
						+ "inicial. \n\n"
						+ "Repetir essa série 3 vezes, com descanso de 1 minuto entre cada. Uma outra opção de fazer o \n"
						+ "agachamento isométrico é usar uma bola de ginástica entre as costas e a parede."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else if (option == 10) {
				System.out.println("\n- Elevação de perna"
						+ "\n-----------------------------------------------------------------------------------------------\n"
						+ "A elevação de perna é um exercício que melhora a mobilidade, flexibilidade e força muscular dos \n"
						+ "glúteos e da parte posterior da coxa, além dos músculos do quadril, podendo ajudar no equilíbrio \n"
						+ "corporal. \n"
						+ "\r\n"
						+ "Como fazer: \n"
						+ "pegar uma cadeira e apoiar uma mão na parte do encosto. Com a coluna reta e abdômen contraído, \n"
						+ "elevar uma perna para frente e depois levar a perna para trás, fazendo movimentos como se a perna \n"
						+ "fosse um pêndulo. \n"
						+ "\n"
						+ "Repetir o exercício com a outra perna e voltar à posição inicial. Esse treino pode ser feito \n"
						+ "em 2 a 3 séries de 10 a 15 repetições."
						+ "\n-----------------------------------------------------------------------------------------------\n");
				enter();
				client.enter();
				break;
			} else {
				System.out.println("\n\n## Escolha um treino válido. ##");
				System.out.println(
						"-----------------------------------------------------------------------------------------------\n");
				scanner.nextLine();
				trainingList();
				System.out.print("\nQual dos treinos acima você quer iniciar? ");
				option = scanner.nextInt();
				System.out.println(
						"-----------------------------------------------------------------------------------------------");
			}
		}
	}

	/**
	 * Menu de opções após finalizar o treino
	 * @see training
	 */
	public void trainingFinish() {
		Plan plan = new Plan(null, null, null);
		Evolution evolution = new Evolution(0, 0, null);
		System.out.print("1 - Treino | 2 - Evolução | 3 - Planos | 4 - Sair ");
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
	 * Mensagem de dicas de treino para o user
	 * @see trainingFinish
	 */
	public void enter() {
		System.out.println("\nAperte ENTER para continuar...");
		scanner.nextLine();
		String option = scanner.nextLine();
		if (option == "") {
			System.out.println("Recomendações para os exercícios\n"
					+ "-----------------------------------------------------------------------------------------------\n"
					+ "É muito IMPORTANTE beber água entre os exercícios, usar roupas adequadas de ginástica e preparar \n"
					+ "o ambiente para a atividade, pois alguns movimentos podem precisar de um espaço maior para serem \n"
					+ "realizados. Se surgir algum desconforto, como dor na coluna ou joelho, é importante evitar fazer \n"
					+ "o exercício até a avaliação de um médico, para que a saúde não seja prejudicada."
					+ "\n-----------------------------------------------------------------------------------------------\n");
		}

	}
}
