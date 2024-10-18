package jogo_castelos;

//	2) Implementar um aplicativo que crie 2 castelos japoneses (com 15 samurais, 2 vidas e 2
//	defesas) e 2 europeus (com 10 paladinos, 2 vidas e 3 defesas), armazene-os em uma
//	lista.

//	Jogar até que 3 castelos sejam destruídos.
//	O mecanismo do jogo é:
//	1. O primeiro castelo da lista (por exemplo C1) escolhe outro castelo (Por exemplo C2)
//	para atacar (você pode pedir para o usuário ou escolher de modo aleatório)
//	2. Ele sorteia um número de 0 a 10. Se tirar zero, ele passa a vez. Caso contrário, C1
//	destrói essa quantidade de guerreiros de C2. Em seguida, mostra na tela a
//	situação do castelo C2.
//	3. Agora é a vez do segundo castelo jogar. Ele deve escolher outro castelo para atacar
//	e voltar ao passo 2.
//	4. Após o último castelo da lista jogar, a vez volta para o primeiro castelo.

//	Quando um castelo for completamente destruído, deve mostrar na tela a situação dele e a
//	mensagem “CASTELO ___ DESTRUÍDO”, então ele é retirado da lista. O jogo acaba
//	quando sobrar apenas um castelo na lista, que será o vencedor e mostrará na tela
//	“CASTELO ___ VENCEDOR”

import java.util.LinkedList;

public class JogoMain {

	public static void main(String[] args) {
		
		LinkedList<Castelo> vet = new LinkedList<Castelo>();
		
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
