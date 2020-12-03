package Hitss.Treinamento.Controller;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import Hitss.Treinamento.Repository.LutadorRepository;
import Hitss.Treinamento.Classes.Lutador;
import Hitss.Treinamento.Enums.ECategoria;
import Hitss.Treinamento.Enums.EStatus;
import Hitss.Treinamento.Repository.LutadorRepositoryActuallyatributes;

public class LutadorController {

	public void Reproduzir() {
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		System.out.println("Selecione a opção desejada:");
		System.out.println("(1) - Apresentar Lutador");
		System.out.println("(2) - Verificar o Status do Lutador");
		System.out.println("(3) - Verificar o Número de Vitórias do Lutador");
		System.out.println("(4) - Verificar o Número de Perdas do Lutador");
		System.out.println("(5) - Verificar o Número de Empates do Lutador");
		System.out.println("(6) - Listar todos os Lutadores");
		System.out.println("(7) - Listar todas as Vitórias de Todos os Lutadores");
		System.out.println("(8) - Listar todas as Derrotas de Todos os Lutadores");
		System.out.println("(9) - Listar todos os Empates de Todos os Lutadores");
		System.out.println("");
		try {
			
			Scanner teclado = new Scanner(System.in);
			
			int opcao = teclado.nextInt();
			
			System.out.println("");
			
			LutadorRepository lutadorRepository = new LutadorRepository();
			
			Lutador lutador = new Lutador();
			
			LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes = new LutadorRepositoryActuallyatributes();
			
			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("Digite o Código do Lutador:");
				System.out.println("");
				int cod = teclado.nextInt();
				
				int[] Codigo = new int[6];
				Codigo[1] = 1;
				Codigo[2] = 2;
				Codigo[3] = 3;
				Codigo[4] = 4;
				Codigo[5] = 5;
				
				
				String[] Nome = new String[6];
				Nome[1] = "João Rico";
				Nome[2] = "Spider Nobre";
				Nome[3] = "João Maçarico";
				Nome[4] = "Rob Alicate";
				Nome[5] = "Biu Rocha";
				
				
				String[] Nacionalidade = new String[6];
				Nacionalidade[1] = "Português";
				Nacionalidade[2] = "Mexicano";
				Nacionalidade[3] = "Americano";
				Nacionalidade[4] = "Brasileiro";
				Nacionalidade[5] = "Brasileiro";
				
				
				int[] Idade = new int[6];
				Idade[1] = 42;
				Idade[2] = 28;
				Idade[3] = 38;
				Idade[4] = 35;
				Idade[5] = 31;
				
				
				double[] Altura = new double[6];
				Altura[1] = 1.93;
				Altura[2] = 1.86;
				Altura[3] = 1.82;
				Altura[4] = 1.78;
				Altura[5] = 1.81;
				
				
				double[] Peso = new double[6];
				Peso[1] = 95.5;
				Peso[2] = 108.3;
				Peso[3] = 65.4;
				Peso[4] = 73;
				Peso[5] = 74;
				
				
				ECategoria[] Categoria = new ECategoria[6];
				Categoria[1] = ECategoria.Pesado;
				Categoria[2] = ECategoria.Pesado;
				Categoria[3] = ECategoria.Medio;
				Categoria[4] = ECategoria.Pesado;
				Categoria[5] = ECategoria.Pesado;
				
				
				int[] Vitoria = new int[6];
				Vitoria[1] = 108;
				Vitoria[2] = 84;
				Vitoria[3] = 203;
				Vitoria[4] = 75;
				Vitoria[5] = 56;
				
				
				int[] Derrota = new int[6];
				Derrota[1] = 15;
				Derrota[2] = 10;
				Derrota[3] = 82;
				Derrota[4] = 3;
				Derrota[5] = 7;
				
				
				int[] Empate = new int[6];
				Empate[1] = 10;
				Empate[2] = 18;
				Empate[3] = 53;
				Empate[4] = 0;
				Empate[5] = 0;
				
				
				EStatus[] status = new EStatus[6];
				status[1] = EStatus.Aposentado;
				status[2] = EStatus.Ativo;
				status[3] = EStatus.Desclassificado;
				status[4] = EStatus.Desclassificado;
				status[5] = EStatus.Ativo;
				
				lutadorRepositoryActuallyatributes.setId(lutador, Codigo[cod]);
				lutadorRepositoryActuallyatributes.setNome(lutador, Nome[cod]);
				lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade[cod]);
				lutadorRepositoryActuallyatributes.setIdade(lutador, Idade[cod]);
				lutadorRepositoryActuallyatributes.setAltura(lutador, Altura[cod]);
				lutadorRepositoryActuallyatributes.setPeso(lutador, Peso[cod]);
				lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria[cod]);
				lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria[cod]);
				lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota[cod]);
				lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate[cod]);
				lutadorRepositoryActuallyatributes.setStatus(lutador, status[cod]);
		
				if (cod == lutadorRepositoryActuallyatributes.GetId(lutador)) {
					lutadorRepository.Apresentar(lutador, lutadorRepositoryActuallyatributes);
				} else {
					System.out.println("");
					System.out.println("        Resultado da Pesquisa");
					System.out.println("--------------------------------------");
					System.out.println("Nenhum Lutador encontrado.");
					System.out.println("--------------------------------------");
				}
				

				break;
			case 2:
				System.out.println("");
				System.out.println("Digite o Código do Lutador:");
				System.out.println("");
				int cod2 = teclado.nextInt();
				
				int[] Codigo2 = new int[6];
				Codigo2[1] = 1;
				Codigo2[2] = 2;
				Codigo2[3] = 3;
				Codigo2[4] = 4;
				Codigo2[5] = 5;
				
				
				String[] Nome2 = new String[6];
				Nome2[1] = "João Rico";
				Nome2[2] = "Spider Nobre";
				Nome2[3] = "João Maçarico";
				Nome2[4] = "Rob Alicate";
				Nome2[5] = "Biu Rocha";
				
				
				String[] Nacionalidade2 = new String[6];
				Nacionalidade2[1] = "Português";
				Nacionalidade2[2] = "Mexicano";
				Nacionalidade2[3] = "Americano";
				Nacionalidade2[4] = "Brasileiro";
				Nacionalidade2[5] = "Brasileiro";
				
				
				int[] Idade2 = new int[6];
				Idade2[1] = 42;
				Idade2[2] = 28;
				Idade2[3] = 38;
				Idade2[4] = 35;
				Idade2[5] = 31;
				
				
				double[] Altura2 = new double[6];
				Altura2[1] = 1.93;
				Altura2[2] = 1.86;
				Altura2[3] = 1.82;
				Altura2[4] = 1.78;
				Altura2[5] = 1.81;
				
				
				double[] Peso2 = new double[6];
				Peso2[1] = 95.5;
				Peso2[2] = 108.3;
				Peso2[3] = 65.4;
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
				lutadorRepository.PerderLuta(lutador, lutadorRepositoryActuallyatributes);
				break;
			case 5:
				lutadorRepository.empatarLuta(lutador, lutadorRepositoryActuallyatributes);
				break;
			case 6:
				lutadorRepository.listarTodosLutadores();
				break;
			case 7:
			default:
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
