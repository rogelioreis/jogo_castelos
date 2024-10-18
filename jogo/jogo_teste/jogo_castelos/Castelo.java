package jogo_castelos;

public abstract class Castelo {
	
	protected int defesa;
	protected int pontosVida;
	protected String nome;
	
	public Castelo(int defesa, int pontosVida, String nome) {
		this.defesa = defesa;
		this.pontosVida = pontosVida;
		this.nome = nome;
	}
	
	public int getDefesa() {
		return defesa;
	}
	
	public int getPontosVida() {
		return pontosVida;
	}

	public String getNome() {
		return nome;
	}

	public boolean ataque(double d) {
		if(this.defesa > 0) {
			this.defesa--;
			return true;
		} else if(this.pontosVida > 0) {
			this.pontosVida--;
			this.defesa = 2;
			return true;
		} else {
			return false;
		}
	}
	
	public String situacao() {
		return "| Nome: " + this.nome +
				"\n| Defesa: " + this.defesa +
				"\n| Pontos de Vida: " + this.pontosVida;
	}

}
