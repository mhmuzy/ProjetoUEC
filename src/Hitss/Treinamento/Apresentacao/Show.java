package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Controller.LutadorController; /// *** Importando

public class Show {
	public static void main(String[] args) {
		
		LutadorController lutadorController = new LutadorController(); /// *** Inst�ncia da Controller Lutador
		lutadorController.Reproduzir(); /// *** Reproduzir a Controller do Lutador
	}
}
