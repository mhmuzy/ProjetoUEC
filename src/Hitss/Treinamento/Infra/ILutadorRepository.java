package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classes.Lutador;
import Hitss.Treinamento.Enums.ECategoria;
import Hitss.Treinamento.Enums.EStatus;
import Hitss.Treinamento.Repository.LutadorRepositoryActuallyatributes;


public interface ILutadorRepository {

	void Apresentar(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes);
	void Status(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes);
	void GanharLutar(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes);
	void PerderLuta(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes);
	void empatarLuta(Lutador lutador, LutadorRepositoryActuallyatributes lutadorRepositoryActuallyatributes);
	void listarTodosLutadores();
	void listarVitorias();
	void listarDerrotas();
	void listarEmpates();
}
