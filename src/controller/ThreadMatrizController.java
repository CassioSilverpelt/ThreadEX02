package controller;

public class ThreadMatrizController extends Thread {
	int[] vetor = new int[5];
	int tamanho = vetor.length;
	int linha;
	
	public ThreadMatrizController(int[] vetor, int tamanho, int linha) {
		this.vetor = vetor;
		this.tamanho = tamanho;
		this.linha = linha;
	}

	@Override
	public void run() {
		
		soma();
		
	}

	private void soma() {
		int soma = 0;
		for (int i = 0; i < tamanho; i++) {
			soma = soma + vetor[i];
		}
		System.out.println("Linha " + linha + ": " + soma);
	}
	
	
	
}
