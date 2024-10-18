package jogo_castelos;

public class Europeu extends Castelo{
	
	protected int numPaladino;

	public Europeu(int defesa, int pontosVida, String nome, int numPaladino) {
		super(defesa, pontosVida, nome);
		this.numPaladino = numPaladino;
	}

	public int getNumPaladino() {
		return numPaladino;
	}

	public boolean ataque(double d) {
		this.numPaladino -= d;
		if(this.numPaladino < 0) {
			boolean atacou = super.ataque(d);
			if(atacou) {
				this.numPaladino += 10;
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public String situacao() {
		return super.situacao() +
				"\n| Quantidade de Paladinos: " + this.numPaladino;
	}
	
}
