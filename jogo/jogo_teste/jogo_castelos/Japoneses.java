package jogo_castelos;

public class Japoneses extends Castelo{
	
	protected int numSamurai;
	
	public Japoneses(int defesa, int pontosVida, String nome, int numSamurai) {
		super(defesa, pontosVida, nome);
		this.numSamurai = numSamurai;
	}
	
	public int getNumSamurai() {
		return this.numSamurai;
	}
	
	public boolean ataque(double d) {
		this.numSamurai -= d;
		if(this.numSamurai < 0) {
			boolean atacou = super.ataque(d);
			if(atacou) {
				this.numSamurai += 15;
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public String situacao() {
		return super.situacao() +
				"\n| Quantidade de Samurais: " + this.numSamurai;
	}
	
}
