package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCarrinho;

public class Cruzamento {

	public static void main(String[] args) {
		String[] direcoes = {"norte", "leste", "oeste", "sul"};
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(String dir: direcoes){
			Thread tCarrinho = new ThreadCarrinho(dir,semaforo);
			tCarrinho.start();
		}

	}

}
