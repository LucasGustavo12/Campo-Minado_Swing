package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Temp {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
		
		tabuleiro.registrarObservador(e -> {
			if(e.isGanhou()) {
				System.out.println("ganhou: :)");
			}else {
				System.out.println("perdeu :c");
			}
		});
		tabuleiro.abrir(0, 0);
		tabuleiro.abrir(0, 1);
		tabuleiro.abrir(0, 2);
		tabuleiro.abrir(1, 0);
		tabuleiro.abrir(1, 1);
		tabuleiro.abrir(1, 2);
		tabuleiro.abrir(2, 0);
		tabuleiro.abrir(2, 1);
		
		//tabuleiro.abrir(2, 2);

	}

}
