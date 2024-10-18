package jogo_castelos;

import java.util.LinkedList;

public class JogoMain {

	public static void main(String[] args) {
		
		LinkedList<Castelo> vet = new LinkedList<Castelo>();

		// Criando Castelos
		Japoneses j1 = new Japoneses(2, 2, "Japones 1", 15);
		Japoneses j2 = new Japoneses(2, 2, "Japones 2", 15);
		Europeu e1 = new Europeu(3,2, "Europeu 1", 10);
		Europeu e2 = new Europeu(3,2, "Europeu 2", 10);
		
		vet.add(j1);
		vet.add(j2);
		vet.add(e1);
		vet.add(e2);
		
		// Acaba quando restar apenas 1 castelo
		while(vet.size() > 1) {
			
			for(int i = 0; i < vet.size(); i++) {
				Castelo casteloDaVez, casteloAlvo;
			
				casteloDaVez = vet.get(i);
				System.out.println("========= Vez do castelo: " + casteloDaVez.getNome() + " =========");
				
				// Escolhe aleatoriamente o castelo alvo garantindo que nao ataque o proprio castelo
				do {
					casteloAlvo = vet.get((int) (Math.random() * vet.size()));
				} while(casteloAlvo == casteloDaVez);
				
				System.out.println("-> Castelo Alvo Escolhido: " + casteloAlvo.getNome());
				System.out.println("\n   Sorteando numero...");
				
				// Sorteia o número de 0 a 10
				int numSorteado = (int) (Math.random() * 11);
				System.out.println("\n-> Numero Sorteado: " + numSorteado);
				
				if(numSorteado == 0) {
					System.out.println("\n_______ Passou a vez! _______\n");
				} else {
					System.out.println("\n   Gerando dados pós ataque...");
					
					if(casteloAlvo.ataque(numSorteado)) {
						System.out.println("\n" + casteloAlvo.situacao() + "\n");
					} else {
						System.out.println("\n" + casteloAlvo.situacao() + "\n");
						System.out.println(">>>>>>> CASTELO " + casteloAlvo.getNome() + " DESTRUIDO <<<<<<<\n");
						vet.remove(casteloAlvo);
					}
				}
			
			}
			
		}
		
		System.out.println("--------------- FIM DE JOGO ---------------\n"
				+ "\n===> CASTELO " + vet.getFirst().getNome() + " VENCEDOR <===\n");
		
	}
	
}
