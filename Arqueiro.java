package arena_dos_herois;

public class Arqueiro extends Personagem {
	
	public Arqueiro (String nome) {
		super (nome,80,20); // Menos vida, mas ataque à distancia
	}

	@Override
	public void atacar (Personagem oponente) {
		oponente.receberDano(this.getDanoBase()); 
		System.out.println(getNome() + " disparou uma flecha em  " + oponente.getNome() + " à distância.");

	}
}
