package Hitss.Treinamento.Controller;

import java.util.Scanner; /// *** Importando Assembly

import javax.sound.midi.Soundbank; /// *** Importando Assembly

import Hitss.Treinamento.Repository.LutadorRepository; /// *** Importando
import Hitss.Treinamento.Classes.Lutador; /// *** Importando
import Hitss.Treinamento.Enums.ECategoria; /// *** Importando
import Hitss.Treinamento.Enums.EStatus; /// *** Importando
import Hitss.Treinamento.Repository.LutadorRepositoryActuallyatributes; /// *** Importando

public class LutadorController {
	/// *** Declaração da Controller Lutador	
	public void Reproduzir() { /// *** Reproduzir a Controller Lutador
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("         Hitss Treinamento"); /// *** Enunciado do Programa
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Selecione a opção desejada:"); /// *** O Programa Pede para Selecionar a Opção Desejada
		System.out.println("(1) - Apresentar Lutador"); /// *** Opção 1 - Apresentar o Lutador
		System.out.println("(2) - Verificar o Status do Lutador"); /// *** Opção 2 - Verificar o Status do Lutador
		System.out.println("(3) - Verificar o Número de Vitórias do Lutador"); /// *** Opção 3 - Verificar o Número de Vitórias do Lutador
		System.out.println("(4) - Verificar o Número de Perdas do Lutador"); /// *** Opção 4 - Verificar o Núemro de Perdas do Lutador
		System.out.println("(5) - Verificar o Número de Empates do Lutador"); /// *** Opção 5 - Verificar o Número de Empates do Lutador
		System.out.println("(6) - Listar todos os Lutadores"); /// *** Opção 6 - Listar Todos os Lutadores
		System.out.println("(7) - Listar todas as Vitórias de Todos os Lutadores"); /// *** Opção 7 - Listar todas as Vitórias dos Lutadores
		System.out.println("(8) - Listar todas as Derrotas de Todos os Lutadores"); /// *** Opção 8 - Listar todas as Derrotas dos Lutadores
		System.out.println("(9) - Listar todos os Empates de Todos os Lutadores"); /// *** Opção 9 - Listar todos os Empates dos Lutadores
		System.out.println(""); /// *** Pula 1 Linha
		try { /// *** Inicialização do Tratamento
			
			Scanner teclado = new Scanner(System.in); /// *** Comando para digitar o Valor pelo Teclado
			
			int opcao = teclado.nextInt(); /// *** Declaração da Variável que vai receber o comando para digitar o seu valor pelo teclado
			
			System.out.println(""); /// *** Pula 1 Linha
			
			LutadorRepository lutadorRepository = new LutadorRepository(); /// *** Declaração do Repositório do Lutador
			
			Lutador lutador = new Lutador(); /// *** Declaração do Objeto Lutador
			
			LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes = new LutadorRepositoryActuallyatributes(); /// *** Declaração dos Repositórios Getters e Setters dos Atributos do Objeto Lutador
			
			switch (opcao) { /// *** Inicialização do Case 
			case 1: /// *** Caso seja Opção 1
				System.out.println(""); /// *** Pula 1 Linha
				System.out.println("Digite o Código do Lutador:"); /// *** O Programa pede para digitar o Código do Lutador
				System.out.println(""); /// *** Pula 1 Linha
				int cod = teclado.nextInt(); /// *** Declaração da Variável ponteiro para digitar o código do Lutador
				
				int[] Codigo = new int[6]; /// *** Declaração do Vetor do Código do Lutador
				Codigo[1] = 1; /// *** Vetor 1 Recebe 1
				Codigo[2] = 2; /// *** Vetor 2 Recebe 2
				Codigo[3] = 3; /// *** Vetor 3 Recebe 3
				Codigo[4] = 4; /// *** Vetor 4 Recebe 4
				Codigo[5] = 5; /// *** Vetor 5 Recebe 5
				
				
				String[] Nome = new String[6]; /// *** Declaração do Vetor Nome do Lutador
				Nome[1] = "João Rico"; /// *** Vetor 1 Recebe: João Rico
				Nome[2] = "Spider Nobre"; /// *** Vetor 2 Recebe Spider Nobre
				Nome[3] = "João Maçarico"; /// *** Vetor 3 Recebe João Maçarico
				Nome[4] = "Rob Alicate"; /// *** Vetor 4 Recebe Rob Alicate
				Nome[5] = "Biu Rocha"; /// *** Vetor 5 Recebe Biu Rocha
				
				
				String[] Nacionalidade = new String[6]; /// *** Declaração do Vetor Nacionalidade
				Nacionalidade[1] = "Português"; /// *** Vetor 1 Recebe Português
				Nacionalidade[2] = "Mexicano"; /// *** Vetor 2 Recebe Mexicano
				Nacionalidade[3] = "Americano"; /// *** Vetor 3 Recebe Americano
				Nacionalidade[4] = "Brasileiro"; /// *** Vetor 4 Recebe Brasileiro
				Nacionalidade[5] = "Brasileiro"; /// *** Vetor 5 Recebe Brasileiro
				
				
				int[] Idade = new int[6]; /// *** Declaração do vetor Idade
				Idade[1] = 42; /// *** Vetor 1 Recebe 42
				Idade[2] = 28; /// *** Vetor 2 Recebe 28
				Idade[3] = 38; /// *** Vetor 3 Recebe 38
				Idade[4] = 35; /// *** Vetor 4 Recebe 35
				Idade[5] = 31; /// *** Vetor 5 Recebe 31
				
				
				double[] Altura = new double[6]; /// *** Declaração do Vetor Altura
				Altura[1] = 1.93; /// *** Vetor 1 Recebe 1.93
				Altura[2] = 1.86; /// *** Vetor 2 Recebe 1.86
				Altura[3] = 1.82; /// *** Vetor 3 Recebe 1.82
				Altura[4] = 1.78; /// *** Vetor 4 Recebe 1.78
				Altura[5] = 1.81; /// *** Vetor 5 Recebe 1.81
				
				
				double[] Peso = new double[6]; /// *** Declaração do Vetor Peso
				Peso[1] = 95.5; /// *** Vetor 1 Recebe 95.5
				Peso[2] = 108.3; /// *** Vetor 2 Recebe 108.3
				Peso[3] = 65.4; /// *** Vetor 3 Recebe 65.4
				Peso[4] = 73; /// *** Vetor 4 Recebe 73
				Peso[5] = 74; /// *** Vetor 5 Recebe 74
				
				
				ECategoria[] Categoria = new ECategoria[6]; /// *** Declaração do Vetor Categoria
				Categoria[1] = ECategoria.Pesado; /// *** Vetor 1 Recebe Pesado
				Categoria[2] = ECategoria.Pesado; /// *** Vetor 2 Recebe Pesado
				Categoria[3] = ECategoria.Medio; /// *** Vetor 3 Recebe Médio
				Categoria[4] = ECategoria.Pesado; /// *** Vetor 4 Recebe Pesado
				Categoria[5] = ECategoria.Pesado; /// *** Vetor 5 Recebe Pesado
				
				
				int[] Vitoria = new int[6]; /// *** Declaração do Vetor Vitória do Lutador
				Vitoria[1] = 108; /// *** Vetor 1 Recebe 108
				Vitoria[2] = 84; /// *** Vetor 2 Recebe 84
				Vitoria[3] = 203; /// *** Vetor 3 Recebe 203
				Vitoria[4] = 75; /// *** Vetor 4 Recebe 75
				Vitoria[5] = 56; /// *** Vetor 5 Recebe 56
				
				
				int[] Derrota = new int[6]; /// *** Declaração do Vetor Derrota
				Derrota[1] = 15; /// *** Vetor 1 Reecbe 15
				Derrota[2] = 10; /// *** Vetor 2 Recebe 10
				Derrota[3] = 82; /// *** Vetor 3 Recebe 82
				Derrota[4] = 3; /// *** Vetor 4 Recebe 3
				Derrota[5] = 7; /// *** Vetor 5 Recebe 7
				
				
				int[] Empate = new int[6]; /// *** Declaração do Vetor Empate
				Empate[1] = 10; /// *** Vetor 1 Recebe 10
				Empate[2] = 18; /// *** Vetor 2 Recebe 18
				Empate[3] = 53; /// *** Vetor 3 Recebe 53
				Empate[4] = 0; /// *** Vetor 4 Recebe 0
				Empate[5] = 0; /// *** Vetor 5 Recebe 0
				
				
				EStatus[] status = new EStatus[6]; /// *** Declaração do Vetor status 
				status[1] = EStatus.Aposentado; /// *** Vetor 1 Recebe Aposentado
				status[2] = EStatus.Ativo; /// *** Vetor 2 Recebe Ativo
				status[3] = EStatus.Desclassificado; /// *** Vetor 3 Recebe Desclassificado
				status[4] = EStatus.Desclassificado; /// *** Vetor 4 Recebe Desclassificado
				status[5] = EStatus.Ativo; /// *** Vetor 5 Recebe Ativo
				
				lutadorRepositoryActuallyatributes.setId(lutador, Codigo[cod]); /// *** Código do Lutador Recebe o Vetor Código
				lutadorRepositoryActuallyatributes.setNome(lutador, Nome[cod]); /// *** Nome do Lutador Recebe o Vetor Nome
				lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade[cod]); /// *** Nacionalidade do Lutador Recebe o Vetor Nacionalidade
				lutadorRepositoryActuallyatributes.setIdade(lutador, Idade[cod]); /// *** Idade do Lutador Recebe o Vetor Idade
				lutadorRepositoryActuallyatributes.setAltura(lutador, Altura[cod]); /// *** Altura do Lutador Recebe o Vetor Altura
				lutadorRepositoryActuallyatributes.setPeso(lutador, Peso[cod]); /// *** Peso do Lutador Recebe o Vetor Peso do Lutador 
				lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria[cod]); /// *** Categoria do Lutador Recebe o Vetor Categoria do Lutador
				lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria[cod]); /// *** Vitória do Lutador Recebe o Vetor Vitória do Lutador
				lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota[cod]); /// *** Derrota do Lutador Recebe o Vetor Vitória do Lutador
				lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate[cod]); /// *** Empate do Lutador Recebe o Vetor Empate do Lutador
				lutadorRepositoryActuallyatributes.setStatus(lutador, status[cod]); /// *** Status do Lutador Recebe o Vetor Status do Lutador
		
				if (cod == lutadorRepositoryActuallyatributes.GetId(lutador)) { /// *** Se o Código do Dígito For Igual ao Id do Lutador
					lutadorRepository.Apresentar(lutador, lutadorRepositoryActuallyatributes); /// *** Reproduzir o Método de Apresentar Lutador
				} else { /// *** Se não for encontrada nenhuma busca do lutador
					System.out.println(""); /// *** Pula 1 Linha
					System.out.println("        Resultado da Pesquisa"); /// *** Enunciado do Resultado da Pesquisa
					System.out.println("--------------------------------------"); /// *** Conceito de Perfumaria
					System.out.println("Nenhum Lutador encontrado."); /// *** O Programa Informando que não foi encontrado nenhum lutador
					System.out.println("--------------------------------------"); /// *** Conceito de Perfumaria
				}
				

				break; /// *** Para o Programa
			case 2: /// *** Caso se a Opção for 2
				System.out.println(""); /// *** Pula 1 Linha
				System.out.println("Digite o Código do Lutador:"); /// *** O Programa Pede Para Digitar o Código do Lutador
				System.out.println(""); /// *** Pula 1 Linha
				int cod2 = teclado.nextInt(); /// *** O Comando Para Poder Digitar o Valor do Código
				
				int[] Codigo2 = new int[6]; /// *** Vetor Código do Lutador
				Codigo2[1] = 1; /// *** Vetor 1 Recebe 1
				Codigo2[2] = 2; /// *** Vetor 2 Recebe 2
				Codigo2[3] = 3; /// *** Vetor 3 Recebe 3
				Codigo2[4] = 4; /// *** Vetor 4 Recebe 4
				Codigo2[5] = 5; /// *** Vetor 5 Recebe 5
				
				
				String[] Nome2 = new String[6]; /// *** Vetor Nome do Lutador
				Nome2[1] = "João Rico"; /// *** Vetor 1 Recebe João Rico
				Nome2[2] = "Spider Nobre"; /// *** Vetor 2 Recebe Spider Nobre
				Nome2[3] = "João Maçarico"; /// *** Vetor 3 Recebe João Maçarico
				Nome2[4] = "Rob Alicate"; /// *** Vetor 4 Recebe Rob Alicate
				Nome2[5] = "Biu Rocha"; /// *** Vetor 5 Recebe Biu Rocha
				
				
				String[] Nacionalidade2 = new String[6]; /// *** Vetor Nacionalidade do Lutador
				Nacionalidade2[1] = "Português"; /// *** Vetor 1 Recebe Português
				Nacionalidade2[2] = "Mexicano"; /// *** Vetor 2 Recebe Mexicano
				Nacionalidade2[3] = "Americano"; /// *** Vetor 3 Recebe Americano
				Nacionalidade2[4] = "Brasileiro"; /// *** Vetor 4 Recebe Brasileiro
				Nacionalidade2[5] = "Brasileiro"; /// *** Vetor 5 Recebe Brasileiro
				
				
				int[] Idade2 = new int[6]; /// *** Vetor Idade do Lutador
				Idade2[1] = 42; /// *** Vetor 1 Recebe 42
				Idade2[2] = 28; /// *** Vetor 2 Recebe 28
				Idade2[3] = 38; /// *** Vetor 3 Recebe 38
				Idade2[4] = 35; /// *** Vetor 4 Recebe 35
				Idade2[5] = 31; /// *** Vetor 5 Recebe 31
				
				
				double[] Altura2 = new double[6]; /// *** Vetor Altura do Lutador
				Altura2[1] = 1.93; /// *** Vetor 1 Recebe 1.93
				Altura2[2] = 1.86; /// *** Vetor 2 Recebe 1.86
				Altura2[3] = 1.82; /// *** Vetor 3 Recebe 1.82
				Altura2[4] = 1.78; /// *** Vetor 4 Recebe 1.78
				Altura2[5] = 1.81; /// *** Vetor 5 Recebe 1.81
				
				
				double[] Peso2 = new double[6]; /// *** Vetor Peso do Lutador
				Peso2[1] = 95.5; /// *** Vetor 1 Recebe 95.5
				Peso2[2] = 108.3; /// *** Vetor 2 Recebe 108.3
				Peso2[3] = 65.4; /// *** Vetor 3 Recebe 65.4
				Peso2[4] = 73;
				Peso2[5] = 74;
				
				
				ECategoria[] Categoria2 = new ECategoria[6];
				Categoria2[1] = ECategoria.Pesado;
				Categoria2[2] = ECategoria.Pesado;
				Categoria2[3] = ECategoria.Medio;
				Categoria2[4] = ECategoria.Pesado;
				Categoria2[5] = ECategoria.Pesado;
				
				
				int[] Vitoria2 = new int[6];
				Vitoria2[1] = 108;
				Vitoria2[2] = 84;
				Vitoria2[3] = 203;
				Vitoria2[4] = 75;
				Vitoria2[5] = 56;
				
				
				int[] Derrota2 = new int[6];
				Derrota2[1] = 15;
				Derrota2[2] = 10;
				Derrota2[3] = 82;
				Derrota2[4] = 3;
				Derrota2[5] = 7;
				
				
				int[] Empate2 = new int[6];
				Empate2[1] = 10;
				Empate2[2] = 18;
				Empate2[3] = 53;
				Empate2[4] = 0;
				Empate2[5] = 0;
				
				
				EStatus[] status2 = new EStatus[6];
				status2[1] = EStatus.Aposentado;
				status2[2] = EStatus.Ativo;
				status2[3] = EStatus.Desclassificado;
				status2[4] = EStatus.Desclassificado;
				status2[5] = EStatus.Ativo;
				
				lutadorRepositoryActuallyatributes.setId(lutador, Codigo2[cod2]);
				lutadorRepositoryActuallyatributes.setNome(lutador, Nome2[cod2]);
				lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade2[cod2]);
				lutadorRepositoryActuallyatributes.setIdade(lutador, Idade2[cod2]);
				lutadorRepositoryActuallyatributes.setAltura(lutador, Altura2[cod2]);
				lutadorRepositoryActuallyatributes.setPeso(lutador, Peso2[cod2]);
				lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria2[cod2]);
				lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria2[cod2]);
				lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota2[cod2]);
				lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate2[cod2]);
				lutadorRepositoryActuallyatributes.setStatus(lutador, status2[cod2]);
		
				if (cod2 == lutadorRepositoryActuallyatributes.GetId(lutador)) {
					
				lutadorRepository.Status(lutador, lutadorRepositoryActuallyatributes);
				} else {
					System.out.println("");
					System.out.println("        Resultado da Pesquisa");
					System.out.println("--------------------------------------");
					System.out.println("Nenhum Lutador encontrado.");
					System.out.println("--------------------------------------");
				}
				break;
			case 3:
				System.out.println("");
				System.out.println("Digite o Código do Lutador:");
				System.out.println("");
				int cod3 = teclado.nextInt();
				
				int[] Codigo3 = new int[6];
				Codigo3[1] = 1;
				Codigo3[2] = 2;
				Codigo3[3] = 3;
				Codigo3[4] = 4;
				Codigo3[5] = 5;
				
				
				String[] Nome3 = new String[6];
				Nome3[1] = "João Rico";
				Nome3[2] = "Spider Nobre";
				Nome3[3] = "João Maçarico";
				Nome3[4] = "Rob Alicate";
				Nome3[5] = "Biu Rocha";
				
				
				String[] Nacionalidade3 = new String[6];
				Nacionalidade3[1] = "Português";
				Nacionalidade3[2] = "Mexicano";
				Nacionalidade3[3] = "Americano";
				Nacionalidade3[4] = "Brasileiro";
				Nacionalidade3[5] = "Brasileiro";
				
				
				int[] Idade3 = new int[6];
				Idade3[1] = 42;
				Idade3[2] = 28;
				Idade3[3] = 38;
				Idade3[4] = 35;
				Idade3[5] = 31;
				
				
				double[] Altura3 = new double[6];
				Altura3[1] = 1.93;
				Altura3[2] = 1.86;
				Altura3[3] = 1.82;
				Altura3[4] = 1.78;
				Altura3[5] = 1.81;
				
				
				double[] Peso3 = new double[6];
				Peso3[1] = 95.5;
				Peso3[2] = 108.3;
				Peso3[3] = 65.4;
				Peso3[4] = 73;
				Peso3[5] = 74;
				
				
				ECategoria[] Categoria3 = new ECategoria[6];
				Categoria3[1] = ECategoria.Pesado;
				Categoria3[2] = ECategoria.Pesado;
				Categoria3[3] = ECategoria.Medio;
				Categoria3[4] = ECategoria.Pesado;
				Categoria3[5] = ECategoria.Pesado;
				
				
				int[] Vitoria3 = new int[6];
				Vitoria3[1] = 108;
				Vitoria3[2] = 84;
				Vitoria3[3] = 203;
				Vitoria3[4] = 75;
				Vitoria3[5] = 56;
				
				
				int[] Derrota3 = new int[6];
				Derrota3[1] = 15;
				Derrota3[2] = 10;
				Derrota3[3] = 82;
				Derrota3[4] = 3;
				Derrota3[5] = 7;
				
				
				int[] Empate3 = new int[6];
				Empate3[1] = 10;
				Empate3[2] = 18;
				Empate3[3] = 53;
				Empate3[4] = 0;
				Empate3[5] = 0;
				
				
				EStatus[] status3 = new EStatus[6];
				status3[1] = EStatus.Aposentado;
				status3[2] = EStatus.Ativo;
				status3[3] = EStatus.Desclassificado;
				status3[4] = EStatus.Desclassificado;
				status3[5] = EStatus.Ativo;
				
				lutadorRepositoryActuallyatributes.setId(lutador, Codigo3[cod3]);
				lutadorRepositoryActuallyatributes.setNome(lutador, Nome3[cod3]);
				lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade3[cod3]);
				lutadorRepositoryActuallyatributes.setIdade(lutador, Idade3[cod3]);
				lutadorRepositoryActuallyatributes.setAltura(lutador, Altura3[cod3]);
				lutadorRepositoryActuallyatributes.setPeso(lutador, Peso3[cod3]);
				lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria3[cod3]);
				lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria3[cod3]);
				lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota3[cod3]);
				lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate3[cod3]);
				lutadorRepositoryActuallyatributes.setStatus(lutador, status3[cod3]);
		
				if (cod3 == lutadorRepositoryActuallyatributes.GetId(lutador)) {
				lutadorRepository.GanharLutar(lutador, lutadorRepositoryActuallyatributes);
				} else {
					System.out.println("");
					System.out.println("        Resultado da Pesquisa");
					System.out.println("--------------------------------------");
					System.out.println("Nenhum Lutador encontrado.");
					System.out.println("--------------------------------------");
				}
				break;
			case 4:
				System.out.println("");
				System.out.println("Digite o Código do Lutador:");
				System.out.println("");
				int cod4 = teclado.nextInt();
				
				int[] Codigo4 = new int[6];
				Codigo4[1] = 1;
				Codigo4[2] = 2;
				Codigo4[3] = 3;
				Codigo4[4] = 4;
				Codigo4[5] = 5;
				
				
				String[] Nome4 = new String[6];
				Nome4[1] = "João Rico";
				Nome4[2] = "Spider Nobre";
				Nome4[3] = "João Maçarico";
				Nome4[4] = "Rob Alicate";
				Nome4[5] = "Biu Rocha";
				
				
				String[] Nacionalidade4 = new String[6];
				Nacionalidade4[1] = "Português";
				Nacionalidade4[2] = "Mexicano";
				Nacionalidade4[3] = "Americano";
				Nacionalidade4[4] = "Brasileiro";
				Nacionalidade4[5] = "Brasileiro";
				
				
				int[] Idade4 = new int[6];
				Idade4[1] = 42;
				Idade4[2] = 28;
				Idade4[3] = 38;
				Idade4[4] = 35;
				Idade4[5] = 31;
				
				
				double[] Altura4 = new double[6];
				Altura4[1] = 1.93;
				Altura4[2] = 1.86;
				Altura4[3] = 1.82;
				Altura4[4] = 1.78;
				Altura4[5] = 1.81;
				
				
				double[] Peso4 = new double[6];
				Peso4[1] = 95.5;
				Peso4[2] = 108.3;
				Peso4[3] = 65.4;
				Peso4[4] = 73;
				Peso4[5] = 74;
				
				
				ECategoria[] Categoria4 = new ECategoria[6];
				Categoria4[1] = ECategoria.Pesado;
				Categoria4[2] = ECategoria.Pesado;
				Categoria4[3] = ECategoria.Medio;
				Categoria4[4] = ECategoria.Pesado;
				Categoria4[5] = ECategoria.Pesado;
				
				
				int[] Vitoria4 = new int[6];
				Vitoria4[1] = 108;
				Vitoria4[2] = 84;
				Vitoria4[3] = 203;
				Vitoria4[4] = 75;
				Vitoria4[5] = 56;
				
				
				int[] Derrota4 = new int[6];
				Derrota4[1] = 15;
				Derrota4[2] = 10;
				Derrota4[3] = 82;
				Derrota4[4] = 3;
				Derrota4[5] = 7;
				
				
				int[] Empate4 = new int[6];
				Empate4[1] = 10;
				Empate4[2] = 18;
				Empate4[3] = 53;
				Empate4[4] = 0;
				Empate4[5] = 0;
				
				
				EStatus[] status4 = new EStatus[6];
				status4[1] = EStatus.Aposentado;
				status4[2] = EStatus.Ativo;
				status4[3] = EStatus.Desclassificado;
				status4[4] = EStatus.Desclassificado;
				status4[5] = EStatus.Ativo;
				
				lutadorRepositoryActuallyatributes.setId(lutador, Codigo4[cod4]);
				lutadorRepositoryActuallyatributes.setNome(lutador, Nome4[cod4]);
				lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade4[cod4]);
				lutadorRepositoryActuallyatributes.setIdade(lutador, Idade4[cod4]);
				lutadorRepositoryActuallyatributes.setAltura(lutador, Altura4[cod4]);
				lutadorRepositoryActuallyatributes.setPeso(lutador, Peso4[cod4]);
				lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria4[cod4]);
				lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria4[cod4]);
				lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota4[cod4]);
				lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate4[cod4]);
				lutadorRepositoryActuallyatributes.setStatus(lutador, status4[cod4]);
		
				if (cod4 == lutadorRepositoryActuallyatributes.GetId(lutador)) {
				lutadorRepository.PerderLuta(lutador, lutadorRepositoryActuallyatributes);
				} else {
					System.out.println("");
					System.out.println("        Resultado da Pesquisa");
					System.out.println("--------------------------------------");
					System.out.println("Nenhum Lutador encontrado.");
					System.out.println("--------------------------------------");
				}
				break;
			case 5:
				System.out.println("");
				System.out.println("Digite o Código do Lutador:");
				System.out.println("");
				int cod5 = teclado.nextInt();
				
				int[] Codigo5 = new int[6];
				Codigo5[1] = 1;
				Codigo5[2] = 2;
				Codigo5[3] = 3;
				Codigo5[4] = 4;
				Codigo5[5] = 5;
				
				
				String[] Nome5 = new String[6];
				Nome5[1] = "João Rico";
				Nome5[2] = "Spider Nobre";
				Nome5[3] = "João Maçarico";
				Nome5[4] = "Rob Alicate";
				Nome5[5] = "Biu Rocha";
				
				
				String[] Nacionalidade5 = new String[6];
				Nacionalidade5[1] = "Português";
				Nacionalidade5[2] = "Mexicano";
				Nacionalidade5[3] = "Americano";
				Nacionalidade5[4] = "Brasileiro";
				Nacionalidade5[5] = "Brasileiro";
				
				
				int[] Idade5 = new int[6];
				Idade5[1] = 42;
				Idade5[2] = 28;
				Idade5[3] = 38;
				Idade5[4] = 35;
				Idade5[5] = 31;
				
				
				double[] Altura5 = new double[6];
				Altura5[1] = 1.93;
				Altura5[2] = 1.86;
				Altura5[3] = 1.82;
				Altura5[4] = 1.78;
				Altura5[5] = 1.81;
				
				
				double[] Peso5 = new double[6];
				Peso5[1] = 95.5;
				Peso5[2] = 108.3;
				Peso5[3] = 65.4;
				Peso5[4] = 73;
				Peso5[5] = 74;
				
				
				ECategoria[] Categoria5 = new ECategoria[6];
				Categoria5[1] = ECategoria.Pesado;
				Categoria5[2] = ECategoria.Pesado;
				Categoria5[3] = ECategoria.Medio;
				Categoria5[4] = ECategoria.Pesado;
				Categoria5[5] = ECategoria.Pesado;
				
				
				int[] Vitoria5 = new int[6];
				Vitoria5[1] = 108;
				Vitoria5[2] = 84;
				Vitoria5[3] = 203;
				Vitoria5[4] = 75;
				Vitoria5[5] = 56;
				
				
				int[] Derrota5 = new int[6];
				Derrota5[1] = 15;
				Derrota5[2] = 10;
				Derrota5[3] = 82;
				Derrota5[4] = 3;
				Derrota5[5] = 7;
				
				
				int[] Empate5 = new int[6];
				Empate5[1] = 10;
				Empate5[2] = 18;
				Empate5[3] = 53;
				Empate5[4] = 0;
				Empate5[5] = 0;
				
				
				EStatus[] status5 = new EStatus[6];
				status5[1] = EStatus.Aposentado;
				status5[2] = EStatus.Ativo;
				status5[3] = EStatus.Desclassificado;
				status5[4] = EStatus.Desclassificado;
				status5[5] = EStatus.Ativo;
				
				lutadorRepositoryActuallyatributes.setId(lutador, Codigo5[cod5]);
				lutadorRepositoryActuallyatributes.setNome(lutador, Nome5[cod5]);
				lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade5[cod5]);
				lutadorRepositoryActuallyatributes.setIdade(lutador, Idade5[cod5]);
				lutadorRepositoryActuallyatributes.setAltura(lutador, Altura5[cod5]);
				lutadorRepositoryActuallyatributes.setPeso(lutador, Peso5[cod5]);
				lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria5[cod5]);
				lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria5[cod5]);
				lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota5[cod5]);
				lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate5[cod5]);
				lutadorRepositoryActuallyatributes.setStatus(lutador, status5[cod5]);
		
				if (cod5 == lutadorRepositoryActuallyatributes.GetId(lutador)) {
				lutadorRepository.empatarLuta(lutador, lutadorRepositoryActuallyatributes);
				} else {
					System.out.println("");
					System.out.println("        Resultado da Pesquisa");
					System.out.println("--------------------------------------");
					System.out.println("Nenhum Lutador encontrado.");
					System.out.println("--------------------------------------");
				}
				break;
			case 6:
				System.out.println("");
				
				int[] Codigo6 = new int[6];
				Codigo6[1] = 1;
				Codigo6[2] = 2;
				Codigo6[3] = 3;
				Codigo6[4] = 4;
				Codigo6[5] = 5;
				
				
				String[] Nome6 = new String[6];
				Nome6[1] = "João Rico";
				Nome6[2] = "Spider Nobre";
				Nome6[3] = "João Maçarico";
				Nome6[4] = "Rob Alicate";
				Nome6[5] = "Biu Rocha";
				
				
				String[] Nacionalidade6 = new String[6];
				Nacionalidade6[1] = "Português";
				Nacionalidade6[2] = "Mexicano";
				Nacionalidade6[3] = "Americano";
				Nacionalidade6[4] = "Brasileiro";
				Nacionalidade6[5] = "Brasileiro";
				
				
				int[] Idade6 = new int[6];
				Idade6[1] = 42;
				Idade6[2] = 28;
				Idade6[3] = 38;
				Idade6[4] = 35;
				Idade6[5] = 31;
				
				
				double[] Altura6 = new double[6];
				Altura6[1] = 1.93;
				Altura6[2] = 1.86;
				Altura6[3] = 1.82;
				Altura6[4] = 1.78;
				Altura6[5] = 1.81;
				
				
				double[] Peso6 = new double[6];
				Peso6[1] = 95.5;
				Peso6[2] = 108.3;
				Peso6[3] = 65.4;
				Peso6[4] = 73;
				Peso6[5] = 74;
				
				
				ECategoria[] Categoria6 = new ECategoria[6];
				Categoria6[1] = ECategoria.Pesado;
				Categoria6[2] = ECategoria.Pesado;
				Categoria6[3] = ECategoria.Medio;
				Categoria6[4] = ECategoria.Pesado;
				Categoria6[5] = ECategoria.Pesado;
				
				
				int[] Vitoria6 = new int[6];
				Vitoria6[1] = 108;
				Vitoria6[2] = 84;
				Vitoria6[3] = 203;
				Vitoria6[4] = 75;
				Vitoria6[5] = 56;
				
				
				int[] Derrota6 = new int[6];
				Derrota6[1] = 15;
				Derrota6[2] = 10;
				Derrota6[3] = 82;
				Derrota6[4] = 3;
				Derrota6[5] = 7;
				
				
				int[] Empate6 = new int[6];
				Empate6[1] = 10;
				Empate6[2] = 18;
				Empate6[3] = 53;
				Empate6[4] = 0;
				Empate6[5] = 0;
				
				
				EStatus[] status6 = new EStatus[6];
				status6[1] = EStatus.Aposentado;
				status6[2] = EStatus.Ativo;
				status6[3] = EStatus.Desclassificado;
				status6[4] = EStatus.Desclassificado;
				status6[5] = EStatus.Ativo;
				
						lutadorRepository.listarTodosLutadores();
				
				break;
			case 7:
				
				System.out.println("");
				
				int[] Codigo7 = new int[6];
				Codigo7[1] = 1;
				Codigo7[2] = 2;
				Codigo7[3] = 3;
				Codigo7[4] = 4;
				Codigo7[5] = 5;
				
				
				String[] Nome7 = new String[6];
				Nome7[1] = "João Rico";
				Nome7[2] = "Spider Nobre";
				Nome7[3] = "João Maçarico";
				Nome7[4] = "Rob Alicate";
				Nome7[5] = "Biu Rocha";
				
				
				String[] Nacionalidade7 = new String[6];
				Nacionalidade7[1] = "Português";
				Nacionalidade7[2] = "Mexicano";
				Nacionalidade7[3] = "Americano";
				Nacionalidade7[4] = "Brasileiro";
				Nacionalidade7[5] = "Brasileiro";
				
				
				int[] Idade7 = new int[6];
				Idade7[1] = 42;
				Idade7[2] = 28;
				Idade7[3] = 38;
				Idade7[4] = 35;
				Idade7[5] = 31;
				
				
				double[] Altura7 = new double[6];
				Altura7[1] = 1.93;
				Altura7[2] = 1.86;
				Altura7[3] = 1.82;
				Altura7[4] = 1.78;
				Altura7[5] = 1.81;
				
				
				double[] Peso7 = new double[6];
				Peso7[1] = 95.5;
				Peso7[2] = 108.3;
				Peso7[3] = 65.4;
				Peso7[4] = 73;
				Peso7[5] = 74;
				
				
				ECategoria[] Categoria7 = new ECategoria[6];
				Categoria7[1] = ECategoria.Pesado;
				Categoria7[2] = ECategoria.Pesado;
				Categoria7[3] = ECategoria.Medio;
				Categoria7[4] = ECategoria.Pesado;
				Categoria7[5] = ECategoria.Pesado;
				
				
				int[] Vitoria7 = new int[6];
				Vitoria7[1] = 108;
				Vitoria7[2] = 84;
				Vitoria7[3] = 203;
				Vitoria7[4] = 75;
				Vitoria7[5] = 56;
				
				
				int[] Derrota7 = new int[6];
				Derrota7[1] = 15;
				Derrota7[2] = 10;
				Derrota7[3] = 82;
				Derrota7[4] = 3;
				Derrota7[5] = 7;
				
				
				int[] Empate7 = new int[6];
				Empate7[1] = 10;
				Empate7[2] = 18;
				Empate7[3] = 53;
				Empate7[4] = 0;
				Empate7[5] = 0;
				
				
				EStatus[] status7 = new EStatus[6];
				status7[1] = EStatus.Aposentado;
				status7[2] = EStatus.Ativo;
				status7[3] = EStatus.Desclassificado;
				status7[4] = EStatus.Desclassificado;
				status7[5] = EStatus.Ativo;
				
							lutadorRepository.listarVitorias();
				
				break;
			case 8:
				System.out.println("");
				
				int[] Codigo8 = new int[6];
				Codigo8[1] = 1;
				Codigo8[2] = 2;
				Codigo8[3] = 3;
				Codigo8[4] = 4;
				Codigo8[5] = 5;
				
				
				String[] Nome8 = new String[6];
				Nome8[1] = "João Rico";
				Nome8[2] = "Spider Nobre";
				Nome8[3] = "João Maçarico";
				Nome8[4] = "Rob Alicate";
				Nome8[5] = "Biu Rocha";
				
				
				String[] Nacionalidade8 = new String[6];
				Nacionalidade8[1] = "Português";
				Nacionalidade8[2] = "Mexicano";
				Nacionalidade8[3] = "Americano";
				Nacionalidade8[4] = "Brasileiro";
				Nacionalidade8[5] = "Brasileiro";
				
				
				int[] Idade8 = new int[6];
				Idade8[1] = 42;
				Idade8[2] = 28;
				Idade8[3] = 38;
				Idade8[4] = 35;
				Idade8[5] = 31;
				
				
				double[] Altura8 = new double[6];
				Altura8[1] = 1.93;
				Altura8[2] = 1.86;
				Altura8[3] = 1.82;
				Altura8[4] = 1.78;
				Altura8[5] = 1.81;
				
				
				double[] Peso8 = new double[6];
				Peso8[1] = 95.5;
				Peso8[2] = 108.3;
				Peso8[3] = 65.4;
				Peso8[4] = 73;
				Peso8[5] = 74;
				
				
				ECategoria[] Categoria8 = new ECategoria[6];
				Categoria8[1] = ECategoria.Pesado;
				Categoria8[2] = ECategoria.Pesado;
				Categoria8[3] = ECategoria.Medio;
				Categoria8[4] = ECategoria.Pesado;
				Categoria8[5] = ECategoria.Pesado;
				
				
				int[] Vitoria8 = new int[6];
				Vitoria8[1] = 108;
				Vitoria8[2] = 84;
				Vitoria8[3] = 203;
				Vitoria8[4] = 75;
				Vitoria8[5] = 56;
				
				
				int[] Derrota8 = new int[6];
				Derrota8[1] = 15;
				Derrota8[2] = 10;
				Derrota8[3] = 82;
				Derrota8[4] = 3;
				Derrota8[5] = 7;
				
				
				int[] Empate8 = new int[6];
				Empate8[1] = 10;
				Empate8[2] = 18;
				Empate8[3] = 53;
				Empate8[4] = 0;
				Empate8[5] = 0;
				
				
				EStatus[] status8 = new EStatus[6];
				status8[1] = EStatus.Aposentado;
				status8[2] = EStatus.Ativo;
				status8[3] = EStatus.Desclassificado;
				status8[4] = EStatus.Desclassificado;
				status8[5] = EStatus.Ativo;
				
						
				lutadorRepository.listarDerrotas();
				
				break;
			case 9:
				
				System.out.println("");
				
				int[] Codigo9 = new int[6];
				Codigo9[1] = 1;
				Codigo9[2] = 2;
				Codigo9[3] = 3;
				Codigo9[4] = 4;
				Codigo9[5] = 5;
				
				
				String[] Nome9 = new String[6];
				Nome9[1] = "João Rico";
				Nome9[2] = "Spider Nobre";
				Nome9[3] = "João Maçarico";
				Nome9[4] = "Rob Alicate";
				Nome9[5] = "Biu Rocha";
				
				
				String[] Nacionalidade9 = new String[6];
				Nacionalidade9[1] = "Português";
				Nacionalidade9[2] = "Mexicano";
				Nacionalidade9[3] = "Americano";
				Nacionalidade9[4] = "Brasileiro";
				Nacionalidade9[5] = "Brasileiro";
				
				
				int[] Idade9 = new int[6];
				Idade9[1] = 42;
				Idade9[2] = 28;
				Idade9[3] = 38;
				Idade9[4] = 35;
				Idade9[5] = 31;
				
				
				double[] Altura9 = new double[6];
				Altura9[1] = 1.93;
				Altura9[2] = 1.86;
				Altura9[3] = 1.82;
				Altura9[4] = 1.78;
				Altura9[5] = 1.81;
				
				
				double[] Peso9 = new double[6];
				Peso9[1] = 95.5;
				Peso9[2] = 108.3;
				Peso9[3] = 65.4;
				Peso9[4] = 73;
				Peso9[5] = 74;
				
				
				ECategoria[] Categoria9 = new ECategoria[6];
				Categoria9[1] = ECategoria.Pesado;
				Categoria9[2] = ECategoria.Pesado;
				Categoria9[3] = ECategoria.Medio;
				Categoria9[4] = ECategoria.Pesado;
				Categoria9[5] = ECategoria.Pesado;
				
				
				int[] Vitoria9 = new int[6];
				Vitoria9[1] = 108;
				Vitoria9[2] = 84;
				Vitoria9[3] = 203;
				Vitoria9[4] = 75;
				Vitoria9[5] = 56;
				
				
				int[] Derrota9 = new int[6];
				Derrota9[1] = 15;
				Derrota9[2] = 10;
				Derrota9[3] = 82;
				Derrota9[4] = 3;
				Derrota9[5] = 7;
				
				
				int[] Empate9 = new int[6];
				Empate9[1] = 10;
				Empate9[2] = 18;
				Empate9[3] = 53;
				Empate9[4] = 0;
				Empate9[5] = 0;
				
				
				EStatus[] status9 = new EStatus[6];
				status9[1] = EStatus.Aposentado;
				status9[2] = EStatus.Ativo;
				status9[3] = EStatus.Desclassificado;
				status9[4] = EStatus.Desclassificado;
				status9[5] = EStatus.Ativo;
				
							lutadorRepository.listarEmpates();
				

				break;
				
			default:
				System.out.println("");
				System.out.println("        Resultado da Pesquisa");
				System.out.println("--------------------------------------");
				System.out.println("Por favor, digite a opção informada.");
				System.out.println("--------------------------------------");
			

				break;
			}
			
		} catch (Exception e) {
			System.out.println("");
			System.out.println("        Resultado da Pesquisa");
			System.out.println("--------------------------------------");
			System.out.println("Erro de processamento: " + e.getMessage());
			System.out.println("--------------------------------------");
		}
	}
}
