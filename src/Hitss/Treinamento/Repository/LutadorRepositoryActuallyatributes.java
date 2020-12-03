package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Enums.ECategoria;
import Hitss.Treinamento.Enums.EStatus;
import Hitss.Treinamento.Classes.Lutador;

public class LutadorRepositoryActuallyatributes {

	public int GetId(Lutador lutador) {
		return lutador.id;
	}

	public void setId(Lutador lutador, int id) {
		lutador.id = id;
	}
	
	public String getNome(Lutador lutador) {
		return lutador.nome;
	}
	public void setNome(Lutador lutador, String nome) {
		lutador.nome = nome;
	}
	public String getNacionalidade(Lutador lutador) {
		return lutador.nacionalidade;
	}
	public void setNacionalidade(Lutador lutador, String nacionalidade) {
		lutador.nacionalidade = nacionalidade;
	}
	public int getIdade(Lutador lutador) {
		return lutador.idade;
	}
	public void setIdade(Lutador lutador, int idade) {
		lutador.idade = idade;
	}
	public double getAltura(Lutador lutador) {
		return lutador.altura;
	}
	public void setAltura(Lutador lutador, double altura) {
		lutador.altura = altura;
	}
	public double getPeso(Lutador lutador) {
		return lutador.peso;
	}
	public void setPeso(Lutador lutador, double peso) {
		lutador.peso = peso;
	}
	public ECategoria getCategoria(Lutador lutador) {
		return lutador.categoria;
	}
	public void setCategoria(Lutador lutador, ECategoria categoria) {
		lutador.categoria = categoria;
	}
	public int getVitorias(Lutador lutador) {
		return lutador.vitorias;
	}
	public void setVitorias(Lutador lutador, int vitorias) {
		lutador.vitorias = vitorias;
	}
	public int getDerrotas(Lutador lutador) {
		return lutador.derrotas;
	}
	public void setDerrotas(Lutador lutador, int derrotas) {
		lutador.derrotas = derrotas;
	}
	public int getEmpates(Lutador lutador) {
		return lutador.empates;
	}
	public void setEmpates(Lutador lutador, int empates) {
		lutador.empates = empates;
	}
	
	public EStatus getStatus(Lutador lutador) {
		return lutador.status;
	}
	
	public void setStatus(Lutador lutador, EStatus status) {
		lutador.status = status;
	}
}
