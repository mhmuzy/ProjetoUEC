package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Classes.Lutador;
import Hitss.Treinamento.Enums.ECategoria;
import Hitss.Treinamento.Enums.EStatus;
import Hitss.Treinamento.Infra.ILutadorRepository;

public class LutadorRepository implements ILutadorRepository {

	public void Apresentar(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes) { 
		
		System.out.println("");
		System.out.println("          Dados do Lutador");
		System.out.println("------------------------------------");
		System.out.println("Código do Lutador: " + lutadorRepositoryActuallyatributes.GetId(lutador));
		System.out.println("Nome do Lutador: " + lutadorRepositoryActuallyatributes.getNome(lutador));
		System.out.println("Nacionalidade do Lutador: " + lutadorRepositoryActuallyatributes.getNacionalidade(lutador));
		System.out.println("Idade do Lutador: " + lutadorRepositoryActuallyatributes.getIdade(lutador) + " anos");
		System.out.println("Altura do Lutador: " + lutadorRepositoryActuallyatributes.getAltura(lutador) + " m");
		System.out.println("Peso do Lutador: " + lutadorRepositoryActuallyatributes.getPeso(lutador) + " kg");
		System.out.println("Categoria do Lutador: " + lutadorRepositoryActuallyatributes.getCategoria(lutador));
		System.out.println("Vitórias: " + lutadorRepositoryActuallyatributes.getVitorias(lutador));
		System.out.println("Derrotas: " + lutadorRepositoryActuallyatributes.getDerrotas(lutador));
		System.out.println("Empates: " + lutadorRepositoryActuallyatributes.getEmpates(lutador));
		System.out.println("Status do Lutador: " + lutadorRepositoryActuallyatributes.getStatus(lutador));
		System.out.println("------------------------------------");
	}
	
	public void Status(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes) {
		System.out.println("");
		System.out.println("         Resultado da Pesquisa");
		System.out.println("-------------------------------------");
		System.out.println("O Lutador " + lutadorRepositoryActuallyatributes.getNome(lutador) + " está " + lutadorRepositoryActuallyatributes.getStatus(lutador));
		System.out.println("-------------------------------------");
	}
	
	public void GanharLutar(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes) {
		System.out.println("");
		System.out.println("         Resultado da Pesquisa");
		System.out.println("---------------------------------------");
		System.out.println("O Lutador " + lutadorRepositoryActuallyatributes.getNome(lutador) + " ganhou " + lutadorRepositoryActuallyatributes.getVitorias(lutador) + " luta(s)");
		System.out.println("---------------------------------------");
	}
	
	public void PerderLuta(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes) {
		System.out.println("");
		System.out.println("         Resultado da Pesquisa");
		System.out.println("---------------------------------------");
		System.out.println("O Lutador " + lutadorRepositoryActuallyatributes.getNome(lutador) + " perdeu " + lutadorRepositoryActuallyatributes.getDerrotas(lutador) + " luta(s)");
		System.out.println("---------------------------------------");
	}
	
	public void empatarLuta(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes) {
		System.out.println("");
		System.out.println("         Resultado da Pesquisa");
		System.out.println("---------------------------------------");
		System.out.println("O Lutador " + lutadorRepositoryActuallyatributes.getNome(lutador) + " empatou " + lutadorRepositoryActuallyatributes.getDerrotas(lutador) + " luta(s)");
		System.out.println("---------------------------------------");
	}
	
	public void listarTodosLutadores() {
		
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
		
		System.out.println("");
		System.out.println("         Lista de todos os Lutadores");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for (int i = 1; i < 5; i++) {
			
			Lutador lutador = new Lutador();
			
			LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes = new LutadorRepositoryActuallyatributes();
			lutadorRepositoryActuallyatributes.setId(lutador, Codigo[i]);
			lutadorRepositoryActuallyatributes.setNome(lutador, Nome[i]);
			lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade[i]);
			lutadorRepositoryActuallyatributes.setIdade(lutador, Idade[i]);
			lutadorRepositoryActuallyatributes.setAltura(lutador, Altura[i]);
			lutadorRepositoryActuallyatributes.setPeso(lutador, Peso[i]);
			lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria[i]);
			lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria[i]);
			lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota[i]);
			lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate[i]);
			lutadorRepositoryActuallyatributes.setStatus(lutador, status[i]);
			
			System.out.println("Código do Lutador: " + i + ", Nome do Lutador: " + lutadorRepositoryActuallyatributes.getNome(lutador) + ", Nacionalidade do Lutador: " +  lutadorRepositoryActuallyatributes.getNacionalidade(lutador) + ", Idade: " + lutadorRepositoryActuallyatributes.getIdade(lutador) + ", Altura: " + lutadorRepositoryActuallyatributes.getAltura(lutador) + "m, Peso: " + lutadorRepositoryActuallyatributes.getPeso(lutador) + "Kg, Catgeoria: " + lutadorRepositoryActuallyatributes.getCategoria(lutador) + ", Vitórias: " + lutadorRepositoryActuallyatributes.getVitorias(lutador) + ", Derrotas: " + lutadorRepositoryActuallyatributes.getDerrotas(lutador) + ", Empates: " + lutadorRepositoryActuallyatributes.getEmpates(lutador) + ", Status do Lutador: " + lutadorRepositoryActuallyatributes.getStatus(lutador));
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void listarVitorias() {
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
		
		System.out.println("");
		System.out.println("         Lista de todos os Lutadores");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for (int i = 1; i < 5; i++) {
			
			Lutador lutador = new Lutador();
			
			LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes = new LutadorRepositoryActuallyatributes();
			lutadorRepositoryActuallyatributes.setId(lutador, Codigo[i]);
			lutadorRepositoryActuallyatributes.setNome(lutador, Nome[i]);
			lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade[i]);
			lutadorRepositoryActuallyatributes.setIdade(lutador, Idade[i]);
			lutadorRepositoryActuallyatributes.setAltura(lutador, Altura[i]);
			lutadorRepositoryActuallyatributes.setPeso(lutador, Peso[i]);
			lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria[i]);
			lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria[i]);
			lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota[i]);
			lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate[i]);
			lutadorRepositoryActuallyatributes.setStatus(lutador, status[i]);
			
			System.out.println("Código do Lutador: " + i + ", Nome do Lutador: " + lutadorRepositoryActuallyatributes.getNome(lutador) + ", Vitórias: " + lutadorRepositoryActuallyatributes.getVitorias(lutador) );
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void listarDerrotas() {
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
		
		System.out.println("");
		System.out.println("         Lista de todos os Lutadores");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for (int i = 1; i < 5; i++) {
			
			Lutador lutador = new Lutador();
			
			LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes = new LutadorRepositoryActuallyatributes();
			lutadorRepositoryActuallyatributes.setId(lutador, Codigo[i]);
			lutadorRepositoryActuallyatributes.setNome(lutador, Nome[i]);
			lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade[i]);
			lutadorRepositoryActuallyatributes.setIdade(lutador, Idade[i]);
			lutadorRepositoryActuallyatributes.setAltura(lutador, Altura[i]);
			lutadorRepositoryActuallyatributes.setPeso(lutador, Peso[i]);
			lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria[i]);
			lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria[i]);
			lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota[i]);
			lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate[i]);
			lutadorRepositoryActuallyatributes.setStatus(lutador, status[i]);
			
			System.out.println("Código do Lutador: " + i + ", Nome do Lutador: " + lutadorRepositoryActuallyatributes.getNome(lutador) + ", Derrotas: " + lutadorRepositoryActuallyatributes.getDerrotas(lutador));
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void listarEmpates() {
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
		
		System.out.println("");
		System.out.println("         Lista de todos os Lutadores");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for (int i = 1; i < 5; i++) {
			
			Lutador lutador = new Lutador();
			
			LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes = new LutadorRepositoryActuallyatributes();
			lutadorRepositoryActuallyatributes.setId(lutador, Codigo[i]);
			lutadorRepositoryActuallyatributes.setNome(lutador, Nome[i]);
			lutadorRepositoryActuallyatributes.setNacionalidade(lutador, Nacionalidade[i]);
			lutadorRepositoryActuallyatributes.setIdade(lutador, Idade[i]);
			lutadorRepositoryActuallyatributes.setAltura(lutador, Altura[i]);
			lutadorRepositoryActuallyatributes.setPeso(lutador, Peso[i]);
			lutadorRepositoryActuallyatributes.setCategoria(lutador, Categoria[i]);
			lutadorRepositoryActuallyatributes.setVitorias(lutador, Vitoria[i]);
			lutadorRepositoryActuallyatributes.setDerrotas(lutador, Derrota[i]);
			lutadorRepositoryActuallyatributes.setEmpates(lutador, Empate[i]);
			lutadorRepositoryActuallyatributes.setStatus(lutador, status[i]);
			
			System.out.println("Código do Lutador: " + i + ", Nome do Lutador: " + lutadorRepositoryActuallyatributes.getNome(lutador) + ", Empates: " + lutadorRepositoryActuallyatributes.getEmpates(lutador));
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}


